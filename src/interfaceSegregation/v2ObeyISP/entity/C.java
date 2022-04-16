package interfaceSegregation.v2ObeyISP.entity;

import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceBD;
import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceD;

public class C {
    public void depend1(InterfaceBD i) {
        i.op1();
    }

    public void depend4(InterfaceD i) {
        i.op4();
    }

    public void depend5(InterfaceD i) {
        i.op5();
    }
}
