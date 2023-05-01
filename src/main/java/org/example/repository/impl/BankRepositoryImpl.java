package org.example.repository.impl;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Query;
import org.example.config.HibernateConfig;
import org.example.entity.Bank;
import org.example.entity.Region;
import org.example.repository.BankRepository;

import java.util.List;

public class BankRepositoryImpl implements BankRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();

    public Bank saveBank(Bank bank) {
        entityManager.getTransaction().begin();
        entityManager.persist(bank);
        entityManager.getTransaction().commit();
        entityManager.close();
        return bank;
    }

    public String deleteBank(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Bank.class,id));
        entityManager.getTransaction().commit();
        entityManager.close();
        return id + "deleted";
    }

    public Bank getBanksByRegionName(Region region) {
        return null;
    }
}
