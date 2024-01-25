package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("saab", "grey", 911));
        cars.add(new Car("subaru", "black", 123));
        cars.add(new Car("zeekr", "white", 321));
        cars.add(new Car("ford", "green", 364));
        cars.add(new Car("devyatka", "rzhaviy", 689));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
