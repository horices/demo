package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Employee;
import com.ruoyi.system.request.EmployeeQuery;

/**
 * 职工Service接口
 *
 * @author ruoyi
 * @date 2023-08-28
 */
public interface IEmployeeService
{
    /**
     * 查询职工
     *
     * @param id 职工主键
     * @return 职工
     */
    public Employee selectEmployeeById(Long id);

    /**
     * 查询职工列表
     *
     * @param employee 职工
     * @return 职工集合
     */
    public List<Employee> selectEmployeeList(EmployeeQuery employee);

    /**
     * 新增职工
     *
     * @param employee 职工
     * @return 结果
     */
    public int insertEmployee(Employee employee);

    /**
     * 修改职工
     *
     * @param employee 职工
     * @return 结果
     */
    public int updateEmployee(Employee employee);

    /**
     * 批量删除职工
     *
     * @param ids 需要删除的职工主键集合
     * @return 结果
     */
    public int deleteEmployeeByIds(Long[] ids);

    /**
     * 删除职工信息
     *
     * @param id 职工主键
     * @return 结果
     */
    public int deleteEmployeeById(Long id);
}
