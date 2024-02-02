/*
    Aufgabe 1) Variablen, Datentypen, Typumwandlungen und Strings
*/
public class Aufgabe1 {

    public static void main(String[] args) {

        float num1 = 1234e-3f;
        float num2 = 1.23f;
        double num3 = 1.234e3;
        double num4 = 43.21;
        long num5 = 1234L;
        int num6 = 0xa;
        int num7 = 014;
        char char1 = 'Z';
        char char2 = ' ';
        byte num8 = 123;
        short num9 = 4321;

        String konkatenation = num1 + " ," + num2 + " ," + num3 + " ," + num4 + " ," + num5 + " ," + num6 + " ," +
                num7 + " ," + char1 + " ," + char2 + " ," + num8 + " ," + num9;
        System.out.println(konkatenation);

        long produkt1 = (long) num1 * (long) num2 * (long) num3 * (long) num4 * num5;
        long produkt2 = num6 * num7 * char2 * char1;
        long produkt3 = num8 * num9;
        double produkt = (double)produkt1*produkt2*produkt3;
        System.out.println(produkt);

        double summe1 = num1+num2+num3+num4+num5+num6+num7+num8+num9+char1+char2;
        int summe = (int) summe1;
        System.out.println(summe);

        int summeByte = (byte) num1 + (byte) num2 + (byte) num3 + (byte) num4 + (byte) num5 + (byte) num6 +
                (byte) num7 + (byte) char1 + (byte) char2 + num8 + (byte) num9;
        System.out.println(summeByte);
        // ZusatzfragenBspA:
        //1. Es wird nur der Dezimalwert der Zahlen auf der Konsole ausgegeben!
        //2. Es kann bei der Umwandlung zu einem Overflow kommen, was bedeutet, dass nicht der tasächliche Wert
        //bzw ein negativer Wert rauskommmen kann.
        //3. Wenn bei der Umwandlung kein Fehler und Ungenauigkeiten passieren können. z.B. byte zu short
        //4.Da der + Operator linksassoziativ ist, wird bei st + i +c ein String mit dem Wert des Integers und der
        //Char-Variable hinten angehängt herauskommen. Bei i + c + st, wird zuerst der Wert des Integers mit dem Wert
        // des Chars(ASCII-Code)addiert und anschließend am String angehängt.
        
        String sentence = "Aufgabenblatt1 besteht aus 4 Aufgaben!";
        char indexChar = sentence.charAt(10);
        System.out.println(indexChar);
        int strLenght = sentence.length();
        System.out.println(strLenght);
        boolean isEmpty = sentence.isEmpty();
        System.out.println(isEmpty);
        boolean startsWith = sentence.startsWith("Auf");
        System.out.println(startsWith);
        String subString1 = sentence.substring(27);
        System.out.println(subString1);
        String subString2 = sentence.substring(0,13);
        System.out.println(subString2);
        String konkatenation2 = sentence.concat(subString2);
        System.out.println(konkatenation2);
        String replace1 = sentence.replaceAll("e","X");
        System.out.println(replace1);
        String replace2 = sentence.replaceAll("aus","AUS");
        System.out.println(replace2);
        String upperCase = subString1.toUpperCase();
        System.out.println(upperCase);
        String lowerCase = sentence.toLowerCase();
        System.out.println(lowerCase);

        //ZusatzfrageBspB:
        //Man könnte mit der Methode charAt die gewünschten Index in der richtigen Reihenfolge in eine leere
        //String-Variable geben bzw. wenn es viele Stellen wären eine Schleife dafür zu schreiben.
        
        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
}




