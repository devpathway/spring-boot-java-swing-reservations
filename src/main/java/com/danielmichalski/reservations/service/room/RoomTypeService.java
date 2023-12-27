package com.danielmichalski.reservations.service.room;

import com.danielmichalski.reservations.domain.entity.room.RoomTypeEntity;
import com.danielmichalski.reservations.util.annotation.TransactionalReadOnly;
import com.danielmichalski.reservations.util.annotation.TransactionalWrite;

import java.util.List;

public interface RoomTypeService {

    @TransactionalReadOnly
    List<RoomTypeEntity> findAll();

    @TransactionalWrite
    void remove(RoomTypeEntity roomType);

    @TransactionalWrite
    void save(RoomTypeEntity roomType);

}
