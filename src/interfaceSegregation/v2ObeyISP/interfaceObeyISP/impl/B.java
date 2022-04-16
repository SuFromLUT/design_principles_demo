package interfaceSegregation.v2ObeyISP.interfaceObeyISP.impl;

import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceB;
import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceBD;

public class B implements InterfaceBD, InterfaceB {
    @Override
    public void op1() {
        System.out.println("B, 1");
    }

    @Override
    public void op2() {
        System.out.println("B, 2");
    }

    @Override
    public void op3() {
        System.out.println("B, 3");
    }


}
