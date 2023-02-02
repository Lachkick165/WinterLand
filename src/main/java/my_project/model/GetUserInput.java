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
            System.out.println("These are available for u [red, green, orange, black, blue, white] selected Colour: "+ selectedColour);
            String colour = scanner.nextLine();

            switch (colour){
                case "red" -> {
                    VariableContainer.snowballColor = new Color(153, 26, 26);
                    selectedColour = "red";
                    System.out.println("Nice choice!" +colour);
                }
                case "green" -> {
                    VariableContainer.snowballColor = new Color(86, 217, 38);
                    selectedColour = "green";
                    System.out.println("Nice choice!" +colour);
                }
                case "orange" -> {
                    VariableContainer.snowballColor = new Color(255, 142, 16);
                    selectedColour = "orange";
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
