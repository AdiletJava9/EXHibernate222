package org.example.service.impl;

import org.example.entity.Region;
import org.example.repository.RegionRepository;
import org.example.repository.impl.RegionRepositoryImpl;
import org.example.service.RegionService;

import java.util.List;

public class RegionServiceImpl implements RegionService {
    RegionRepository regionRepository = new RegionRepositoryImpl();

    public Region saveRegion(Region region) {
        return regionRepository.saveRegion(region);
    }

    public List<Region>  getAll() {
        return regionRepository.getAll();
    }

    public String updateById(Long id) {
        return regionRepository.updateById(id);
    }
}
