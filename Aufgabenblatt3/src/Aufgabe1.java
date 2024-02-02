/*
    Aufgabe 1) Methoden rufen Methoden auf und überladen von Methoden
*/
public class Aufgabe1 {
    
    public static void main(String[] args) {
        System.out.println(calcProduct(1,0.5));
        System.out.println(multNew(-9,3));
    }

    public static int calcProduct(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    public static  double calcProduct(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    public static  int multNew(int num1,int num2) {
        int result;
        if((num1>0&&num2>0)||(num1<0&&num2<0)) result= multiplier(betrag(num1),betrag(num2));
        else if(num1 == 0 || num2 == 0) result=0;
        else result=negation(multiplier(betrag(num1),betrag(num2)));
        return result;
    }
    public static int betrag(int num){
        int result=num;
        if(num<0) result=-num;
        return result;
    }
    public static int multiplier(int num1, int num2){
        return (num1>0)? num2+multiplier(--num1,num2):0;
    }
    public static int negation(int num){
        return -num;
    }


    public static int mult(int m, int n) {
        int result = 0;
        while (n > 0) {
            result += m;
            n--;
        }
        return result;
    }
}
