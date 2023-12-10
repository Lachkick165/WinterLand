package my_project.control;

import KAGO_framework.control.Drawable;
import KAGO_framework.control.ViewController;
import my_project.model.*;

import java.awt.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute
    player2 Player2;
    Points points;
    GetUserInput getUserInput;

    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {

        Moon moon = new Moon(300, 10, viewController);
        viewController.draw(moon);

        StreetAndLandscape street = new StreetAndLandscape(0, 400);
        viewController.draw(street);

        SetupTree(30, 340);
        SetupTree(90, 260);
        SetupTree(140, 300);
        SetupTree(220, 210);
        SetupTree(210, 320);
        SetupTree(500, 260);
        SetupTree(350, 350);
        SetupTree(420, 260);
        SetupTree(460, 350);
        SetupTree(500, 260);

        Player player = new Player(300, 530, viewController);
        viewController.draw(player);
        viewController.register(player);

        Player2 = new player2(500, 500, 20, 20);
        viewController.draw(Player2);

        for(int i = 1; i <=500; i++){
            Snow ssll = new Snow(Math.random()*600+-100, Math.random()*-1+-629, Math.random()*3+1.5, Math.random()*400+230, Color.WHITE);
            VariableContainer.snowList.append(ssll);
            viewController.draw(ssll);
        }

        points = new Points(0);
        viewController.draw(points);

        getUserInput = new GetUserInput();
        Thread thread = new Thread(()->{
            getUserInput.getUserInput();
        });
        thread.start();
    }

    public void SetupTree(double x, double y) {
        Tree tree = new Tree(x, y);
        viewController.draw(tree);
    }
    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt) {
        for (int i = 0; i <= VariableContainer.snowBalls.size() - 1; i++) {
            SnowBall ball = VariableContainer.snowBalls.get(i);
            if(CollisionDetector.circleWithRectangle(ball.getX(), ball.getY(), ball.getRadius(), Player2.getX(), Player2.getY(), Player2.getWidth(), Player2.getHeight())){

                VariableContainer.player2Colour = VariableContainer.snowballColor;
            }
            VariableContainer.snowList.toFirst();
            while (VariableContainer.snowList.hasAccess()){
                Snow snowing = VariableContainer.snowList.getContent();
                if (CollisionDetector.circleCircle(ball.getX(), ball.getY(), ball.getRadius(), snowing.getX(), snowing.getY(), snowing.getRadius())){

                    snowing.setColor(VariableContainer.snowballColor);
                    points.setPoints(points.getPoints()+1);
                }
                VariableContainer.snowList.next();
            }
        }

        getUserInput.setMegaPoints(points.getMegaPoints());
    }
}

