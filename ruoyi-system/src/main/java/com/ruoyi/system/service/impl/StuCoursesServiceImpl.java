package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.mapper.StuCoursesMapper;
import com.ruoyi.system.service.IStuCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.stu.StuCourses;
import com.ruoyi.common.core.text.Convert;

/**
 * 课程Service业务层处理
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Service
public class StuCoursesServiceImpl implements IStuCoursesService
{
    @Autowired
    private StuCoursesMapper stuCoursesMapper;

    /**
     * 查询课程
     * 
     * @param cid 课程主键
     * @return 课程
     */
    @Override
    public StuCourses selectStuCoursesByCid(Long cid)
    {
        return stuCoursesMapper.selectStuCoursesByCid(cid);
    }

    /**
     * 查询课程列表
     * 
     * @param stuCourses 课程
     * @return 课程
     */
    @Override
    public List<StuCourses> selectStuCoursesList(StuCourses stuCourses)
    {
        return stuCoursesMapper.selectStuCoursesList(stuCourses);
    }

    /**
     * 新增课程
     * 
     * @param stuCourses 课程
     * @return 结果
     */
    @Override
    public int insertStuCourses(StuCourses stuCourses)
    {
        stuCourses.setCreateTime(DateUtils.getNowDate());
        return stuCoursesMapper.insertStuCourses(stuCourses);
    }

    /**
     * 修改课程
     * 
     * @param stuCourses 课程
     * @return 结果
     */
    @Override
    public int updateStuCourses(StuCourses stuCourses)
    {
        stuCourses.setUpdateTime(DateUtils.getNowDate());
        return stuCoursesMapper.updateStuCourses(stuCourses);
    }

    /**
     * 批量删除课程
     * 
     * @param cids 需要删除的课程主键
     * @return 结果
     */
    @Override
    public int deleteStuCoursesByCids(String cids)
    {
        return stuCoursesMapper.deleteStuCoursesByCids(Convert.toStrArray(cids));
    }

    /**
     * 删除课程信息
     * 
     * @param cid 课程主键
     * @return 结果
     */
    @Override
    public int deleteStuCoursesByCid(Long cid)
    {
        return stuCoursesMapper.deleteStuCoursesByCid(cid);
    }
}
