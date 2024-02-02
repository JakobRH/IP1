/*
    Aufgabe 3) Ein-/Zweidimensionale Arrays - Arbeiten mit String-Arrays
*/
public class Aufgabe3 {

    private static String[] extractSentences(String longString) {
        int range = 0;
        int lastDot = 0;
        boolean lastDot1 = false;
        for (int i = 0; i < longString.length(); i++) {
            if (longString.charAt(i) == '.') range += 1;
            if (longString.charAt(longString.length() - 1 - i) == '.') lastDot1 = true;
            if (lastDot1 == false) lastDot++;
        }
        lastDot = longString.length() - lastDot;
        String[] strArray = new String[range];
        int subStringPoint = 0;
        String halter = "";
        for (int j = 0; j < lastDot; j++) {
            if (longString.charAt(j) == '.') {
                strArray[subStringPoint] = halter + ".";
                halter = "";
                subStringPoint++;
            } else halter += longString.charAt(j);
        }
        return strArray;
    }

    private static void printArray(String[] workArray) {
        for (int i = 0; i < workArray.length; i++) {
            System.out.println(workArray[i]);
        }
    }

    private static String[][] countSentenceLength(String[] workArray) {
        String[][] array2d = new String[workArray.length][2];
        for (int i = 0; i < workArray.length; i++) {
            array2d[i][0] = workArray[i];
            array2d[i][1] = Integer.toString(workArray[i].length());
        }
        return array2d;
    }

    private static void printArray(String[][] workArray) {
        for (int i = 0; i < workArray.length; i++) {
            System.out.println(workArray[i][0] + "-->" + workArray[i][1]);
        }
    }

    public static void main(String[] args) {
        String[] sentences1 = extractSentences("Ich gehe jetzt einkaufen.Das Auto ist rot.Morgen gehen wir ins Kino.");
        printArray(sentences1);
        String[][] countedWordLength1 = countSentenceLength(sentences1);
        printArray(countedWordLength1);
        System.out.println();

        String[] sentences2 = extractSentences("Ich bin der erste Satz.Ich bin der zweite Satz ohne Punkt");
        printArray(sentences2);
        String[][] countedWordLength2 = countSentenceLength(sentences2);
        printArray(countedWordLength2);
        System.out.println();

        String[] sentences3 = extractSentences("Das ist ein Satz ohne Punkt");
        printArray(sentences3);
        String[][] countedWordLength3 = countSentenceLength(sentences3);
        printArray(countedWordLength3);
    }
}


