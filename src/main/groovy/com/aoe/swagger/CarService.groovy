package com.aoe.swagger

import org.springframework.stereotype.Service

@Service
class CarService {
    List<Car> getCars() {
        return [
                new Car(1L, 'Car 1'),
                new Car(2L, 'Car 2'),
                new Car(3L, 'Car 3'),
                new Car(4L, 'Car 4'),
                new Car(5L, 'Car 5')
        ]
    }

    Car getCar(Long carId) {
        return new Car(carId, "Car $carId")
    }
}
