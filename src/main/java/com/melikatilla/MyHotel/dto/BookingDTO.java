package com.melikatilla.MyHotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.melikatilla.MyHotel.entity.Room;
import com.melikatilla.MyHotel.entity.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private int id;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuests;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;

}
