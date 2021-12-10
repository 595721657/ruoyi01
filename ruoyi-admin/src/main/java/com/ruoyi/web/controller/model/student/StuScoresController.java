package com.ruoyi.web.controller.model.student;

import java.util.List;

import com.ruoyi.system.domain.stu.StuScores;
import com.ruoyi.system.service.IStuScoresService;
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
 * 成绩Controller
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Controller
@RequestMapping("/model/scores")
public class StuScoresController extends BaseController
{
    private String prefix = "model/scores";

    @Autowired
    private IStuScoresService stuScoresService;

    @RequiresPermissions("model:scores:view")
    @GetMapping()
    public String scores()
    {
        return prefix + "/scores";
    }

    /**
     * 查询成绩列表
     */
    @RequiresPermissions("model:scores:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StuScores stuScores)
    {
        startPage();
        List<StuScores> list = stuScoresService.selectStuScoresList(stuScores);
        return getDataTable(list);
    }

    /**
     * 导出成绩列表
     */
    @RequiresPermissions("model:scores:export")
    @Log(title = "成绩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StuScores stuScores)
    {
        List<StuScores> list = stuScoresService.selectStuScoresList(stuScores);
        ExcelUtil<StuScores> util = new ExcelUtil<StuScores>(StuScores.class);
        return util.exportExcel(list, "成绩数据");
    }

    /**
     * 新增成绩
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存成绩
     */
    @RequiresPermissions("model:scores:add")
    @Log(title = "成绩", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StuScores stuScores)
    {
        return toAjax(stuScoresService.insertStuScores(stuScores));
    }

    /**
     * 修改成绩
     */
    @RequiresPermissions("model:scores:edit")
    @GetMapping("/edit/{sid}")
    public String edit(@PathVariable("sid") Long sid, ModelMap mmap)
    {
        StuScores stuScores = stuScoresService.selectStuScoresBySid(sid);
        mmap.put("stuScores", stuScores);
        return prefix + "/edit";
    }

    /**
     * 修改保存成绩
     */
    @RequiresPermissions("model:scores:edit")
    @Log(title = "成绩", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StuScores stuScores)
    {
        return toAjax(stuScoresService.updateStuScores(stuScores));
    }

    /**
     * 删除成绩
     */
    @RequiresPermissions("model:scores:remove")
    @Log(title = "成绩", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stuScoresService.deleteStuScoresBySids(ids));
    }
}
