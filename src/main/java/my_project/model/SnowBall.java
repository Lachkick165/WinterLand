package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

public class SnowBall extends InteractiveGraphicalObject {

    double dirX = 0;
    double dirY = 0;
    double speed = 30;
    public SnowBall(double x, double y, double dirX, double dirY, double radius){
        this.x = x;
        this.y = y;
        this.dirX = dirX;
        this.dirY = dirY;
        this.radius = radius;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(VariableContainer.snowballColor);
        drawTool.drawFilledCircle(x, y, radius);
    }

    public void update(double dt) {
        x += dirX * speed;
        y += dirY * speed;

        if(y<=410){
            radius-=dirY*-10*dt;
        }
    }
}