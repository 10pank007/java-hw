package hw1;

import java.util.ArrayList;
import java.util.List;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("model1");
        car1.setPower(1);
        car1.setVolumeEngine(1);
        car1.setTurbo(true);

        Car car2 = new Car();
        car2.setModel("model2");
        car2.setPower(2);
        car2.setVolumeEngine(2);
        car2.setTurbo(false);

        Car car3 = new Car();
        car3.setModel("model3");
        car3.setPower(3);
        car3.setVolumeEngine(3);
        car3.setTurbo(true);

        Car car4 = new Car();
        car4.setModel("model4");
        car4.setPower(4);
        car4.setVolumeEngine(4);
        car4.setTurbo(false);

        Car car5 = new Car();
        car5.setModel("model5");
        car5.setPower(5);
        car5.setVolumeEngine(5);
        car5.setTurbo(true);

        Car [] arrCars = new Car[]{car1, car2, car3, car4, car5};
        for (Car car : arrCars) {
            System.out.println(car);
        }

        List<Car> listCars = new ArrayList<>();
        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);
        for (Car listCar : listCars) {
            System.out.println(listCar.getModel() + " " + listCar.getPower() + " " + listCar.getVolumeEngine() + " " + listCar.isTurbo());
        }
    }
}
