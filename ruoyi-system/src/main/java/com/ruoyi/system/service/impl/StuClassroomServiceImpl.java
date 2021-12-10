package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.stu.StuClassroom;
import com.ruoyi.system.mapper.StuClassroomMapper;
import com.ruoyi.system.service.IStuClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 教室Service业务层处理
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Service
public class StuClassroomServiceImpl implements IStuClassroomService
{
    @Autowired
    private StuClassroomMapper stuClassroomMapper;

    /**
     * 查询教室
     * 
     * @param cid 教室主键
     * @return 教室
     */
    @Override
    public StuClassroom selectStuClassroomByCid(Long cid)
    {
        return stuClassroomMapper.selectStuClassroomByCid(cid);
    }

    /**
     * 查询教室列表
     * 
     * @param stuClassroom 教室
     * @return 教室
     */
    @Override
    public List<StuClassroom> selectStuClassroomList(StuClassroom stuClassroom)
    {
        return stuClassroomMapper.selectStuClassroomList(stuClassroom);
    }

    /**
     * 新增教室
     * 
     * @param stuClassroom 教室
     * @return 结果
     */
    @Override
    public int insertStuClassroom(StuClassroom stuClassroom)
    {
        stuClassroom.setCreateTime(DateUtils.getNowDate());
        return stuClassroomMapper.insertStuClassroom(stuClassroom);
    }

    /**
     * 修改教室
     * 
     * @param stuClassroom 教室
     * @return 结果
     */
    @Override
    public int updateStuClassroom(StuClassroom stuClassroom)
    {
        stuClassroom.setUpdateTime(DateUtils.getNowDate());
        return stuClassroomMapper.updateStuClassroom(stuClassroom);
    }

    /**
     * 批量删除教室
     * 
     * @param cids 需要删除的教室主键
     * @return 结果
     */
    @Override
    public int deleteStuClassroomByCids(String cids)
    {
        return stuClassroomMapper.deleteStuClassroomByCids(Convert.toStrArray(cids));
    }

    /**
     * 删除教室信息
     * 
     * @param cid 教室主键
     * @return 结果
     */
    @Override
    public int deleteStuClassroomByCid(Long cid)
    {
        return stuClassroomMapper.deleteStuClassroomByCid(cid);
    }
}
