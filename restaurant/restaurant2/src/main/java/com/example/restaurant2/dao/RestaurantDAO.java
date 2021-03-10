package com.example.restaurant2.dao;

import com.example.restaurant2.model.RestaurantTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface RestaurantDAO extends CrudRepository<RestaurantTable, Long> {
}
