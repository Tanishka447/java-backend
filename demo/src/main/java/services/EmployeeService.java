package services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ems.dto.EmployeeDto;;
/**
 *
 * @author ATS
 */
@Service
public interface EmployeeService {
     EmployeeDto createEmployee(EmployeeDto employeeDto);
   
     EmployeeDto getEmployeeById(Long employeeId);

     List <EmployeeDto> getAllEmployees();

     EmployeeDto updateEmployee(Long employeeId,EmployeeDto employeeDto);

     void deleteEmployee(Long employeeId);
    }