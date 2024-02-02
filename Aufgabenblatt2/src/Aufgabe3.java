import java.awt.*;

/*
    Aufgabe 3) Verschachtelte Schleifen und Verzweigungen - Optische Täuschung
*/
public class Aufgabe3 {
    
    public static void main(String[] args) {
        int quadSize = 40;
        int vertikal = 11;
        int horizontal = 10;
        StdDraw.setCanvasSize(quadSize*horizontal, quadSize*vertikal);
        StdDraw.setXscale(0,quadSize*horizontal);
        StdDraw.setYscale(0,quadSize*vertikal);
        for(int i = 0;i<2*horizontal-1;i++){
            for(int t = 0; t<vertikal; t++) {
                if (i < horizontal) { //mit den Werten 0-9 wird das Raster gezeichnet
                   if(((i+t)%2)==0) StdDraw.setPenColor(166, 166, 76);
                   if(((i+t)%2)==1) StdDraw.setPenColor(90, 90, 0);
                    StdDraw.filledSquare(quadSize / 2 + quadSize * i, quadSize / 2 + quadSize * t, quadSize / 2);
                }
                if((i>horizontal-1)&&(t<vertikal/2)){
                    if (((i+t)%2)==0) {
                        StdDraw.setPenColor(Color.white);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/4, quadSize/20);
                    }
                    if (((i+t)%2)==1){
                        StdDraw.setPenColor(Color.white);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/20, quadSize/4);
                    }
                    if (((i+t)%2)==1) {
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/4,  quadSize/20);
                    }
                    if (((i+t)%2)==0){
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/20, quadSize/4);
                    }
                }
                if((i>horizontal-1)&&(t>=vertikal/2)&&(t<vertikal-1)){
                    if (((i+t)%2)==0) {
                        StdDraw.setPenColor(Color.white);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/20, quadSize/4);
                    }
                    if (((i+t)%2)==1){
                        StdDraw.setPenColor(Color.white);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/4, quadSize/20);
                    }
                    if (((i+t)%2)==1) {
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/20, quadSize/4);
                    }
                    if (((i+t)%2)==0) {
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle(quadSize + i % 10 * quadSize, quadSize + t * quadSize, quadSize/4, quadSize/20);
                    }
                }
            }
        }
    }
}
