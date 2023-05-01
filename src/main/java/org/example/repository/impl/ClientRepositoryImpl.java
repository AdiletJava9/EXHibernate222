package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Client;
import org.example.repository.ClientRepository;

public class ClientRepositoryImpl implements ClientRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();

    public String saveClient(Client client) {
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "saved..."+client;
    }

    public String deleteById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Client.class,id));
        entityManager.getTransaction().commit();
        entityManager.close();
        return id + "deleted";
    }

    public Client findById(Long id) {
        entityManager.getTransaction().begin();
        Client client1 = entityManager.find(Client.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return client1;
    }
}
