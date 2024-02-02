/*
    Aufgabe 4) Dynamische Elemente in Verbindung mit StdDraw und Schleifen
*/
public class Aufgabe4 {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(500,500);
        StdDraw.enableDoubleBuffering();

        for(int i = 0; i<=1000;i++){
            if (i<500){
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledCircle(i/500.0,1-(i/500.0),10/500.0);
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledCircle(i/500.0,i/500.0,10/500.0);
                }
                else{
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(1-(i-500.0)/500.0,(i-500.0)/500.0,10/500.0);
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(1-(i-500.0)/500.0,1-(i-500.0)/500.0,10/500.0);
            }
                StdDraw.show();
                StdDraw.pause(5);
                StdDraw.clear();

        }
    }
}

