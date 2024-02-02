import java.util.Scanner;

/*
    Aufgabe 2) Verschachtelte Schleifen und Verzweigungen
*/
public class Aufgabe2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int figHeight = scanner.nextInt();
        int figWidth = figHeight+1;
        int middle1 = figWidth/2;
        int middle2 = figWidth/2+1;
        if(figHeight < 0 || figHeight % 2 == 0) System.out.println("Ungültiger Wert");
        else{
            for(int row = 1; row<=figHeight; row++) {
                for (int column = 1; column <= figWidth; column++) {
                    if(column<middle1 || column>middle2) System.out.print('+');
                    else if(row == figHeight/2+1 && (column==1 || column==figWidth)) System.out.print('|');
                    else if(row<figHeight/2+1 && column==middle1) System.out.print('/');
                    else if(row<figHeight/2+1 && column==middle2) System.out.print('\\');
                    else if(row>figHeight/2+1 && column==middle2) System.out.print('/');
                    else if(row>figHeight/2+1 && column==middle1) System.out.print('\\');
                    else System.out.print('O');
                }
                if(row <= figHeight/2){
                    middle1--;
                    middle2++;
                }
                else{
                    middle1++;
                    middle2--;
                }
                System.out.println();
            }
        }
    }
}

