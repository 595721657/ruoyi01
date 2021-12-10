package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.stu.StuFile;
import com.ruoyi.system.mapper.StuFileMapper;
import com.ruoyi.system.service.IStuFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生档案Service业务层处理
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Service
public class StuFileServiceImpl implements IStuFileService
{
    @Autowired
    private StuFileMapper stuFileMapper;

    /**
     * 查询学生档案
     * 
     * @param fid 学生档案主键
     * @return 学生档案
     */
    @Override
    public StuFile selectStuFileByFid(Long fid)
    {
        return stuFileMapper.selectStuFileByFid(fid);
    }

    /**
     * 查询学生档案列表
     * 
     * @param stuFile 学生档案
     * @return 学生档案
     */
    @Override
    public List<StuFile> selectStuFileList(StuFile stuFile)
    {
        return stuFileMapper.selectStuFileList(stuFile);
    }

    /**
     * 新增学生档案
     * 
     * @param stuFile 学生档案
     * @return 结果
     */
    @Override
    public int insertStuFile(StuFile stuFile)
    {
        stuFile.setCreateTime(DateUtils.getNowDate());
        return stuFileMapper.insertStuFile(stuFile);
    }

    /**
     * 修改学生档案
     * 
     * @param stuFile 学生档案
     * @return 结果
     */
    @Override
    public int updateStuFile(StuFile stuFile)
    {
        stuFile.setUpdateTime(DateUtils.getNowDate());
        return stuFileMapper.updateStuFile(stuFile);
    }

    /**
     * 批量删除学生档案
     * 
     * @param fids 需要删除的学生档案主键
     * @return 结果
     */
    @Override
    public int deleteStuFileByFids(String fids)
    {
        return stuFileMapper.deleteStuFileByFids(Convert.toStrArray(fids));
    }

    /**
     * 删除学生档案信息
     * 
     * @param fid 学生档案主键
     * @return 结果
     */
    @Override
    public int deleteStuFileByFid(Long fid)
    {
        return stuFileMapper.deleteStuFileByFid(fid);
    }
}
