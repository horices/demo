package com.ruoyi.system.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
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
@ApiModel("员工查询")
@Data
public class EmployeeQuery
{
    /** 职员姓名 */
    @ApiModelProperty(value = "职员姓名")
    private String empName;

    /** 部门名称 */
    @ApiModelProperty(value = "部门名称",allowableValues = "业务部,后勤部,人事部")
    private String deptName;

    /** 学历 */
    @ApiModelProperty(value = "学历",allowableValues = "大专,本科,研究生")
    private String empDegreeName;
}
