package org.example.service;

import org.example.entity.Region;

import java.util.List;

public interface RegionService {
    Region saveRegion(Region region);

    List<Region> getAll();

    String updateById(Long id);
}
