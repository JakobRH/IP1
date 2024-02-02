/*
    Aufgabe 2) Verzweigungen
*/
public class Aufgabe2 {
    
    public static void main(String[] args) {
        
        //A) Gewichtskategorisierung
        int weight = 4;

        //1: Verschachtelung einfacher If-Anweisungen(ohne else-if)
        if(weight>=50)
            System.out.println(weight + "kg-->Extra-Schwer");
        if(weight>24 && weight<50)
            System.out.println(weight + "kg-->Schwer");
        if(weight<25&&weight>9)
            System.out.println(weight + "kg-->Mittelschwer");
        if(weight<10&&weight>=5)
            System.out.println(weight + "kg-->Leicht");
        if(weight<5)
            System.out.println(weight + "kg-->Extra Leicht");


        //2:Mehrfachverzwigung

        if(weight>=50)
            System.out.println(weight + "kg-->Extra-Schwer");
        else if(weight>24 && weight<50)
            System.out.println(weight + "kg-->Schwer");
        else if(weight<25&&weight>9)
            System.out.println(weight + "kg-->Mittelschwer");
        else if(weight<10&&weight>=5)
            System.out.println(weight + "kg-->Leicht");
        else
            System.out.println(weight + "kg-->Extra Leicht");
        //Zusatzfrage BspA : JA

        //B) Zahlenumrechner: Hexadezimalzahlen zwischen 0x0 und 0xF werden auf 4 Bits abgebildet.
        int hexNumber = 0xD;

        switch(hexNumber) {
            case 0x0:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0000");
                break;
            case 0x1:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0001");
                break;
            case 0x2:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0010");
                break;
            case 0x3:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0011");
                break;
            case 0x4:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0100");
                break;
            case 0x5:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0101");
                break;
            case 0x6:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0110");
                break;
            case 0x7:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 0111");
                break;
            case 0x8:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1000");
                break;
            case 0x9:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1001");
                break;
            case 0xa:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1010");
                break;
            case 0xb:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1011");
                break;
            case 0xc:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1100");
                break;
            case 0xd:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1101");
                break;
            case 0xe:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1110");
                break;
            case 0xf:
                System.out.println(String.format("0x%X", hexNumber) + " entspricht 1111");
                break;
            default:
                System.out.println("ungültig");
                break;
        }
        // Zusatzfragen BspB:
        //1. Was die Syntax angeht ja, aber es werden die Anweisungen bis zum nächsten break ausgeführt
        //2. Nein, aber bei ungültigen Eingaben wird nichts ausgegeben.
        //3.Switch Anweisungen in if-Verzweigungen schon aber umgekehrt nicht-->Nein.


    }
}

