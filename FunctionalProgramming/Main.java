package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        ArrayList<Car> car = new ArrayList<>();
        System.out.println("Enter the details of car");
        for(int i=0;i<n;i++){
            car.add(new Car(sc.next(),sc.nextInt(),sc.next()));
        }
        System.out.println(car.stream().filter(c -> c.getPrice() > 1100000).collect(Collectors.toList()));
        System.out.println(car.stream()
                .map(c -> {
                    CarDTO carDTO = new CarDTO(c.getBrand(),c.getPrice());
                    return carDTO;
                }).collect(Collectors.toList())
        );
        Function<Car,CarDTO> carCarDTOFunction = c ->
                new CarDTO(
                c.getBrand(),
                c.getPrice()
        );
        List<CarDTO> dto = car.stream().filter(c -> c.getPrice() < 1200000)
                .map(CarDTO :: map).collect(Collectors.toList());
        dto.forEach(System.out :: println);
        System.out.println(car.stream().map(Car::getPrice).max(Integer :: compare).get());
    }
}
