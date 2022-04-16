![violate_ISP](v1ViolateISP.png)
1. 问题
    - 上图的设计明显违反了 接口隔离原则，使得类 B 中 op4() 和 op5() 和 类 D 中 op2() 和 op3() 方法冗余(写了但是用不着)
   

2. 解决
   - 根据 接口隔离原则(ISP)，将接口 InterfaceViolateISP 拆分为独立的几个接口，类 A 和 类 C 分别与他们需要的接口建立依赖关系。