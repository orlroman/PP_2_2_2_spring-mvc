package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    
    private final List<Car> cars;
    
    {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", "A4", 2008));
        cars.add(new Car("BMW", "M3", 2010));
        cars.add(new Car("Volkswagen", "Golf", 2016));
        cars.add(new Car("Ford", "Mustang", 2014));
        cars.add(new Car("Volvo", "XC60", 2020));
    }
    
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
