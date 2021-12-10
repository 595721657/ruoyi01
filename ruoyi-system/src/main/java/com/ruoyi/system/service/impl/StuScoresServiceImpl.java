package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.stu.StuScores;
import com.ruoyi.system.mapper.StuScoresMapper;
import com.ruoyi.system.service.IStuScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 成绩Service业务层处理
 * 
 * @author dragon
 * @date 2021-12-10
 */
@Service
public class StuScoresServiceImpl implements IStuScoresService
{
    @Autowired
    private StuScoresMapper stuScoresMapper;

    /**
     * 查询成绩
     * 
     * @param sid 成绩主键
     * @return 成绩
     */
    @Override
    public StuScores selectStuScoresBySid(Long sid)
    {
        return stuScoresMapper.selectStuScoresBySid(sid);
    }

    /**
     * 查询成绩列表
     * 
     * @param stuScores 成绩
     * @return 成绩
     */
    @Override
    public List<StuScores> selectStuScoresList(StuScores stuScores)
    {
        return stuScoresMapper.selectStuScoresList(stuScores);
    }

    /**
     * 新增成绩
     * 
     * @param stuScores 成绩
     * @return 结果
     */
    @Override
    public int insertStuScores(StuScores stuScores)
    {
        stuScores.setCreateTime(DateUtils.getNowDate());
        return stuScoresMapper.insertStuScores(stuScores);
    }

    /**
     * 修改成绩
     * 
     * @param stuScores 成绩
     * @return 结果
     */
    @Override
    public int updateStuScores(StuScores stuScores)
    {
        stuScores.setUpdateTime(DateUtils.getNowDate());
        return stuScoresMapper.updateStuScores(stuScores);
    }

    /**
     * 批量删除成绩
     * 
     * @param sids 需要删除的成绩主键
     * @return 结果
     */
    @Override
    public int deleteStuScoresBySids(String sids)
    {
        return stuScoresMapper.deleteStuScoresBySids(Convert.toStrArray(sids));
    }

    /**
     * 删除成绩信息
     * 
     * @param sid 成绩主键
     * @return 结果
     */
    @Override
    public int deleteStuScoresBySid(Long sid)
    {
        return stuScoresMapper.deleteStuScoresBySid(sid);
    }
}
