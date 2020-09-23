import java.sql.SQLOutput;
import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.Math.incrementExact;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[6];
        int[] mass = new int[9];
        int[] massive = new int[]{5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arr = new int[5][5];
        int[] mass_1 = new int[]{1, 3, 2, 2};
        int[] mass_2 = new int[]{1, 2, 3, 4, 5};

        /** Task #1 */
        changeOneOnZero(createRandomArray(array));

        /** Task #2 */
        fillArray(mass);

        /** Task #3 */
        transformArray(massive);

        /** Task #4 */
        fillDiagonals(arr);

        /** Task #5 */
        searchMinAndMax(massive);

        /** Task #6 */
        System.out.println(findEqualAmounts(mass_1));



    }

    static int [] createRandomArray(int [] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
    static void changeOneOnZero ( int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else array[i] = 0;
            System.out.print(array [i] + " ");
        }
        System.out.println();
    }
    static void fillArray(int [] array){
        int diff = 3;
        for (int i = 0; i < array.length - 1; i ++) {
            array[i+1] = array[i] + diff;
            System.out.print(array[i] + "  ");
        }
    }
    static void transformArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] = array [i] * 2;
            }
            System.out.print(array [i] + " ");
        }

    }
    static void fillDiagonals(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == j) || (i + j == array.length - 1)) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    static void searchMinAndMax(int [] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(String.format("Min = %s  Max = %s", min, max));
    }
    static boolean findEqualAmounts(int[] array) {
        int sum_left = array[0];
        int sum_all = 0;
        boolean x = false;
        for (int i = 1; i < array.length; i++) { sum_all = sum_all+ array[i];}
        for (int i = 1; i < array.length; i++) {
            if (sum_left == sum_all){
                x = true;
            } else{
                sum_left = sum_left + array[i];
                sum_all = sum_all - array[i];
            }
        }
        return x;
    }


}
