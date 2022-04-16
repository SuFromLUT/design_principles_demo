1. 问题
    - Vehicle类 违反了 [单一职责原则]，导致程序出错
      
      Motor is running on the road.
      
      Car is running on the road.
      
      Plane is running on the road.
   

2. 解决方案
   - 根据交通工具的运行方法不同，分解成不同的类
   
   `Vehicle -> {RoadVehicle, AirVehicle, WaterVehicle}`
