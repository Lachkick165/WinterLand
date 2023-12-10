package my_project.model;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class GetUserInput {
    static int megaPoints;
    public void setMegaPoints(int megaPoints) {
        this.megaPoints = megaPoints;
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String selectedColour = "";
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nWhat color does the snowball should have?");
        while (true){
            if (megaPoints <= 10){
                System.out.println("These are available for u [red, purple, skyblue, black, blue, white, yellow] selected Colour: "+ selectedColour);
            }else{
                System.out.println("These are available for u [red, purple, skyblue, black, blue, white, yellow, Lowball] selected Colour: "+ selectedColour);
            }

            String colour = scanner.nextLine();

            switch (colour){
                case "red" -> {
                    VariableContainer.snowballColor = new Color(153, 26, 26);
                    selectedColour = "red";
                    System.out.println("Nice choice!" +colour);
                }
                case "purple" -> {
                    VariableContainer.snowballColor = new Color(138, 16, 203);
                    selectedColour = "purple";
                    System.out.println("Nice choice!" +colour);
                }
                case "skyblue" -> {
                    VariableContainer.snowballColor = new Color(20, 211, 211);
                    selectedColour = "skyblue";
                    System.out.println("Nice choice!" +colour);
                }
                case "black" -> {
                    VariableContainer.snowballColor = new Color(0, 0, 0);
                    selectedColour = "black";
                    System.out.println("Nice choice!" +colour);
                }
                case "blue" -> {
                    VariableContainer.snowballColor = new Color(17, 9, 122);
                    selectedColour = "blue";
                    System.out.println("Nice choice!" +colour);
                }
                case "white" -> {
                    VariableContainer.snowballColor = new Color(255, 255, 255);
                    selectedColour = "white";
                    System.out.println("Nice choice!" +colour);
                }
                case "Lowball" -> {
                    VariableContainer.snowballColor = new Color(150, 95, 10);
                    selectedColour = "Lowball";
                    System.out.println("Nice choice!" +colour);
                }
                case "yellow" -> {
                    VariableContainer.snowballColor = new Color(255, 255, 0);
                    selectedColour = "yellow";
                    System.out.println("Nice choice!" +colour);
                }
                default -> System.out.println("That's not a colour");
            }
        }
    }
}
