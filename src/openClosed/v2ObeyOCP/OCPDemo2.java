package openClosed.v2ObeyOCP;

import openClosed.v2ObeyOCP.entity.GraphicEditor;
import openClosed.v2ObeyOCP.entity.shapes.Circle;
import openClosed.v2ObeyOCP.entity.shapes.Rectangle;
import openClosed.v2ObeyOCP.entity.shapes.Triangle;

public class OCPDemo2 {

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Circle());
        editor.drawShape(new Rectangle());
        editor.drawShape(new Triangle());
    }

}
