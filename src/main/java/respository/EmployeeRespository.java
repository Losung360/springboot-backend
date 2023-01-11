package respository;

import model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRespository extends JpaRepository<Employee,Long>
{

}
