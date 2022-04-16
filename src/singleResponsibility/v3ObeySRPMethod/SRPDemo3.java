package singleResponsibility.v3ObeySRPMethod;

import singleResponsibility.v3ObeySRPMethod.entity.Vehicle3;

public class SRPDemo3 {

    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.runRoad("Car");
        vehicle3.runWater("Ship");
        vehicle3.runAir("Plane");
    }

}
