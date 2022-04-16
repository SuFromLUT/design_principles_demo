package singleResponsibility.v1ViolateSRP.entity;


// 交通工具类
public class Vehicle1 {

    /* fixme 违反了 [单一职责原则] */
    /* address
    * 根据交通工具的运行方法不同，分解成不同的类
    *  */
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road.");
    }
}
