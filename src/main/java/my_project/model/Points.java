package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Points extends InteractiveGraphicalObject {

    int points;
    int megaPoints = 0;
    public Points(int points){
        this.points = points;
    }
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(153, 26, 26));
        drawTool.drawText(0, 10, "Points: "+ points + "/1000");
        drawTool.drawText(0, 20, "MegaPoints: "+ megaPoints);
        drawTool.setCurrentColor(Color.WHITE);
    }
    public int getMegaPoints() {
        return megaPoints;
    }
    public void update(double dt) {
        if (points > 1000){
            points = 0;
            megaPoints += 1;
        }
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getPoints() {
        return points;
    }
}
