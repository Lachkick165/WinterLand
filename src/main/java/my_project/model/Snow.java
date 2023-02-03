package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snow extends InteractiveGraphicalObject {
    double speed;
    double ran;
    Color color;
    public Snow(double x, double y, double radius, Color color){
        this.x = x;
        this.y = y;
        speed = Math.random()*70+50;
        this.radius = radius;
        this.color = color;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(color);
        drawTool.drawFilledCircle(x, y, radius);
    }

    public void update(double dt) {
        y += dt * speed;
        x += dt * 10;

        if(y>430 & y<434){
          ran = Math.random()*1;

          if(ran>0.5){
              x = Math.random()*600+-100;
              y = Math.random()*-1+-400;
              speed = Math.random()*70+50;
              radius = Math.random()*3+1.5;
          }
        }

        if(y>629) {
            x = Math.random()*600+-100;
            y = Math.random() * -1 + -400;
            speed = Math.random() * 70 + 50;
            radius = Math.random() * 3 + 1.5;
        }
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
