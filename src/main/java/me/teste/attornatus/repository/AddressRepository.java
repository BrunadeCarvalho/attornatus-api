package me.teste.attornatus.repository;

import me.teste.attornatus.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
