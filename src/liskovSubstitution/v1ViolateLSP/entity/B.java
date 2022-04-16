package liskovSubstitution.v1ViolateLSP.entity;

public class B extends A {

    // fixme 重写了 A 类的方法
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    // 增加一个新功能：求两数之差，并加9
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

}
