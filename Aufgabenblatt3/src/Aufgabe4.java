/*
    Aufgabe 4) Grafische Aufbereitung v. "GuessingGame" und Verwendung v. Methoden
*/

import java.awt.*;
import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {

        int pixelWidth = 300;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        int rand = zufallsZahl();
        boolean sieg = false;
        System.out.println("Erraten sie eine Zahl zwischen -100 und 100! Sie haben 8 Versuche!");
        for (int versuch = 1; versuch <= 9; versuch++) {
            picture(pixelWidth, pixelHeight, sieg, versuch);
            if (versuch == 9 && sieg == false) System.out.println("Verloren");
            else {
                int raten = rate();
                if (raten > rand) System.out.println("Zahl zu groß");
                if (raten < rand) System.out.println("Zahl zu klein");
                if (raten == rand && versuch != 9) {
                    System.out.println("Gewonnen");
                    sieg = true;
                    versuch = 9;
                }
            }
            if (versuch != 9) StdDraw.clear();
        }
    }

    public static void picture(int pixelWidth, int pixelHeight, boolean sieg, int versuch) {
        if (sieg == true) {
            StdDraw.setPenColor(Color.green);
            StdDraw.text(150, 150, "You WON!!!");
        }
        if (versuch <= 1) {
            StdDraw.setPenColor(Color.red);
            StdDraw.filledRectangle(pixelWidth / 2, pixelHeight / 2 - 20, 25, 30);
        }
        if (versuch <= 2) {
            StdDraw.setPenColor(Color.cyan);
            StdDraw.filledRectangle(pixelWidth / 2 - 50, pixelHeight / 2 - 40, 25, 10);
        }
        if (versuch <= 3) {
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.filledRectangle(pixelWidth / 2 - 17, pixelHeight / 2 - 10, 5, 5);
        }
        if (versuch <= 4) {
            StdDraw.setPenColor(Color.cyan);
            StdDraw.filledRectangle(pixelWidth / 2 + 50, pixelHeight / 2 - 40, 25, 10);
        }

        if (versuch <= 5) {
            StdDraw.setPenColor(Color.black);
            StdDraw.filledCircle(pixelWidth / 2 - 50, pixelHeight / 2 - 55, 15);
        }
        if (versuch <= 6) {
            StdDraw.setPenColor(Color.black);
            StdDraw.filledCircle(pixelWidth / 2 + 50, pixelHeight / 2 - 55, 15);
        }
        if (versuch <= 7) {
            StdDraw.setPenColor(Color.gray);
            StdDraw.filledCircle(pixelWidth / 2 - 50, pixelHeight / 2 - 55, 10);
        }
        if (versuch <= 8) {
            StdDraw.setPenColor(Color.gray);
            StdDraw.filledCircle(pixelWidth / 2 + 50, pixelHeight / 2 - 55, 10);
        }
        if (versuch == 9 && sieg == false) {
            StdDraw.setPenColor(Color.red);
            StdDraw.text(150, 150, "You LOST!!!");
        }
    }

    public static int zufallsZahl() {
        int result = (int) (Math.random() * 201 + -100);
        return result;
    }

    public static int rate() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        for (int notInt = 0; notInt < 1; notInt++) {
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (result <= 100 && result >= -100) ;
                else {
                    notInt--;
                    System.out.println("Ungültiger Wert");
                }
            } else {
                notInt--;
                System.out.println("Ungültiger Wert");
            }
        }
        return result;
    }
}
