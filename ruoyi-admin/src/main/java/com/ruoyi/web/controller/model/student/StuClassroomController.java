package com.ruoyi.web.controller.model.student;

import java.util.List;

import com.ruoyi.system.domain.stu.StuClassroom;
import com.ruoyi.system.service.IStuClassroomService;
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
 * 教室Controller
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Controller
@RequestMapping("/model/classroom")
public class StuClassroomController extends BaseController
{
    private String prefix = "model/classroom";

    @Autowired
    private IStuClassroomService stuClassroomService;

    @RequiresPermissions("model:classroom:view")
    @GetMapping()
    public String classroom()
    {
        return prefix + "/classroom";
    }

    /**
     * 查询教室列表
     */
    @RequiresPermissions("model:classroom:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StuClassroom stuClassroom)
    {
        startPage();
        List<StuClassroom> list = stuClassroomService.selectStuClassroomList(stuClassroom);
        return getDataTable(list);
    }

    /**
     * 导出教室列表
     */
    @RequiresPermissions("model:classroom:export")
    @Log(title = "教室", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StuClassroom stuClassroom)
    {
        List<StuClassroom> list = stuClassroomService.selectStuClassroomList(stuClassroom);
        ExcelUtil<StuClassroom> util = new ExcelUtil<StuClassroom>(StuClassroom.class);
        return util.exportExcel(list, "教室数据");
    }

    /**
     * 新增教室
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教室
     */
    @RequiresPermissions("model:classroom:add")
    @Log(title = "教室", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StuClassroom stuClassroom)
    {
        return toAjax(stuClassroomService.insertStuClassroom(stuClassroom));
    }

    /**
     * 修改教室
     */
    @RequiresPermissions("model:classroom:edit")
    @GetMapping("/edit/{cid}")
    public String edit(@PathVariable("cid") Long cid, ModelMap mmap)
    {
        StuClassroom stuClassroom = stuClassroomService.selectStuClassroomByCid(cid);
        mmap.put("stuClassroom", stuClassroom);
        return prefix + "/edit";
    }

    /**
     * 修改保存教室
     */
    @RequiresPermissions("model:classroom:edit")
    @Log(title = "教室", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StuClassroom stuClassroom)
    {
        return toAjax(stuClassroomService.updateStuClassroom(stuClassroom));
    }

    /**
     * 删除教室
     */
    @RequiresPermissions("model:classroom:remove")
    @Log(title = "教室", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stuClassroomService.deleteStuClassroomByCids(ids));
    }
}
