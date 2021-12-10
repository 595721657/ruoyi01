package com.ruoyi.system.service;

import com.ruoyi.system.domain.stu.StuScores;

import java.util.List;

/**
 * 成绩Service接口
 * 
 * @author dragon
 * @date 2021-12-10
 */
public interface IStuScoresService 
{
    /**
     * 查询成绩
     * 
     * @param sid 成绩主键
     * @return 成绩
     */
    public StuScores selectStuScoresBySid(Long sid);

    /**
     * 查询成绩列表
     * 
     * @param stuScores 成绩
     * @return 成绩集合
     */
    public List<StuScores> selectStuScoresList(StuScores stuScores);

    /**
     * 新增成绩
     * 
     * @param stuScores 成绩
     * @return 结果
     */
    public int insertStuScores(StuScores stuScores);

    /**
     * 修改成绩
     * 
     * @param stuScores 成绩
     * @return 结果
     */
    public int updateStuScores(StuScores stuScores);

    /**
     * 批量删除成绩
     * 
     * @param sids 需要删除的成绩主键集合
     * @return 结果
     */
    public int deleteStuScoresBySids(String sids);

    /**
     * 删除成绩信息
     * 
     * @param sid 成绩主键
     * @return 结果
     */
    public int deleteStuScoresBySid(Long sid);
}
