package com.ruoyi.system.domain.stu;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生档案对象 stu_file
 * 
 * @author dragon
 * @date 2021-12-10
 */
public class StuFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 档案id */
    private Long fid;

    /** 用户id（姓名 年龄 性别） */
    @Excel(name = "用户id", readConverterExp = "姓=名,年=龄,性=别")
    private Long uid;

    /** 民族（数据字典获取 例：001-汉族 002-满族） */
    @Excel(name = "民族", readConverterExp = "数=据字典获取,例=：001-汉族,0=02-满族")
    private String nation;

    /** 入学时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入学时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 政治面貌（数据字典获取 例：001-共青团员 002-党员） */
    @Excel(name = "政治面貌", readConverterExp = "数=据字典获取,例=：001-共青团员,0=02-党员")
    private String political;

    /** 家庭地址 */
    @Excel(name = "家庭地址")
    private String address;

    /** 身份证 */
    @Excel(name = "身份证")
    private String idNum;

    /** 出生年月 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生年月", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 头像路径 */
    @Excel(name = "头像路径")
    private String imgUrl;

    /** 班级id（外健 stu_class） */
    @Excel(name = "班级id", readConverterExp = "外=健,s=tu_class")
    private Long cid;

    /** 所属院系 */
    @Excel(name = "所属院系")
    private Long deptId;

    public void setFid(Long fid) 
    {
        this.fid = fid;
    }

    public Long getFid() 
    {
        return fid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setNation(String nation) 
    {
        this.nation = nation;
    }

    public String getNation() 
    {
        return nation;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setPolitical(String political) 
    {
        this.political = political;
    }

    public String getPolitical() 
    {
        return political;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setIdNum(String idNum) 
    {
        this.idNum = idNum;
    }

    public String getIdNum() 
    {
        return idNum;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setImgUrl(String imgUrl) 
    {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() 
    {
        return imgUrl;
    }
    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fid", getFid())
            .append("uid", getUid())
            .append("nation", getNation())
            .append("startTime", getStartTime())
            .append("political", getPolitical())
            .append("address", getAddress())
            .append("idNum", getIdNum())
            .append("birthday", getBirthday())
            .append("imgUrl", getImgUrl())
            .append("cid", getCid())
            .append("deptId", getDeptId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
