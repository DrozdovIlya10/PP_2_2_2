package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car((long)1,"car1",100));
        carList.add(new Car((long)2,"car2",200));
        carList.add(new Car((long)3,"car3",300));
        carList.add(new Car((long)4,"car4",400));
        carList.add(new Car((long)5,"car5",500));
    }

    @Override
    public List<Car> getCars( int num) {
        if(num >= 0 && num <=5 )
            return carList.stream().limit(num).collect(Collectors.toList());
        else
            return carList;
    }
}
