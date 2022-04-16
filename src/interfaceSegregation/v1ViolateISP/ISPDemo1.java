package interfaceSegregation.v1ViolateISP;

import interfaceSegregation.v1ViolateISP.entity.A;
import interfaceSegregation.v1ViolateISP.entity.C;
import interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.InterfaceViolateISP;
import interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.impl.B;
import interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.impl.D;

public class ISPDemo1 {

    public static void main(String[] args) {
        A a = new A();
        InterfaceViolateISP b = new B();
        System.out.println("A depend :");
        a.depend1(b);a.depend2(b);a.depend3(b);

        System.out.println();

        C c = new C();
        InterfaceViolateISP d = new D();
        System.out.println("C depend :");
        c.depend1(d);c.depend4(d);c.depend5(d);
    }

}