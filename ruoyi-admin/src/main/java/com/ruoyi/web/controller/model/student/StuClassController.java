package com.ruoyi.web.controller.model.student;

import java.util.List;

import com.ruoyi.system.domain.stu.StuClass;
import com.ruoyi.system.service.IStuClassService;
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
 * 班级Controller
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Controller
@RequestMapping("/model/class")
public class StuClassController extends BaseController
{
    private String prefix = "model/class";

    @Autowired
    private IStuClassService stuClassService;

    @RequiresPermissions("model:class:view")
    @GetMapping()
    public String classGrade()
    {
        return prefix + "/class";
    }

    /**
     * 查询班级列表
     */
    @RequiresPermissions("model:class:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StuClass stuClass)
    {
        startPage();
        List<StuClass> list = stuClassService.selectStuClassList(stuClass);
        return getDataTable(list);
    }

    /**
     * 导出班级列表
     */
    @RequiresPermissions("model:class:export")
    @Log(title = "班级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StuClass stuClass)
    {
        List<StuClass> list = stuClassService.selectStuClassList(stuClass);
        ExcelUtil<StuClass> util = new ExcelUtil<StuClass>(StuClass.class);
        return util.exportExcel(list, "班级数据");
    }

    /**
     * 新增班级
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存班级
     */
    @RequiresPermissions("model:class:add")
    @Log(title = "班级", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StuClass stuClass)
    {
        return toAjax(stuClassService.insertStuClass(stuClass));
    }

    /**
     * 修改班级
     */
    @RequiresPermissions("model:class:edit")
    @GetMapping("/edit/{cid}")
    public String edit(@PathVariable("cid") Long cid, ModelMap mmap)
    {
        StuClass stuClass = stuClassService.selectStuClassByCid(cid);
        mmap.put("stuClass", stuClass);
        return prefix + "/edit";
    }

    /**
     * 修改保存班级
     */
    @RequiresPermissions("model:class:edit")
    @Log(title = "班级", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StuClass stuClass)
    {
        return toAjax(stuClassService.updateStuClass(stuClass));
    }

    /**
     * 删除班级
     */
    @RequiresPermissions("model:class:remove")
    @Log(title = "班级", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stuClassService.deleteStuClassByCids(ids));
    }
}
