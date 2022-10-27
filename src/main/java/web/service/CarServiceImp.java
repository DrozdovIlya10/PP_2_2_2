package web.service;

import org.springframework.stereotype.Service;
import web.config.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp {

    public static List<Car> getCars( List<Car> list, int num) {
        if(num >= 0 && num <=5 )
            return list.stream().limit(num).collect(Collectors.toList());
        else
            return list;
    }
}
