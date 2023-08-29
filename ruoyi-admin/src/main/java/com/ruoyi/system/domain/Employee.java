package com.ruoyi.system.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 职工对象 employee
 *
 * @author ruoyi
 * @date 2023-08-28
 */
@ApiModel("员工")
public class Employee
{
    private static final long serialVersionUID = 1L;

    /** 职员ID */
    @ApiModelProperty(hidden = true)
    private Long id;

    /** 职员姓名 */
    @ApiModelProperty(value = "职员姓名")
    @Excel(name = "职员姓名")
    private String empName;

    /** 性别 */
    @ApiModelProperty(value = "性别",allowableValues = "男,女")
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @ApiModelProperty(value = "年龄")
    @Excel(name = "年龄")
    private String age;

    /** 部门名称 */
    @Excel(name = "部门名称")
    @ApiModelProperty(value = "部门名称",allowableValues = "业务部,后勤部,人事部")
    private String deptName;

    /** 学历 */
    @Excel(name = "学历")
    @ApiModelProperty(value = "学历",allowableValues = "大专,本科,研究生")
    private String empDegreeName;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getEmpName()
    {
        return empName;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAge()
    {
        return age;
    }
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getDeptName()
    {
        return deptName;
    }
    public void setEmpDegreeName(String empDegreeName)
    {
        this.empDegreeName = empDegreeName;
    }

    public String getEmpDegreeName()
    {
        return empDegreeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("empName", getEmpName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("deptName", getDeptName())
            .append("empDegreeName", getEmpDegreeName())
            .toString();
    }
}
