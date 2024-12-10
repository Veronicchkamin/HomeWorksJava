package Homeworks;
// Numbers from 2 arrays

public class Task1 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9, 10};

        System.out.println("All elements from both arrays:");


        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }


        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();
    }
}
