package com.ruoyi.system.domain.stu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 班级对象 stu_class
 * 
 * @author dragon
 * @date 2021-12-10
 */
public class StuClass extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级id */
    private Long cid;

    /** 班级名称 */
    @Excel(name = "班级名称")
    private String className;

    /** 年级(例：2018 2019) */
    @Excel(name = "年级(例：2018 2019)")
    private String grade;

    /** 教室id(外健) */
    @Excel(name = "教室id(外健)")
    private Long classroom;

    /** 年制 */
    @Excel(name = "年制")
    private String year;

    /** 专业（数据字典获取 例：001-软件技术 002-临床医学） */
    @Excel(name = "专业", readConverterExp = "数=据字典获取,例=：001-软件技术,0=02-临床医学")
    private String speciality;

    /** 班主任(用户表id) */
    @Excel(name = "班主任(用户表id)")
    private Long banjo;

    /** 人数 */
    @Excel(name = "人数")
    private Long number;

    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setClassName(String className) 
    {
        this.className = className;
    }

    public String getClassName() 
    {
        return className;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setClassroom(Long classroom) 
    {
        this.classroom = classroom;
    }

    public Long getClassroom() 
    {
        return classroom;
    }
    public void setYear(String year) 
    {
        this.year = year;
    }

    public String getYear() 
    {
        return year;
    }
    public void setSpeciality(String speciality) 
    {
        this.speciality = speciality;
    }

    public String getSpeciality() 
    {
        return speciality;
    }
    public void setBanjo(Long banjo) 
    {
        this.banjo = banjo;
    }

    public Long getBanjo() 
    {
        return banjo;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cid", getCid())
            .append("className", getClassName())
            .append("grade", getGrade())
            .append("classroom", getClassroom())
            .append("year", getYear())
            .append("speciality", getSpeciality())
            .append("banjo", getBanjo())
            .append("number", getNumber())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
