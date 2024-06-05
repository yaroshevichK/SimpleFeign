package com.example.employeeservice.service;

import com.example.addressapp.dto.AddressResponse;
import com.example.employeeservice.dto.EmployeeResponse;
import com.example.employeeservice.feign.AddressClient;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@RequiredArgsConstructor
@Service
public class EmployeeService {
//    private final EmployeeRepository employeeRepository;
//    private final ModelMapper mapper;
//    private final AddressClient addressClient;

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private AddressClient addressClient;


    public EmployeeResponse getEmployeeById(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);

        //Using FeignClient
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse.getBody());

        return employeeResponse;
    }
}
