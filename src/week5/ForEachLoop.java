package week5;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {15,17,20,25,35,40};

        // ForEach Loop
        int counter = 0; // temp and counter are important to solve our codes/questions
        for(int arrElemetValue : arr){
            if(counter == arr.length-1) System.out.println(arrElemetValue);
            else System.out.print(arrElemetValue + ", ");
            counter++;
        }

        // For Loop
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ", ");
        }

        String strArr[] = {"Banana", "Apple", "Orange", "Cherry", "Strawberry", "Mango", "Durian"};

        // Iterating the array with ForEach Loop
        for(String str : strArr){
            System.out.print(str +" ");
        }

        System.out.println();
        // Iterating the array with For Loop
        for(int i = 0; i < strArr.length; i++){
            System.out.print(strArr[i] + " ");
        }


        // ForEach with ArrayLists :
        System.out.println();
        ArrayList<String> list = new ArrayList<String>(); //"Tom","John", "Bill", "Mark", "Elon"
        list.add("Tom");
        list.add("John");
        list.add("Bill");
        list.add("Mark");
        list.add("Elon");
        for(String str : list){
            System.out.print(str + " ");
        }

        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(10);
        listInt.add(15);
        listInt.add(50);
        listInt.add(99);

        System.out.println();
        for(int i : listInt){
            System.out.print(i + " ");
        }

    }
}
