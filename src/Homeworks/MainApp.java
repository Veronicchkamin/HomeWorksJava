package Homeworks;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello!");

        int[] mass = {5, 10, 13, 17, 66};
        int sum = 0;
        int max = mass[0];
        int min = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }

            sum += mass[i];
        }


        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Amount of elements " + mass.length);
    }
}
