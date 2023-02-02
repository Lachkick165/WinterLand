package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

public class player2 extends InteractiveGraphicalObject {
    public player2(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(VariableContainer.player2Colour);
        drawTool.drawFilledRectangle(x, y, width, height);
    }
}
