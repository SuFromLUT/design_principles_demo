package interfaceSegregation.v2ObeyISP.entity;


import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceB;
import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceBD;

public class A {
    public void depend1(InterfaceBD i) {
        i.op1();
    }

    public void depend2(InterfaceB i) {
        i.op2();
    }

    public void depend3(InterfaceB i) {
        i.op3();
    }
}
