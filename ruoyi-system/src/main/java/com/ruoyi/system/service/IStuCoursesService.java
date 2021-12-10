package com.ruoyi.system.service;

import com.ruoyi.system.domain.stu.StuCourses;

import java.util.List;

/**
 * 课程Service接口
 * 
 * @author dragon
 * @date 2021-12-10
 */
public interface IStuCoursesService 
{
    /**
     * 查询课程
     * 
     * @param cid 课程主键
     * @return 课程
     */
    public StuCourses selectStuCoursesByCid(Long cid);

    /**
     * 查询课程列表
     * 
     * @param stuCourses 课程
     * @return 课程集合
     */
    public List<StuCourses> selectStuCoursesList(StuCourses stuCourses);

    /**
     * 新增课程
     * 
     * @param stuCourses 课程
     * @return 结果
     */
    public int insertStuCourses(StuCourses stuCourses);

    /**
     * 修改课程
     * 
     * @param stuCourses 课程
     * @return 结果
     */
    public int updateStuCourses(StuCourses stuCourses);

    /**
     * 批量删除课程
     * 
     * @param cids 需要删除的课程主键集合
     * @return 结果
     */
    public int deleteStuCoursesByCids(String cids);

    /**
     * 删除课程信息
     * 
     * @param cid 课程主键
     * @return 结果
     */
    public int deleteStuCoursesByCid(Long cid);
}
