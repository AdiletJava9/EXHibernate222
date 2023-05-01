package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Client;
import org.example.entity.Passport;
import org.example.repository.PassportRepository;

public class PassportRepositoryImpl implements PassportRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();

    public Passport savePassport(Passport passport) {
        entityManager.getTransaction().begin();
        entityManager.persist(passport);
        entityManager.getTransaction().commit();
        entityManager.close();
        return passport;
    }

    public String deleteAllPassport() {
//        entityManager.getTransaction().begin();
//        entityManager.remove(entityManager.find(Client.class));
//        entityManager.getTransaction().commit();
//        entityManager.close();
        return "deleted";
    }

    public String assignPassportToClient() {
        return null;
    }
}
