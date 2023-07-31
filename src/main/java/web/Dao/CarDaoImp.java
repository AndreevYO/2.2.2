package web.Dao;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 01, "111"));
        cars.add(new Car("car2", 02, "222"));
        cars.add(new Car("car3", 03, "333"));
        cars.add(new Car("car4", 04, "444"));
        cars.add(new Car("car5", 05, "555"));

        return cars;
    }
}
