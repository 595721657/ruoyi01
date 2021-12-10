package com.ruoyi.system.service;

import com.ruoyi.system.domain.stu.StuClass;

import java.util.List;

/**
 * 班级Service接口
 * 
 * @author dragon
 * @date 2021-12-10
 */
public interface IStuClassService 
{
    /**
     * 查询班级
     * 
     * @param cid 班级主键
     * @return 班级
     */
    public StuClass selectStuClassByCid(Long cid);

    /**
     * 查询班级列表
     * 
     * @param stuClass 班级
     * @return 班级集合
     */
    public List<StuClass> selectStuClassList(StuClass stuClass);

    /**
     * 新增班级
     * 
     * @param stuClass 班级
     * @return 结果
     */
    public int insertStuClass(StuClass stuClass);

    /**
     * 修改班级
     * 
     * @param stuClass 班级
     * @return 结果
     */
    public int updateStuClass(StuClass stuClass);

    /**
     * 批量删除班级
     * 
     * @param cids 需要删除的班级主键集合
     * @return 结果
     */
    public int deleteStuClassByCids(String cids);

    /**
     * 删除班级信息
     * 
     * @param cid 班级主键
     * @return 结果
     */
    public int deleteStuClassByCid(Long cid);
}
