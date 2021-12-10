package com.ruoyi.system.domain.stu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 成绩对象 stu_scores
 * 
 * @author dragon
 * @date 2021-12-10
 */
public class StuScores extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 成绩id */
    private Long sid;

    /** 学生id（用户id） */
    @Excel(name = "学生id", readConverterExp = "用=户id")
    private Long uid;

    /** 课程id（stu_courses） */
    @Excel(name = "课程id", readConverterExp = "s=tu_courses")
    private Long cid;

    /** 分数 */
    @Excel(name = "分数")
    private Long score;

    public void setSid(Long sid) 
    {
        this.sid = sid;
    }

    public Long getSid() 
    {
        return sid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sid", getSid())
            .append("uid", getUid())
            .append("cid", getCid())
            .append("score", getScore())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
