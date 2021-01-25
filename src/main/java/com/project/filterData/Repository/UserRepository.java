package com.project.filterData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.filterData.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
