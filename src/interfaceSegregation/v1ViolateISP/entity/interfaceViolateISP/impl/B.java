package interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.impl;

import interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.InterfaceViolateISP;

public class B implements InterfaceViolateISP {
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

    @Override
    /* fixme op4() 方法是冗余的 */
    public void op4() {
        System.out.println("B, 4");
    }

    @Override
    /* fixme op5() 方法是冗余的 */
    public void op5() {
        System.out.println("B, 5");
    }
}
