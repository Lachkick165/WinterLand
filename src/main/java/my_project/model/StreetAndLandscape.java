package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class StreetAndLandscape extends GraphicalObject {

    public StreetAndLandscape(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(138, 88, 11));
        drawTool.drawFilledCircle(x, y - 170, 100);

        drawTool.setCurrentColor(new Color(150, 96, 15));
        drawTool.drawFilledCircle(x + 160, y - 170, 90);

        drawTool.setCurrentColor(new Color(121, 78, 10));
        drawTool.drawFilledCircle(x + 300, y - 170, 130);

        drawTool.setCurrentColor(new Color(150, 95, 10));
        drawTool.drawFilledCircle(x + 460, y - 170, 90);

        drawTool.setCurrentColor(new Color(122, 81, 15));
        drawTool.drawFilledCircle(x + 570, y - 170, 100);

        drawTool.setCurrentColor(new Color(1, 1, 1));
        drawTool.drawFilledCircle(x + 310, y - 170, 12);

        drawTool.setCurrentColor(new Color(14, 79, 18));
        drawTool.drawFilledRectangle(x, y - 170, 600, 200);
        drawTool.drawFilledRectangle(x, y + 60, 600, 140);

        drawTool.setCurrentColor(new Color(103, 102, 102));
        drawTool.drawFilledRectangle(x, y + 30, 600, 60);
        drawTool.drawFilledRectangle(x + 280, y - 170, 60, 200);

        drawTool.setCurrentColor(new Color(255, 255, 255));
        for(int i = 1; i<=10; i++){
            drawTool.drawFilledRectangle(x + 10 + (i - 1) * 60, y + 55, 36, 10);
        }

        drawTool.drawFilledRectangle(x + 307.5, y - 170, 6, 10);
        drawTool.drawFilledRectangle(x + 307.5, y - 150, 7, 20);
        drawTool.drawFilledRectangle(x + 306.5, y - 120, 8, 30);
        drawTool.drawFilledRectangle(x + 305.5, y - 75, 9, 40);
        drawTool.drawFilledRectangle(x + 305, y - 25, 10, 50);

        drawTool.setCurrentColor(new Color(14, 79, 18));
        drawTool.drawFilledTriangle(x + 280, y - 170, x + 300, y - 170, x + 280, y + 30);
        drawTool.drawFilledTriangle(x + 340, y - 170, x + 320, y - 170, x + 340, y + 30);
    }
}
