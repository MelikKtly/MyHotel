package com.melikatilla.MyHotel.repository;

import com.melikatilla.MyHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findBookingConfirmationCode(String confirmationCode);
}
