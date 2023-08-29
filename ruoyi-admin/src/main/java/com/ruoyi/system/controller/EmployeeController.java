package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.request.EmployeeQuery;
import io.swagger.annotations.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Employee;
import com.ruoyi.system.service.IEmployeeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 职工Controller
 *
 * @author ruoyi
 * @date 2023-08-28
 */
@Api(value = "员工管理",tags = "员工管理")
@RestController
@RequestMapping("/system/employee")
public class EmployeeController extends BaseController
{
    @Autowired
    private IEmployeeService employeeService;

    /**
     * 查询职工列表
     */
    @PreAuthorize("@ss.hasPermi('system:employee:list')")
    @GetMapping("/list")
    @ApiOperation("查询职工列表")
    public TableDataInfo list(EmployeeQuery employee)
    {
        startPage();
        List<Employee> list = employeeService.selectEmployeeList(employee);
        return getDataTable(list);
    }

    /**
     * 导出职工列表
     */
    @ApiOperation("导出职工列表")
    @PreAuthorize("@ss.hasPermi('system:employee:export')")
    @Log(title = "职工", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EmployeeQuery employee)
    {
        List<Employee> list = employeeService.selectEmployeeList(employee);
        ExcelUtil<Employee> util = new ExcelUtil<Employee>(Employee.class);
        util.exportExcel(response, list, "职工数据");
    }

    /**
     * 获取职工详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:employee:query')")
    @GetMapping(value = "/{id}")
    @ApiOperation("获取职工详情")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(employeeService.selectEmployeeById(id));
    }

    /**
     * 新增职工
     */
    @PreAuthorize("@ss.hasPermi('system:employee:add')")
    @Log(title = "职工", businessType = BusinessType.INSERT)
    @ApiOperation("新增职工")
    @PostMapping
    public AjaxResult add(@RequestBody Employee employee)
    {
        return toAjax(employeeService.insertEmployee(employee));
    }

    /**
     * 修改职工
     */
    @PreAuthorize("@ss.hasPermi('system:employee:edit')")
    @Log(title = "职工", businessType = BusinessType.UPDATE)
    @ApiOperation("修改职工")
    @PutMapping
    public AjaxResult edit(@RequestBody Employee employee)
    {
        return toAjax(employeeService.updateEmployee(employee));
    }

    /**
     * 删除职工
     */
    @PreAuthorize("@ss.hasPermi('system:employee:remove')")
    @Log(title = "职工", businessType = BusinessType.DELETE)
    @ApiOperation("删除职工")
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(employeeService.deleteEmployeeByIds(ids));
    }
}
