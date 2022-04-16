package singleResponsibility.v2ObeySRPClass;

import singleResponsibility.v2ObeySRPClass.entity.AirVehicle;
import singleResponsibility.v2ObeySRPClass.entity.RoadVehicle;
import singleResponsibility.v2ObeySRPClass.entity.WaterVehicle;

public class SRPDemo2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("Motor");
        roadVehicle.run("Car");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("Plane");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("Ship");
    }

}
