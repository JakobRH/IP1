import java.awt.*;

/*
    Aufgabe 3) Rekursion - Kreuzmuster
*/
public class Aufgabe3 {

    private static void drawCrossPattern(int x, int y, int l, boolean c) {
        double width = (l / 100.00) * 5;
        if (c) StdDraw.setPenColor(Color.red);
        else StdDraw.setPenColor(Color.blue);

        if (l < 16) return;

        StdDraw.filledRectangle(x, y, l / 2, width / 2);
        StdDraw.filledRectangle(x, y, width / 2, l / 2);
        drawCrossPattern(x - l / 4, y - l / 4, l / 2, !c);
        drawCrossPattern(x + l / 4, y + l / 4, l / 2, !c);
        drawCrossPattern(x - l / 4, y + l / 4, l / 2, !c);
        drawCrossPattern(x + l / 4, y - l / 4, l / 2, !c);
    }

    public static void main(String[] args) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setXscale(-256, 256);
        StdDraw.setYscale(-256, 256);
        drawCrossPattern(0, 0, 512, true);
    }
}



