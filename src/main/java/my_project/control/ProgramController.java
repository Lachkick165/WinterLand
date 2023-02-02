package my_project.control;

import KAGO_framework.control.Drawable;
import KAGO_framework.control.ViewController;
import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute
    player2 Player2;

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

        Tree tree1 = new Tree(30, 340);
        viewController.draw(tree1);

        Tree tree2 = new Tree(90, 260);
        viewController.draw(tree2);

        Tree tree3 = new Tree(140, 300);
        viewController.draw(tree3);

        Tree tree4 = new Tree(220, 210);
        viewController.draw(tree4);

        Tree tree5 = new Tree(210, 320);
        viewController.draw(tree5);

        Tree tree6 = new Tree(500, 260);
        viewController.draw(tree6);

        Tree tree7 = new Tree(350, 350);
        viewController.draw(tree7);

        Tree tree8 = new Tree(420, 260);
        viewController.draw(tree8);

        Tree tree9 = new Tree(460, 350);
        viewController.draw(tree9);

        Tree tree10 = new Tree(500, 260);
        viewController.draw(tree10);

        Tree tree11 = new Tree(500, 260);
        viewController.draw(tree11);

        Tree tree12 = new Tree(500, 260);
        viewController.draw(tree12);

        Player player = new Player(300, 530, viewController);
        viewController.draw(player);
        viewController.register(player);

        Player2 = new player2(500, 500, 50, 50);
        viewController.draw(Player2);

        for(int i = 1; i <=500; i++){
            Snow snow = new Snow(0, 0);
            viewController.draw(snow);
        }
    }
    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt) {
        for (int i = 0; i < VariableContainer.Snowballs.size(); i++){
            SnowBall ball = VariableContainer.Snowballs.get(i);
            viewController.draw(ball);

            // Collision Detection
            if(CollisionDetector.circleWithRectangle(ball.getX(), ball.getY(), ball.getRadius(), Player2.getX(), Player2.getY(), Player2.getWidth(), Player2.getHeight())){
                System.out.println("Collision");
            }
            VariableContainer.Snowballs.remove(ball);
        }
    }
}
