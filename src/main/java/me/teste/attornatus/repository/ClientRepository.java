package me.teste.attornatus.repository;

import me.teste.attornatus.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
