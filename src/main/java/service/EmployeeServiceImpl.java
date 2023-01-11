package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import respository.EmployeeRespository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeRespository employeeRespository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRespository employeeRespository)
    {
        this.employeeRespository = employeeRespository;
    }

    @Override
    public Employee saveEmployee(Employee employee)
    {
        return employeeRespository.save(employee);
    }
    @Override
    public List<Employee> getAllEmployees(){
        return  employeeRespository.findAll();

    }
}
