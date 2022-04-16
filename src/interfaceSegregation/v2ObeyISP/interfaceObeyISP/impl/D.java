package interfaceSegregation.v2ObeyISP.interfaceObeyISP.impl;

import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceBD;
import interfaceSegregation.v2ObeyISP.interfaceObeyISP.InterfaceD;

public class D implements InterfaceBD, InterfaceD {
    @Override
    public void op1() {
        System.out.println("D, 1");
    }

    @Override
    public void op4() {
        System.out.println("D, 4");
    }

    @Override
    public void op5() {
        System.out.println("D, 5");
    }
}
