package interfaceSegregation.v1ViolateISP.entity;

import interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.InterfaceViolateISP;


/* A 通过 接口 InterfaceViolateISP 依赖 B */
/* 但是 A 只会用到 Interface_violate_ISP 的 op1, op2, op3 */
public class A {

    public void depend1(InterfaceViolateISP i) {
        i.op1();
    }

    public void depend2(InterfaceViolateISP i) {
        i.op2();
    }

    public void depend3(InterfaceViolateISP i) {
        i.op3();
    }

}
