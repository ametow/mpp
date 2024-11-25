package lesson9.lecture.optionaldemo;

import java.util.*;

public class OptionalMain {

    public static void main(String args[]) {
        Optional<Insurance> is = Optional.of(new Insurance("Progressive"));
        Optional<Car> car = Optional.of(new Car(is));
        Person p = new Person(car);
        System.out.println(getCarInsuranceName(Optional.of(p)));
    }

    public static String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown"); // A default value if the resulting optional is empty
    }

}
