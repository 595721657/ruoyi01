package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.stu.StuClass;
import com.ruoyi.system.mapper.StuClassMapper;
import com.ruoyi.system.service.IStuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 班级Service业务层处理
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Service
public class StuClassServiceImpl implements IStuClassService
{
    @Autowired
    private StuClassMapper stuClassMapper;

    /**
     * 查询班级
     * 
     * @param cid 班级主键
     * @return 班级
     */
    @Override
    public StuClass selectStuClassByCid(Long cid)
    {
        return stuClassMapper.selectStuClassByCid(cid);
    }

    /**
     * 查询班级列表
     * 
     * @param stuClass 班级
     * @return 班级
     */
    @Override
    public List<StuClass> selectStuClassList(StuClass stuClass)
    {
        return stuClassMapper.selectStuClassList(stuClass);
    }

    /**
     * 新增班级
     * 
     * @param stuClass 班级
     * @return 结果
     */
    @Override
    public int insertStuClass(StuClass stuClass)
    {
        stuClass.setCreateTime(DateUtils.getNowDate());
        return stuClassMapper.insertStuClass(stuClass);
    }

    /**
     * 修改班级
     * 
     * @param stuClass 班级
     * @return 结果
     */
    @Override
    public int updateStuClass(StuClass stuClass)
    {
        stuClass.setUpdateTime(DateUtils.getNowDate());
        return stuClassMapper.updateStuClass(stuClass);
    }

    /**
     * 批量删除班级
     * 
     * @param cids 需要删除的班级主键
     * @return 结果
     */
    @Override
    public int deleteStuClassByCids(String cids)
    {
        return stuClassMapper.deleteStuClassByCids(Convert.toStrArray(cids));
    }

    /**
     * 删除班级信息
     * 
     * @param cid 班级主键
     * @return 结果
     */
    @Override
    public int deleteStuClassByCid(Long cid)
    {
        return stuClassMapper.deleteStuClassByCid(cid);
    }
}
