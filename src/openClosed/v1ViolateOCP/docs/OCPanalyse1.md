1. 分析
   - 优
      - 易于理解，操作
   - 缺
      - 若需新增一个图形，需要的改动较大 `编写一个新的类，在GraphicEditor的drawShape种新增一个 if 条件`
      - 违反 OCP，修改了 `GraphicEditor` (使用者)

2. 解决——遵循OCP
   - 将`Shape`类置为抽象类，提供一个抽象的`draw`方法，予以子类实现。
     如此，在新建图形种类时，只需让新的图形类继承`Shape`类，并实现
     `draw`方法，如此就减少了`GraphicEditor`类的修改
     