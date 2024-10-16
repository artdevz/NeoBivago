package NeoBivago.dto.reservation;

import java.util.Date;
import java.util.UUID;

public record ReservationDTO(UUID user, UUID hotel, UUID room, Date checkIn, Date checkOut, int nop, int price) {}
