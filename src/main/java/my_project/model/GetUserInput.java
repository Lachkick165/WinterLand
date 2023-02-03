package my_project.model;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class GetUserInput {
    public static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String selectedColour = "";
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nWhat color does the snowball should have?");
        while (true){
            System.out.println("These are available for u [red, purple, skyblue, black, blue, white] selected Colour: "+ selectedColour);
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
                default -> System.out.println("That's not a colour");
            }
        }
    }
}
