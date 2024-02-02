/*
    Aufgabe 1) Code-Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void genArray(int[] filledArray) {
        int value = 1;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = value;
            value += 3;
        }
    }

    private static void printFilteredArrayContent(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 4 == 0) {
                copiedArray[i] = 0;
            }
        }
        printArray(copiedArray);
    }

    private static void genNewArrayContent(int[] workArray) {
        int[] helpArray = new int[15];
        int value = 2;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = value;
            value += 5;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    private static void printArray(int[] workArray) {
        for (int i = 0; i < workArray.length; i++) {
            System.out.print(workArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] filledArray = new int[15];
        genArray(filledArray);
        printArray(filledArray);

        printFilteredArrayContent(filledArray);
        printArray(filledArray);

        filledArray[filledArray.length - 1] = 333;
        printArray(filledArray);

        genNewArrayContent(filledArray);
        printArray(filledArray);
    }

    //**************************************************************************
    //**** Notizen und Fragebeantwortungen bitte hier unterhalb durchführen! ***
    //**************************************************************************
    //Frage 1:Die Schleife von printArray läuft von 0 bis Länge des Arrays. Die Länge zählt jedoch von 1 weg und die
    //        Index des Arrays von 0. Deswegen will es gegen Ende der Schleife einen Index printen, welcher nicht mehr
    //        im Array ist.(z.B Länge 13, ArrayIndex[0,1....12], print workarray[13] X)
    //Frage 2: In genArray wird ein Array mit Werten befüllt,, welches nach Aufrufen der Methode eben die Werte
    //         beinhaltet. Braucht keinen Rückgabewert, da das Array eine Variable außerhalb der Methode ist.
    //Frage 3: Da copiedArray auf workArray zeigt, greifen beides Arrays auf diesselbe Referenz zu.
    //
    //Frage 4: In der Methode genNewArrayContent wird das Array im formalen Parameter nicht verwendet. Es wird lediglich
    //         ein neues Array mit Werten befüllt.
}

