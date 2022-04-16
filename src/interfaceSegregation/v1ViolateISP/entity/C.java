package interfaceSegregation.v1ViolateISP.entity;

import interfaceSegregation.v1ViolateISP.entity.interfaceViolateISP.InterfaceViolateISP;


/* C 通过 接口 InterfaceViolateISP 依赖 D */
/* 但是 C 只会用到 Interface_violate_ISP的 op1, op4, op5 */
public class C {

    public void depend1(InterfaceViolateISP i) {
        i.op1();
    }

    public void depend4(InterfaceViolateISP i) {
        i.op4();
    }

    public void depend5(InterfaceViolateISP i) {
        i.op5();
    }

}
