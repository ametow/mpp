package lesson9.lecture.optionaldemo;

import java.util.*;

public class Car {
        // A car might or might not be insured.
    private Optional<Insurance> insurance;

    public Car(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}
    public Car(){
    	
    }
	public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
