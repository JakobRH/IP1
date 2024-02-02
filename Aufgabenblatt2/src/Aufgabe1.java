/*
    Aufgabe 1) Verschachtelung von Schleifen - Harshad-Zahlen - String Manipulation
*/
public class Aufgabe1 {
    
    public static void main(String[] args) {
        
        int maxNumber = 1000;
        for(int i = 1; i <= maxNumber; i++){
            if(i<10) System.out.println(i);
            if(i>9 &&i < 100){
                int einerStelle1 = i % 10;
                int dezimalStelle1 = (i-einerStelle1)/10;
                int querSumme1 = einerStelle1 + dezimalStelle1;
                if(i % querSumme1 == 0) System.out.println(i);
            }
            if(i>99 && i<1001){
                int einerStelle2 = i % 10;
                int dezimalStelle2 = (i % 100 - einerStelle2)/10;
                int hunderterStelle = (i-(dezimalStelle2*10)-einerStelle2)/100;
                int quersumme2 = einerStelle2 + dezimalStelle2 + hunderterStelle;
                if(i % quersumme2 == 0) System.out.println(i);
            }

        }
        //Teilaufgabe B:
        String str = "";
        for(int t = 1; t<=500; t++){
            if(t%15==0) str += "#" + t;
        }
        System.out.println(str);
        String str2 = "";
        for(int z = 0; z < str.length();z++){
            if(str.charAt(z) =='1') str2 += '!';
            else if (str.charAt(z) == '5') str2 += '$';
            else str2 += str.charAt(z);

        }
        System.out.println(str2);
    }
}

