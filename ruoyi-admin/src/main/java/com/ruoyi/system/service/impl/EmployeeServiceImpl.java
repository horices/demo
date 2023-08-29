package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.request.EmployeeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EmployeeMapper;
import com.ruoyi.system.domain.Employee;
import com.ruoyi.system.service.IEmployeeService;

/**
 * 职工Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-28
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService
{
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询职工
     *
     * @param id 职工主键
     * @return 职工
     */
    @Override
    public Employee selectEmployeeById(Long id)
    {
        return employeeMapper.selectEmployeeById(id);
    }

    /**
     * 查询职工列表
     *
     * @param employee 职工
     * @return 职工
     */
    @Override
    public List<Employee> selectEmployeeList(EmployeeQuery employee)
    {
        return employeeMapper.selectEmployeeList(employee);
    }

    /**
     * 新增职工
     *
     * @param employee 职工
     * @return 结果
     */
    @Override
    public int insertEmployee(Employee employee)
    {
        return employeeMapper.insertEmployee(employee);
    }

    /**
     * 修改职工
     *
     * @param employee 职工
     * @return 结果
     */
    @Override
    public int updateEmployee(Employee employee)
    {
        return employeeMapper.updateEmployee(employee);
    }

    /**
     * 批量删除职工
     *
     * @param ids 需要删除的职工主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeByIds(Long[] ids)
    {
        return employeeMapper.deleteEmployeeByIds(ids);
    }

    /**
     * 删除职工信息
     *
     * @param id 职工主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeById(Long id)
    {
        return employeeMapper.deleteEmployeeById(id);
    }
}
