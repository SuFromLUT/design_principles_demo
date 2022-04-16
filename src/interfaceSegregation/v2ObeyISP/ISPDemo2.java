package interfaceSegregation.v2ObeyISP;


import interfaceSegregation.v2ObeyISP.entity.A;
import interfaceSegregation.v2ObeyISP.entity.C;
import interfaceSegregation.v2ObeyISP.interfaceObeyISP.impl.B;
import interfaceSegregation.v2ObeyISP.interfaceObeyISP.impl.D;

public class ISPDemo2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A depend : ");
        a.depend1(new B());a.depend2(new B());a.depend3(new B());

        System.out.println();

        C c = new C();
        System.out.println("C depend : ");
        c.depend1(new D());c.depend4(new D());c.depend5(new D());
    }
}
