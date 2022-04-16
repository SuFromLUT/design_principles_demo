package openClosed.v1ViolateOCP;

import openClosed.v1ViolateOCP.entity.GraphicEditor;
import openClosed.v1ViolateOCP.entity.shape.Circle;
import openClosed.v1ViolateOCP.entity.shape.Rectangle;

public class OCPDemo1 {
    public static void main(String[] args) {
        new GraphicEditor().drawShape(new Circle());
        new GraphicEditor().drawShape(new Rectangle());
    }
}
