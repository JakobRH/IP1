import java.util.Arrays;

/*
    Aufgabe 1) Rekursion - Diverse Methoden
*/
public class Aufgabe1 {
    
    private static int printAndCountNumbers(int x, int y) {
       if (x == y){
           System.out.println(" "+y);
           return y;
       }
       else {
           System.out.print(" " +x);
           return printAndCountNumbers(x+=1, y) + x;
       }
    }
    
    private static int printAndCountNumbersDes(int x, int y) {
        if (x == y) {
            System.out.println(" " + x);
            return x;
        }
        else {
            System.out.print(" " +y);
            return printAndCountNumbersDes(x, y-=1) + y;
        }
    }
    
    private static int calcMaxSumTriple(int[] array, int i) {
        if (i + 2 >= array.length-1) return array[i] + array[i + 1] + array[i + 2];
        int sum = array[i] + array[i + 1] + array[i + 2];
        return sum > calcMaxSumTriple(array, i += 1) ? sum : calcMaxSumTriple(array, i);
    }
    
    private static int calcMaxSumTriple(int[] array) {
        if ( array.length <= 3){
            return array[array.length-3] + array[array.length-2] + array[array.length-1];
        }
        int[] array1 = Arrays.copyOfRange(array, 0, array.length-2);
        int sum = array[array.length-1]+array[array.length-2]+array[array.length-3];
        return sum > calcMaxSumTriple(array1)? sum : calcMaxSumTriple(array1);
    }
    
    private static int findMaxDiff(int[] array, int i) {
        if ( i == 1 ){
            return Math.abs(array[0]-array[1]);
        }
        int dif = Math.abs(array[i]-array[i-1]);
        return dif > findMaxDiff(array, i-=1)? dif:findMaxDiff(array, i);
    }
    
    public static void main(String[] args) {
        System.out.println(printAndCountNumbers(10, 20));
        System.out.println();
        System.out.println(printAndCountNumbersDes(5, 15));
        System.out.println();
        
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 3, 8, 2, 7, 4, 3}, 0));
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 1, 8, 7, 3, 4, 3}, 0));
        System.out.println(calcMaxSumTriple(new int[]{7, 5, 3}, 0));
        
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 3, 8, 2, 7, 4, 3}));
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 1, 8, 7, 3, 4, 3}));
        System.out.println(calcMaxSumTriple(new int[]{7, 5, 3}));
        System.out.println();
        
        System.out.println(findMaxDiff(new int[]{5, 50, 7, 1, 20}, 4));
        System.out.println(findMaxDiff(new int[]{5, 8, 7, 1, 20}, 2));
        System.out.println(findMaxDiff(new int[]{5, 14, 5, 1, 2, 1, 20}, 6));
        System.out.println(findMaxDiff(new int[]{1, 1, 1, 1, 1, 1, 1}, 6));
        System.out.println(findMaxDiff(new int[]{2, 4}, 1));
    }
}


