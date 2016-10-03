package models;

import play.*;
import play.mvc.*;
import play.db.jpa.*;
import java.util.List;

public class EmployeeService {
    /**
     * Create an employee
     *
     *
     * @return Employee
     */
    public static Employee create(Employee data) {
        return EmployeeDAO.create(data);
    }

    /**
     * Update an employee
     *
     *
     * @return Employee
     */
    public static Employee update(Employee data) {
        return EmployeeDAO.update(data);
    }

    /**
     * Find an employee by id
     *
     *
     * @return Employee
     */
    public static Employee find(Integer id) {
        return EmployeeDAO.find(id);
    }

    /**
     * Delete an employee by id
     *
     */
    public static Boolean delete(Integer id) {
        Employee employee = EmployeeDAO.find(id);
        if (employee != null) {
            EmployeeDAO.delete(id);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get all employees
     *
     * @return List<Employee>
     */
    public static List<Employee> all() {
        return EmployeeDAO.all();
    }

    /**
     * Get the page of employees
     *
     *
     * @return List<Employee>
     */
    public static List<Employee> paginate(Integer page, Integer size) {
        return EmployeeDAO.paginate(page, size);
    }

    /**
     * Get the number of total of employees
     *
     * @return Long
     */
    public static Long count() {
        return EmployeeDAO.count();
    }
}