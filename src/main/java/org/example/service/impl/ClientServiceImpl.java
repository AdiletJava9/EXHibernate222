package org.example.service.impl;

import org.example.entity.Client;
import org.example.repository.ClientRepository;
import org.example.repository.impl.ClientRepositoryImpl;
import org.example.service.ClientService;

public class ClientServiceImpl implements ClientService {
    ClientRepository clientRepository = new ClientRepositoryImpl();

    public String saveClient(Client client) {
        return clientRepository.saveClient(client);
    }

    public String deleteById(Long id) {
        return clientRepository.deleteById(id);
    }

    public Client findById(Long id) {
        return clientRepository.findById(id);
    }
}
