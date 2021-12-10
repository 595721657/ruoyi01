package com.ruoyi.system.service;

import com.ruoyi.system.domain.stu.StuClassroom;

import java.util.List;

/**
 * 教室Service接口
 * 
 * @author dragon
 * @date 2021-12-10
 */
public interface IStuClassroomService 
{
    /**
     * 查询教室
     * 
     * @param cid 教室主键
     * @return 教室
     */
    public StuClassroom selectStuClassroomByCid(Long cid);

    /**
     * 查询教室列表
     * 
     * @param stuClassroom 教室
     * @return 教室集合
     */
    public List<StuClassroom> selectStuClassroomList(StuClassroom stuClassroom);

    /**
     * 新增教室
     * 
     * @param stuClassroom 教室
     * @return 结果
     */
    public int insertStuClassroom(StuClassroom stuClassroom);

    /**
     * 修改教室
     * 
     * @param stuClassroom 教室
     * @return 结果
     */
    public int updateStuClassroom(StuClassroom stuClassroom);

    /**
     * 批量删除教室
     * 
     * @param cids 需要删除的教室主键集合
     * @return 结果
     */
    public int deleteStuClassroomByCids(String cids);

    /**
     * 删除教室信息
     * 
     * @param cid 教室主键
     * @return 结果
     */
    public int deleteStuClassroomByCid(Long cid);
}
