package singleResponsibility.v1ViolateSRP;

import singleResponsibility.v1ViolateSRP.entity.Vehicle1;

public class SRPDemo1 {

    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.run("Motor");
        v.run("Car");
        v.run("Plane");

        /*
        * Motor is running on the road.
        * Car is running on the road.
        * Plane is running on the road.
        * */

    }

}
