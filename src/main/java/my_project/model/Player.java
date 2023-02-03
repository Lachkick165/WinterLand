package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.event.MouseEvent;
import java.awt.*;

public class Player extends InteractiveGraphicalObject {
    ViewController viewController;
    int velocity = 100;
    double r = 21;
    double mouseX = 0;
    double mouseY = 0;
    double coolDown = 0;
    double maxCoolDown = 0.1;

    public Player(double x, double y, ViewController viewController) {
        this.x = x;
        this.y = y;
        this.viewController = viewController;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(225, 209, 209));
        drawTool.drawFilledCircle(x, y + r / 3, r);
        drawTool.drawFilledCircle(x, y - r * 1.2, r - r * 0.2);
        drawTool.drawFilledCircle(x, y - r * 2.3, r - r / 3);
    }

    public void update(double dt) {
        coolDown -= dt;

        if (ViewController.isKeyDown(68)) {
            x += velocity * dt;
        }
        if (ViewController.isKeyDown(65)) {
            x -= velocity * dt;
        }
        if (ViewController.isKeyDown(87)) {
            y -= velocity * dt;
            if(y<=410){
                r-=10*dt;
            }
        }
        if (ViewController.isKeyDown(83)) {
            y += velocity * dt;
            if(y<=410){
                r+=10*dt;
            }
        }
        if (x >= 600 - r*2 || x <= 0 + r || y >= 580 - r || y <= 0 + r) {
            velocity = velocity * -1;
        }
        if(y>=410){
            r = 21;
        }
    }
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1 && coolDown < 0){
            coolDown = maxCoolDown;
            double angle = Math.atan2(mouseY - y,mouseX - x);

            double dirX = Math.cos(angle);
            double dirY = Math.sin(angle);

            SnowBall s = new SnowBall(x,y - 23,dirX,dirY,y/50);
            VariableContainer.snowBalls.add(s);
            viewController.draw(s);
        }
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }
}
