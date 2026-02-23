package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurant.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}

