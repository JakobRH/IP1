/*
    Aufgabe 3) StdDraw Bibliothek anwenden und erste Schleifen
*/
public class Aufgabe3 {
    
    public static void main(String[] args) {

        double width=1;
        double height=1;
        StdDraw.setCanvasSize(400,400);
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.line(0,height/2,width/2,height);
        StdDraw.line(width/2,height,width,height/2);
        StdDraw.line(width,height/2,width/2,0);
        StdDraw.line(width/2,0,0,height/2);

        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.filledRectangle(width/4*3,height/4*3,0.05,0.1);
        StdDraw.filledRectangle(width/4,height/4,0.1,0.05);

        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.filledEllipse(width/4,height/4*3,0.1,0.05);
        StdDraw.filledEllipse(width/4*3,height/4,0.05,0.1);

        for(int i = 0; i < 7; i++){
            if(i != 3)
            {
                StdDraw.setPenColor(StdDraw.ORANGE);
                StdDraw.filledCircle((50+i*50)/400.0,height/2,15/400.0);
            }
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.arc(width/2,(50+i*50)/400.0,15/400.0,45+i*45,225+i*45);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.arc(width/2, (50+i*50)/400.0,15/400.0,225+i*45,45+i*45);
        }

        //Zusatzfrage:Ja, jedoch habe sie ihre Vor und Nachteile, die man situationsabhängig ausnutzt.



    }
}

