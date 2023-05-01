package org.example.repository;

import org.example.entity.Region;

import java.util.List;

public interface RegionRepository {
    Region saveRegion(Region region);

   List <Region> getAll();

    String updateById(Long id);
}
