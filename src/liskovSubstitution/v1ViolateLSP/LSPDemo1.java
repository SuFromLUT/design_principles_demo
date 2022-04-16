package liskovSubstitution.v1ViolateLSP;

import liskovSubstitution.v1ViolateLSP.entity.B;

public class LSPDemo1 {

    public static void main(String[] args) {
        B b = new B();
        /* fixme 预期 : 6, 实际 : 18
        *  原因 ： 类B继承于类A，并重写了类A的func1方法，没有遵循LSP
        *  */
        System.out.println(b.func2(3,6));
    }

}
