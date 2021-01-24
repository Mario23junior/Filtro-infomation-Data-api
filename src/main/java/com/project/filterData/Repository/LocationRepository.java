package com.project.filterData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.filterData.Model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

}
