package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {

    public Tree(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(75, 61, 40));
        drawTool.drawFilledRectangle(x, y, 20, 50);

        drawTool.setCurrentColor(new Color(38, 70, 42));
        drawTool.drawFilledTriangle(x - 10, y, x + 30, y, x + 10, y - 100);
    }
}
