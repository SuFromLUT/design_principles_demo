package openClosed.v1ViolateOCP.entity;

import openClosed.v1ViolateOCP.entity.shape.base.Shape;


// 用于绘图的类 [使用方]
public class GraphicEditor {

    private void drawCircle(Shape s) {
        System.out.println("Circle");
    }

    private void drawRectangle(Shape s) {
        System.out.println("Rectangle");
    }

    private void drawTriangle(Shape s) {
        System.out.println("Triangle");
    }

    // 根据图形的种类来绘制
    public void drawShape(Shape s) {
        if (s.getType() == 1) {
            drawRectangle(s);
        } else if (s.getType() == 2) {
            drawCircle(s);
        }
        else if (s.getType() == 3) drawTriangle(s);
    }
}
