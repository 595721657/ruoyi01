package com.ruoyi.system.mapper;

import java.util.List;

import com.ruoyi.system.domain.stu.StuClassroom;

/**
 * 教室Mapper接口
 * 
 * @author dragon
 * @date 2021-12-10
 */
public interface StuClassroomMapper 
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
     * 删除教室
     * 
     * @param cid 教室主键
     * @return 结果
     */
    public int deleteStuClassroomByCid(Long cid);

    /**
     * 批量删除教室
     * 
     * @param cids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStuClassroomByCids(String[] cids);
}
