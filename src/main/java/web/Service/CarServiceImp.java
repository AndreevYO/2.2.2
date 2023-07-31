package web.Service;

import web.Dao.CarDao;
import web.Dao.CarDaoImp;
import web.Model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    private final CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
