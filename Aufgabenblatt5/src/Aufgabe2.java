/*
    Aufgabe 2) Rekursion mit Strings
*/
public class Aufgabe2 {
    
    private static String insertIndex(String s) {
        if(s.isEmpty()) return "";

        char c1 = s.charAt(s.length()-1);
        String string1 = s.substring(0, s.length()-1);
        return "" + insertIndex(string1) + (s.length()-1) + c1;
    }
    
    private static String mixStrings(String s1, String s2) {
        if(s1.isEmpty()) return "";
        char c2 = s2.charAt(0);
        char c1 = s1.charAt(0);
        String s3 = s2.substring(1) + c2;
        return "" + c1 + c2 +mixStrings(s1.substring(1), s3);
    }
    
    private static String shiftMinCharLeft(String s) {
        if (s.length() <= 1) return s;
        String s2 = shiftMinCharLeft(s.substring(1));
        if(s.charAt(0) < s2.charAt(0)) return s;
        else return "" + s2.charAt(0) + s.charAt(0) + s2.substring(1);

    }
    
    public static void main(String[] args) {
        System.out.println(insertIndex("Hallo"));
        System.out.println(insertIndex("Fahrkarten!"));
        System.out.println(insertIndex(""));
        
        System.out.println(mixStrings("GROSS", "klein"));
        System.out.println(mixStrings("ABC", "klein"));
        System.out.println(mixStrings("GROESSER", "klein"));
        
        System.out.println(shiftMinCharLeft("xdbycfjadfmk"));
        System.out.println(shiftMinCharLeft("bcdefghijklmnoa"));
        System.out.println(shiftMinCharLeft(""));
    }
}


