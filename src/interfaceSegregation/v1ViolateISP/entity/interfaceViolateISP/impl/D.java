package interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.impl;

import interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.InterfaceViolateISP;

public class D implements InterfaceViolateISP {
    @Override
    public void op1() {
        System.out.println("D, 1");
    }

    @Override
    /* fixme op2() 方法是冗余的 */
    public void op2() {
        System.out.println("D, 2");
    }

    @Override
    /* fixme op3() 方法是冗余的 */
    public void op3() {
        System.out.println("D, 3");
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
