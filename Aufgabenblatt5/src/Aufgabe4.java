import java.awt.*;

/*
    Aufgabe 4) Rekursion und Zeichnen mit StdDraw
*/
public class Aufgabe4 {

    //constant circle radius
    private static final int RADIUS = 10;

    private static void printCirclesInLine(int val, int x, int y) {
        if (val == 0) return;
        if (val % 2 == 0) StdDraw.setPenColor(Color.orange);
        else StdDraw.setPenColor(Color.blue);
        StdDraw.filledCircle(x, y, RADIUS);
        StdDraw.filledCircle(x, y + RADIUS * 2, RADIUS);
        printCirclesInLine(val -= 1, x + RADIUS * 2, y);
    }

    private static void printShape(int val, int max, int y) {
        int distance = 4 * RADIUS;
        if (val < max) {
            printCirclesInLine(val, RADIUS, y);
            printCirclesInLine(val, RADIUS, y+((max-val)*2)*distance);
            printShape(val += 1, max, y += distance);
        }
        if (val == max) {
            printCirclesInLine(val, RADIUS, y);
        }

    }

    public static void main(String[] args) {
        int pixelWidth = 200;
        int pixelHeight = 760;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);

        //Erzeugt Abbildung 2a
        printShape(1, 10, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2b
        printShape(1, 5, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2c
        printShape(1, 1, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2d
        printShape(3, 9, RADIUS);

    }
}

