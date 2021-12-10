package com.ruoyi.web.controller.model.student;

import java.util.List;

import com.ruoyi.system.domain.stu.StuFile;
import com.ruoyi.system.service.IStuFileService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生档案Controller
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Controller
@RequestMapping("/model/file")
public class StuFileController extends BaseController
{
    private String prefix = "model/file";

    @Autowired
    private IStuFileService stuFileService;

    @RequiresPermissions("model:file:view")
    @GetMapping()
    public String file()
    {
        return prefix + "/file";
    }

    /**
     * 查询学生档案列表
     */
    @RequiresPermissions("model:file:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StuFile stuFile)
    {
        startPage();
        List<StuFile> list = stuFileService.selectStuFileList(stuFile);
        return getDataTable(list);
    }

    /**
     * 导出学生档案列表
     */
    @RequiresPermissions("model:file:export")
    @Log(title = "学生档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StuFile stuFile)
    {
        List<StuFile> list = stuFileService.selectStuFileList(stuFile);
        ExcelUtil<StuFile> util = new ExcelUtil<StuFile>(StuFile.class);
        return util.exportExcel(list, "学生档案数据");
    }

    /**
     * 新增学生档案
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生档案
     */
    @RequiresPermissions("model:file:add")
    @Log(title = "学生档案", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StuFile stuFile)
    {
        return toAjax(stuFileService.insertStuFile(stuFile));
    }

    /**
     * 修改学生档案
     */
    @RequiresPermissions("model:file:edit")
    @GetMapping("/edit/{fid}")
    public String edit(@PathVariable("fid") Long fid, ModelMap mmap)
    {
        System.out.println(fid);
        StuFile stuFile = stuFileService.selectStuFileByFid(fid);
        mmap.put("stuFile", stuFile);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生档案
     */
    @RequiresPermissions("model:file:edit")
    @Log(title = "学生档案", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StuFile stuFile)
    {
        return toAjax(stuFileService.updateStuFile(stuFile));
    }

    /**
     * 删除学生档案
     */
    @RequiresPermissions("model:file:remove")
    @Log(title = "学生档案", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stuFileService.deleteStuFileByFids(ids));
    }
}
