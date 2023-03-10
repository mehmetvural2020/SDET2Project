package week4;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //Multidimensional Array in Java
        //In such case, data is stored in row and column based index (also known as matrix form).

        int arr1[][] = {{1,2,7}, {3,4,8}, {5,6,9}};
        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(Arrays.toString(arr1[2]));

        int arr[][] = new int[3][3];
        //row-1
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 7;
        //row-2
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 8;
//        row-3
        arr[2][0] = 5;
        arr[2][1] = 6;
        arr[2][2] = 9;


//       output :
        // 1 2 7
        // 3 4 8
        // 5 6 9

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(" " + arr[0][0] +" "+arr[0][1] +" "+ arr[0][2]);
        System.out.println(" " + arr[1][0] +" "+arr[1][1] +" "+ arr[1][2]);
        System.out.println(" " + arr[2][0] +" "+arr[2][1] +" "+ arr[2][2]);


    }
}
