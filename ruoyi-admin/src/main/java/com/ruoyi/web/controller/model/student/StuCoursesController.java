package com.ruoyi.web.controller.model.student;

import java.util.List;

import com.ruoyi.system.domain.stu.StuCourses;
import com.ruoyi.system.service.IStuCoursesService;
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
 * 课程Controller
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Controller
@RequestMapping("/model/courses")
public class StuCoursesController extends BaseController
{
    private String prefix = "model/courses";

    @Autowired
    private IStuCoursesService stuCoursesService;

    @RequiresPermissions("model:courses:view")
    @GetMapping()
    public String courses()
    {
        return prefix + "/courses";
    }

    /**
     * 查询课程列表
     */
    @RequiresPermissions("model:courses:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StuCourses stuCourses)
    {
        startPage();
        List<StuCourses> list = stuCoursesService.selectStuCoursesList(stuCourses);
        return getDataTable(list);
    }

    /**
     * 导出课程列表
     */
    @RequiresPermissions("model:courses:export")
    @Log(title = "课程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StuCourses stuCourses)
    {
        List<StuCourses> list = stuCoursesService.selectStuCoursesList(stuCourses);
        ExcelUtil<StuCourses> util = new ExcelUtil<StuCourses>(StuCourses.class);
        return util.exportExcel(list, "课程数据");
    }

    /**
     * 新增课程
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存课程
     */
    @RequiresPermissions("model:courses:add")
    @Log(title = "课程", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StuCourses stuCourses)
    {
        return toAjax(stuCoursesService.insertStuCourses(stuCourses));
    }

    /**
     * 修改课程
     */
    @RequiresPermissions("model:courses:edit")
    @GetMapping("/edit/{cid}")
    public String edit(@PathVariable("cid") Long cid, ModelMap mmap)
    {
        StuCourses stuCourses = stuCoursesService.selectStuCoursesByCid(cid);
        mmap.put("stuCourses", stuCourses);
        return prefix + "/edit";
    }

    /**
     * 修改保存课程
     */
    @RequiresPermissions("model:courses:edit")
    @Log(title = "课程", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StuCourses stuCourses)
    {
        return toAjax(stuCoursesService.updateStuCourses(stuCourses));
    }

    /**
     * 删除课程
     */
    @RequiresPermissions("model:courses:remove")
    @Log(title = "课程", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stuCoursesService.deleteStuCoursesByCids(ids));
    }
}
