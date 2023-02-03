package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

public class player2 extends InteractiveGraphicalObject {
    public final static int WINDOW_WIDTH = 600;
    public final static int WINDOW_HEIGHT = 600+29;
    int velocity = 100;
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

    public void update(double dt) {
        if (ViewController.isKeyDown(39)) {
            x += velocity * dt;
        }
        if (ViewController.isKeyDown(37)) {
            x -= velocity * dt;
        }
        if (ViewController.isKeyDown(40)) {
            y += velocity * dt;
            if(y<=410){
                width +=10*dt;
                height +=10*dt;
            }
        }
        if (ViewController.isKeyDown(38)) {
            y -= velocity * dt;
            if(y<=410){
                width -=10*dt;
                height -=10*dt;
            }
        }
        if(y>=410){
            width = 20;
            height = 20;
        }
        if (x > WINDOW_WIDTH + 42) {
            x = WINDOW_WIDTH - WINDOW_WIDTH - 21;
        }
        if (x < WINDOW_WIDTH - WINDOW_WIDTH - 42){
            x = WINDOW_WIDTH + 21;
        }
        if (y > WINDOW_HEIGHT - 61){
            y = WINDOW_HEIGHT - 61;
        }
    }
}
