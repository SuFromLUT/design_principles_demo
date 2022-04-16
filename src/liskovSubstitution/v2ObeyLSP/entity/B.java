package liskovSubstitution.v2ObeyLSP.entity;

import liskovSubstitution.v2ObeyLSP.entity.base.Base;

public class B extends Base {

    A ac;

    public B() {
        ac = new A();
    }

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return ac.func1(a, b) + 9;
    }

}
