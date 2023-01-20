package me.teste.attornatus.resource;

import lombok.RequiredArgsConstructor;
import me.teste.attornatus.models.Address;
import me.teste.attornatus.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.teste.attornatus.repository.AddressRepository;

import java.util.List;


@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressResource {

    private final AddressService addressService;
    private final AddressRepository addressRepository;

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable("id") Long id) {return addressService.getAddress(id);}

}
