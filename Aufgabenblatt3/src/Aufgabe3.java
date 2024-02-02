/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
*/
public class Aufgabe3 {
    
    public static void main(String[] args) {
        int pixelWidth = 600;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);

        drawLineOfH(100,100,100,20,5);
    }
    
    private static void drawHorizontalRect(int mx, int my, int length, int width) {
        StdDraw.line(mx-width/2, my-length/2,mx-width/2,my+length/2);
        StdDraw.line(mx-width/2, my+length/2,mx+width/2, my+length/2);
        StdDraw.line(mx+width/2, my+length/2, mx+width/2, my-length/2);
        StdDraw.line(mx+width/2, my-length/2, mx-width/2, my-length/2);
    }
    
    private static void drawVerticalRect(int mx, int my, int length, int width) {
        StdDraw.line(mx-length/2, my-width/2,mx-length/2,my+width/2);
        StdDraw.line(mx-length/2, my+width/2,mx+length/2, my+width/2);
        StdDraw.line(mx+length/2, my+width/2, mx+length/2, my-width/2);
        StdDraw.line(mx+length/2, my-width/2, mx-length/2, my-width/2);
    }
    
    private static void drawBigH(int mx, int my, int length, int width) {
        drawVerticalRect(mx, my, length, width);
        drawHorizontalRect(mx-(length/2-width/2), my,length,width);
        drawHorizontalRect(mx+(length/2-width/2),my,length,width);
    }
    
    private static void drawLineOfH(int sx, int sy, int length, int width, int numCopies) {
        for(int i = 0; i<numCopies;i++){
            drawBigH(sx+(length*i),sy,length,width);
        }
    }
}


