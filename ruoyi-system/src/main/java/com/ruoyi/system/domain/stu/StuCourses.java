package com.ruoyi.system.domain.stu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程对象 stu_courses
 * 
 * @author dragon
 * @date 2021-12-10
 */
public class StuCourses extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 课程id */
    @Excel(name = "课程id")
    private Long cid;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String cname;

    /** 学分 */
    @Excel(name = "学分")
    private Long creditPoint;

    /** 老师id（用户id） */
    @Excel(name = "老师id", readConverterExp = "用=户id")
    private Long uid;

    /** 上课时间【例：2-2,2-3,3-2  第一个值是星期几 第二个是第几节课】 */
    @Excel(name = "上课时间【例：2-2,2-3,3-2  第一个值是星期几 第二个是第几节课】")
    private String workId;

    /** 学时 */
    @Excel(name = "学时")
    private Long period;

    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setCname(String cname) 
    {
        this.cname = cname;
    }

    public String getCname() 
    {
        return cname;
    }
    public void setCreditPoint(Long creditPoint) 
    {
        this.creditPoint = creditPoint;
    }

    public Long getCreditPoint() 
    {
        return creditPoint;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setWorkId(String workId) 
    {
        this.workId = workId;
    }

    public String getWorkId() 
    {
        return workId;
    }
    public void setPeriod(Long period) 
    {
        this.period = period;
    }

    public Long getPeriod() 
    {
        return period;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cid", getCid())
            .append("cname", getCname())
            .append("creditPoint", getCreditPoint())
            .append("uid", getUid())
            .append("workId", getWorkId())
            .append("period", getPeriod())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
