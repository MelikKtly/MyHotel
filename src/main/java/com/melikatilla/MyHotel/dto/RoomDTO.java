package com.melikatilla.MyHotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {
    private Long id;
    private String roomType;
    private String roomPrice;
    private String roomDescription;
    private String roomPhotoUrl;

    private List<BookingDTO> bookings;

}
