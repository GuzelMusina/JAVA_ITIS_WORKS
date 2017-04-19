package ru.itis.storages;

import ru.itis.models.Car;

import java.util.List;

public interface CarDataStorage extends BaseDataStorage<Car> {
    List<Car> findAllLessThanGiven (int mileage);
}
