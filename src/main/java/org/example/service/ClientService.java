package org.example.service;

import org.example.entity.Client;

public interface ClientService {
    String saveClient(Client client);

    String deleteById(Long id);

    Client findById(Long id);
}
