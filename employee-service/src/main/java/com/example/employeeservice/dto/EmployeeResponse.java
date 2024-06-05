package com.example.employeeservice.dto;

import com.example.addressapp.dto.AddressResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class EmployeeResponse {

    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private AddressResponse addressResponse;
}
