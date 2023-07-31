package web.Dao;

import web.Model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCar(int count);
}
