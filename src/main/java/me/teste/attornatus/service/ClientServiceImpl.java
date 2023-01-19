package me.teste.attornatus.service;

import lombok.RequiredArgsConstructor;
import me.teste.attornatus.models.Client;
import me.teste.attornatus.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final ClientRepository clientRepository;
    @Override
    public Client getClient(Long id) {
        return clientRepository.findById(id).orElseThrow(
                ()->{
                    throw new RuntimeException("Cliente não encontrado.");
                }
        );
    }



}
