package liskovSubstitution.v2ObeyLSP.entity;

import liskovSubstitution.v2ObeyLSP.entity.base.Base;

public class A extends Base {

    public int func1(int num1, int num2) {
        return num1 - num2;
    }

}
