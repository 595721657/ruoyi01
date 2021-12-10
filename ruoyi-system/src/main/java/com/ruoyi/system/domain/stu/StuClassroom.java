package com.ruoyi.system.domain.stu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教室对象 stu_classroom
 * 
 * @author dragon
 * @date 2021-12-10
 */
public class StuClassroom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 教室id */
    private Long cid;

    /** 位置(例如:西A) */
    @Excel(name = "位置(例如:西A)")
    private String address;

    /** 几栋 */
    @Excel(name = "几栋")
    private String build;

    /** 房间号 */
    @Excel(name = "房间号")
    private String roomNum;

    /** 人数 */
    @Excel(name = "人数")
    private Long number;

    /** 状态(0未使用[默认] 1使用) */
    @Excel(name = "状态(0未使用[默认] 1使用)")
    private Integer status;

    /** 课程id */
    @Excel(name = "课程id")
    private Long scid;

    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setBuild(String build) 
    {
        this.build = build;
    }

    public String getBuild() 
    {
        return build;
    }
    public void setRoomNum(String roomNum) 
    {
        this.roomNum = roomNum;
    }

    public String getRoomNum() 
    {
        return roomNum;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setScid(Long scid) 
    {
        this.scid = scid;
    }

    public Long getScid() 
    {
        return scid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cid", getCid())
            .append("address", getAddress())
            .append("build", getBuild())
            .append("roomNum", getRoomNum())
            .append("number", getNumber())
            .append("status", getStatus())
            .append("scid", getScid())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
