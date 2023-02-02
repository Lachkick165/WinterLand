package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Moon extends GraphicalObject {
    ViewController viewController;
    double rotation;
    public Moon(double x, double y, ViewController viewController){
        this.x = x;
        this.y = y;
        this.viewController = viewController;
    }

    public void draw(DrawTool drawTool) {
        drawTool.getGraphics2D().rotate(rotation, 300, 300);

        drawTool.setCurrentColor(new Color(243, 216, 117));
        drawTool.drawFilledCircle(x, y, 50);

        drawTool.setCurrentColor(new Color(255, 235, 0));
        drawTool.drawFilledCircle(x, 600 - y, 50);

        drawTool.getGraphics2D().rotate(-rotation, 300, 300);
    }

    public void update(double dt) {
        rotation += dt/4;

        if(rotation>0.64*Math.PI & rotation<1.64*Math.PI){
            viewController.getScene(0).drawingPanel.setBackground(new Color(32, 159, 156));
        }else{
            viewController.getScene(0).drawingPanel.setBackground(new Color(17, 9, 122));
        }

        if(rotation>=2*Math.PI){
            rotation = 0;
        }
    }
}
