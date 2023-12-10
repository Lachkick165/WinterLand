package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snow extends InteractiveGraphicalObject {
    double speed;
    Color color;
    double randomValue;
    public Snow(double x, double y, double radius, double randomValue, Color color){
        this.x = x;
        this.y = y;
        speed = Math.random()*70+50;
        this.radius = radius;
        this.color = color;
        this.randomValue = randomValue;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(color);
        drawTool.drawFilledCircle(x, y, radius);
    }

    public void update(double dt) {
        y += dt * speed;
        x += dt * 10;

        if (radius <= 2 && radius >= 1.5){
            randomValue = Math.random()*100+230;
        }
        if (radius <= 3 && radius >= 2){
            randomValue = Math.random()*100+330;
        }
        if (radius <= 4 && radius >= 3){
            randomValue = Math.random()*100+430;
        }
        if (radius <= 4.5 && radius >= 4){
            randomValue = Math.random()*100+530;
        }

        if (y >= randomValue){
            x = Math.random()*600+-100;
            y = Math.random()*-1+-400;
            speed = Math.random()*70+50;
            radius = Math.random()*3+1.5;
        }
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
