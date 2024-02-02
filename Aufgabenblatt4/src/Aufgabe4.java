/*
    Aufgabe 4) Zweidimensionale Arrays - Berechnungen
*/
public class Aufgabe4 {

    private static int[][] genFilledArray(int centerNumber) {
        if (centerNumber % 2 == 0) return null;
        else {
            int[][] array = new int[centerNumber][centerNumber];
            int num = 1;
            int half1 = centerNumber / 2 + 1;
            boolean mitte = true;
            boolean mitte2 = true;
            for (int i = 0; i < centerNumber; i++) {
                for (int j = 0; j < centerNumber; j++) {
                    array[i][j] = num;
                    if (half1 == num) mitte2 = false;
                    if (!mitte2 && j!= centerNumber-1)num--;
                    if (half1 > num && mitte2) num++;
                }
                mitte2=true;
                if (half1 == centerNumber) mitte = false;
                if (!mitte){
                    half1--;
                    num--;
                }
                if (half1 < centerNumber && mitte){
                    half1++;
                    num++;
                }
            }
            return array;

        }
    }

    private static int[][] calcSumInArray(int[][] workArray) {
        int[][] sumArray = new int[workArray.length][workArray.length];
        for (int row = 0; row < workArray.length; row++) {
            for (int column = 0; column < workArray.length; column++) {
                int count = 0;
                count += workArray[row][column];
                count += (column - 1 > 0 && row - 1 > 0) ? workArray[row - 1][column - 1] : 0;
                count += (column > 0 && row < workArray.length - 1) ? workArray[row + 1][column - 1] : 0;
                count += (column < workArray.length - 1 && row > 0) ? workArray[row - 1][column + 1] : 0;
                count += (column < workArray.length - 1 && row < workArray.length - 1) ? workArray[row + 1][column + 1] : 0;
                count += (column < workArray.length - 1) ? workArray[row][column + 1] : 0;
                count += (row < workArray.length - 1) ? workArray[row + 1][column] : 0;
                count += (column > 0) ? workArray[row][column - 1] : 0;
                count += (row > 0) ? workArray[row - 1][column] : 0;
                sumArray[row][column] = count;
            }
        }
        return sumArray;
    }

    private static void print(int[][] workArray) {
        if (workArray != null) {
            for (int y = 0; y < workArray.length; y++) {
                for (int x = 0; x < workArray.length; x++) {
                    System.out.print(workArray[y][x] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] myArray;
        int[][] myResultArray;
        // Test für centerNumber = 5
        myArray = genFilledArray(5);
        print(myArray);
        myResultArray = calcSumInArray(myArray);
        print(myResultArray);
        //Test für centerNumber = 9
        myArray = genFilledArray(9);
        print(myArray);
        myResultArray = calcSumInArray(myArray);
        print(myResultArray);
    }


}
