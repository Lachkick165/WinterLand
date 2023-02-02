package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snow extends GraphicalObject {
    double speed;
    double r;
    double ran;
    public Snow(double x, double y){
        this.x = Math.random()*600;
        this.y = Math.random()*-1+-629;
        speed = Math.random()*70+50;
        r = Math.random()*3+1.5;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledCircle(x, y, r);
    }

    public void update(double dt) {
        y += dt * speed;

        if(y>430 & y<434){
          ran = Math.random()*1;

          if(ran>0.5){
              x = Math.random()*600;
              y = Math.random()*-1+-400;
              speed = Math.random()*70+50;
              r = Math.random()*3+1.5;
          }
        }

        if(y>629) {
            x = Math.random() * 600;
            y = Math.random() * -1 + -400;
            speed = Math.random() * 70 + 50;
            r = Math.random() * 3 + 1.5;
        }
    }
}
