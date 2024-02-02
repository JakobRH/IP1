/*
    Aufgabe 2) Neugestaltung von Spaghetti-Code durch Methoden
*/
public class Aufgabe2 {
    
    public static void main(String[] args) {
        
        String text1 = "Have a great day!";
        String text2 = "This is a Teststring";
        int num1 = 35061;
        int num2 = 1010;
        
        for (int i = 0; i < text1.length()-1; i++) {                //Block 1 gibt String mit einem gewählten Char
            System.out.print(text1.charAt(i));                      // zwischen jedem Char aus dem String aus
            System.out.print('-');
        }
        System.out.println(text1.charAt(text1.length()-1));        //Block 2 gibt eine Zahl mit einem gewählten Char
        int decades = 1;                                           // zwischen jeder Ziffer aus
        int digitCount = 0;
        while(num1 > decades) {
            decades = decades * 10;
            digitCount++;
        }
        decades /= 10;
        while(num1 > 0) {
            System.out.print(num1 / decades);
            num1 %= decades;
            digitCount--;
            if (num1 > 0) {
                System.out.print('*');
            }
            else if(digitCount > 0){
              System.out.println("*0");
            }
            decades/=10;
        }
        System.out.println();
        int len = text2.length()-1;
        while (len > -1) {
            System.out.print(text2.charAt(text2.length()-1-len));
            if(len > 0) {
                System.out.print('.');
            }
            len--;
        }
        System.out.println();
        String separators = "#.+";
        for (int i = 0; i < separators.length(); i++) {
            for (int j = 0; j < text1.length()-1; j++) {
                System.out.print(text1.charAt(j));
                System.out.print(separators.charAt(i));
            }
            System.out.println(text1.charAt(text1.length()-1));
        }
        int dec = 1;
        int numDigits = 0;
        while(num2 > dec) {
            dec *= 10;
            numDigits += 1;
        }
        dec = dec / 10;
        while(num2 > 0) {
            numDigits--;
            System.out.print(num2 / dec);
            num2 = num2 % dec;
            if (num2 > 0) {
                System.out.print('#');
            }
            else if(numDigits > 0){
              System.out.print('#');
              System.out.println('0');
            }
            dec /= 10;
        }
        System.out.println();

         //////////////////////////////////////
        stringBauer(text1,'-');
        zeichenZwischenZiffer(35061 ,'*');
        stringBauer(text2,'.');
        stringBauer(text1,'#');
        stringBauer(text1,'.');
        stringBauer(text1,'+');
        zeichenZwischenZiffer(1010, '#');
    }
    
    public static void stringBauer( String str, char c){
        for(int i = 0; i <str.length()-1;i++){
            System.out.print(str.charAt(i));
            System.out.print(c);
        }
        System.out.println(str.charAt(str.length()-1));
    }

    public static void zeichenZwischenZiffer(int num, char c ){
        int digitCount = 0;
        int ten = 1;
        while(num > ten) {
            ten = ten * 10;
            digitCount++;
        }
        ten /= 10;
        while(num > 0) {
            System.out.print(num / ten);
            num %= ten;
            digitCount--;
            if (num > 0) {
                System.out.print(c);
            } else if (digitCount > 0) {
                System.out.println(c + "0");
            }
            ten /= 10;
        }
        System.out.println();
    }
}
