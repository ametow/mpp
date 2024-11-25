package lesson9.lecture.optionaldemo;

import java.util.*;

public class Person {

	// Person might or might not own a car, so declare as a Optional
    private Optional<Car> car; 
    
    public Person(){
    	
    }
    public Person(Optional<Car> car) {
		this.car = car;
	}

	public Optional<Car> getCar() {
        return car;
    }

	public void setCar(Optional<Car> car) {
		this.car = car;
	}
}
