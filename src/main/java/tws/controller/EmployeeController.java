package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Employee;
import tws.entity.Parkinglot;
import tws.repository.EmployeeMapper;
import tws.repository.ParkinglotMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private ParkinglotMapper parkinglotMapper;

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(employeeMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<Employee> insert(@RequestBody Employee employee) {
        employeeMapper.insert(employee);
        return ResponseEntity.created(URI.create("/employees/" + employee.getId())).body(employee);
    }
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<Employee> getByemployeeID(@PathVariable int id) {
    	Employee employee = employeeMapper.selectById(id);
    	List<Parkinglot> parkinglots = parkinglotMapper.selectById(id);
    	employee.setParkinglots(parkinglots);
        return ResponseEntity.ok(employee);
    }
    
}
