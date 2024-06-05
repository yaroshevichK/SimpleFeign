package com.example.addressapp.service;

import com.example.addressapp.dto.AddressResponse;
import com.example.addressapp.model.Address;
import com.example.addressapp.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AddressService {
    private final AddressRepository addressRepository;
    private final ModelMapper mapper;

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepository.findAddressByEmployeeId(employeeId);
        return mapper.map(addressByEmployeeId, AddressResponse.class);
    }
}
