package com.danielmichalski.reservations.service.room;

import com.danielmichalski.reservations.domain.entity.room.RoomXReservationEntity;
import com.danielmichalski.reservations.util.annotation.TransactionalReadOnly;
import com.danielmichalski.reservations.util.annotation.TransactionalWrite;

import java.util.List;

public interface RoomXReservationService {

    @TransactionalReadOnly
    List<RoomXReservationEntity> findAll();

    @TransactionalWrite
    void remove(RoomXReservationEntity roomXReservation);

    @TransactionalWrite
    void save(RoomXReservationEntity roomXReservation);

}
