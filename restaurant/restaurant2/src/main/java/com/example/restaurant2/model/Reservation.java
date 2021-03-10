package com.example.restaurant2.model;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    private Long id;

    private RestaurantTable restaurantTable;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
