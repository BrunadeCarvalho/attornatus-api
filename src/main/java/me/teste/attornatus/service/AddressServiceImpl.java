package me.teste.attornatus.service;

import lombok.RequiredArgsConstructor;
import me.teste.attornatus.models.Address;
import me.teste.attornatus.models.Client;
import me.teste.attornatus.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{
    private final AddressRepository addressRepository;

    public Address getAddress(Long id){
        return addressRepository.findById(id).orElseThrow(
                () ->{
                    throw new RuntimeException("Endereço não localizado");
                }
        );
    }
}
