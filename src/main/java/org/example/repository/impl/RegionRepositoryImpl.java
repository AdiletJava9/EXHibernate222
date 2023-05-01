package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.config.HibernateConfig;
import org.example.entity.Region;
import org.example.repository.RegionRepository;

import java.util.List;

public class RegionRepositoryImpl implements RegionRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();

    public Region saveRegion(Region region) {
        entityManager.getTransaction().begin();
        entityManager.persist(region);
        entityManager.getTransaction().commit();
        entityManager.close();
        return region;
    }

    public List<Region> getAll() {
        entityManager.getTransaction().begin();
        String query = "SELECT r FROM Region r ";
        List<Region> resultList = entityManager.createQuery(query, Region.class).getResultList();


//        TypedQuery<Region> query1 = entityManager.createQuery(query, Region.class);
//        List<Region> regions = query1.getResultList();


        entityManager.getTransaction().commit();
        entityManager.close();
        return resultList;
    }

    public String updateById(Long id) {
        entityManager.getTransaction().begin();
        Region region = entityManager.find(Region.class, id);
        region.setRegionName(region.getRegionName());
        entityManager.merge(region);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "updated..." + id;
    }
}
