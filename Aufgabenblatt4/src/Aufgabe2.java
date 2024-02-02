import java.awt.*;

/*
    Aufgabe 2) Eindimensionale Arrays - Schreiben, Lesen und Verwenden
*/
public class Aufgabe2 {

    private static int[] genRandomArray(int numValues, int maxValue) {
        int[] randomArray = new int[numValues];
        for (int i = 0; i < numValues; i++) {
            randomArray[i] = (int) (Math.random() * maxValue);
        }
        return randomArray;
    }

    private static int getMaxValueFromArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max) max = array[i];
        return max;
    }

    private static int[] calcStatistics(int[] array) {
        int[] countArray = new int[getMaxValueFromArray(array) + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]] += 1;
        }
        return countArray;
    }

    private static void drawBarChart(int[] array) {
        StdDraw.setCanvasSize(600, 400);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 400);
        double balkenBreite = 600 / array.length;
        double balkenHöhe = 400 / getMaxValueFromArray(array);
        double zahlPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0)zahlPosition = 10;
            if(array[i]!=0)zahlPosition= array[i] * balkenHöhe / 2 + balkenHöhe / 2 * array[i] - 10 ;
            StdDraw.setPenColor(Color.green);
            StdDraw.filledRectangle(balkenBreite / 2 + i * balkenBreite, array[i] * balkenHöhe / 2, balkenBreite / 2, balkenHöhe / 2 * array[i]);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(balkenBreite / 2 + i * balkenBreite, array[i] * balkenHöhe / 2, balkenBreite / 2, balkenHöhe / 2 * array[i]);
            StdDraw.text(balkenBreite / 2 + i * balkenBreite, 30, Integer.toString(i));
            StdDraw.text(balkenBreite / 2 + i * balkenBreite, zahlPosition, Integer.toString(array[i]));
        }
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Test 1: 50 Werte im Intervall von [0,20[
        int[] myArray = genRandomArray(50, 20);
        int[] myStat = calcStatistics(myArray);
        print(myArray);
        print(myStat);
        drawBarChart(myStat);

        //Test 2: 100 Werte im Intervall von [0,10[
        StdDraw.pause(10000);
        myArray = genRandomArray(100, 10);
        myStat = calcStatistics(myArray);
        print(myArray);
        print(myStat);
        drawBarChart(myStat);
    }
}

