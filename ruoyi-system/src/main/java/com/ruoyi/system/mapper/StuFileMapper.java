package com.ruoyi.system.mapper;

import java.util.List;

import com.ruoyi.system.domain.stu.StuFile;

/**
 * 学生档案Mapper接口
 * 
 * @author dragon
 * @date 2021-12-10
 */
public interface StuFileMapper 
{
    /**
     * 查询学生档案
     * 
     * @param fid 学生档案主键
     * @return 学生档案
     */
    public StuFile selectStuFileByFid(Long fid);

    /**
     * 查询学生档案列表
     * 
     * @param stuFile 学生档案
     * @return 学生档案集合
     */
    public List<StuFile> selectStuFileList(StuFile stuFile);

    /**
     * 新增学生档案
     * 
     * @param stuFile 学生档案
     * @return 结果
     */
    public int insertStuFile(StuFile stuFile);

    /**
     * 修改学生档案
     * 
     * @param stuFile 学生档案
     * @return 结果
     */
    public int updateStuFile(StuFile stuFile);

    /**
     * 删除学生档案
     * 
     * @param fid 学生档案主键
     * @return 结果
     */
    public int deleteStuFileByFid(Long fid);

    /**
     * 批量删除学生档案
     * 
     * @param fids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStuFileByFids(String[] fids);
}
