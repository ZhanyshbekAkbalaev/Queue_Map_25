package lms;

import lms.enums.Colour;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car, CarService> carsMap = new HashMap<>();
        carsMap.put(new Car(1,204),new CarService(1,"Tiger Bus",new BigDecimal(2000000), Colour.BLACK));
        carsMap.put(new Car(2,555),new CarService(1,"Bus On Demand",new BigDecimal(2900000), Colour.RED));
        carsMap.put(new Car(3,918),new CarService(1,"Pink Panther Bus",new BigDecimal(2400000), Colour.GRAY));
        System.out.println(carsMap.entrySet());

    }
}
