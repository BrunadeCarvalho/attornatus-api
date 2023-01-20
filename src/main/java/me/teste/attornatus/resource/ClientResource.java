package me.teste.attornatus.resource;

import lombok.RequiredArgsConstructor;
import me.teste.attornatus.models.Client;
import me.teste.attornatus.repository.ClientRepository;
import me.teste.attornatus.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientResource {
    private final ClientService clientService;
    private final ClientRepository clientRepository;

    @GetMapping("/{id}")
    public Client getClient(@PathVariable("id") Long id){
        return clientService.getClient(id);
    }

    @GetMapping()
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @PostMapping()
    public Client newClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> editClient (@PathVariable("id") Long id,
                                              @RequestBody Client client){
        return clientRepository.findById(id)
                .map(record ->{
                    record.setName(client.getName());
                    record.setAddress(client.getAddress());
                    record.setBirth_date(client.getBirth_date());
                    Client updated = clientRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}
