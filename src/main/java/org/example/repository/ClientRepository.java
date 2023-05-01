package org.example.repository;

import org.example.entity.Client;

public interface ClientRepository {
    String saveClient(Client client);

    String deleteById(Long id);

    Client findById(Long id);

}
