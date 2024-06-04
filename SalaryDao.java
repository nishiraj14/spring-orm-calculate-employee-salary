package EmployeesalaryCalcualtion;

import java.util.List;

public interface SalaryDao {
    public int insert(Employee ep);
    public Employee getEmployee(int id);
    public List<Employee> getAllEmployee();
    public void update(Employee ep);
    public void delete(int id);
}
