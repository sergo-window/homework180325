import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] numbers = new int[3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        float [] numerics = {1.57f, 7.654f, 9.986f};
        long [] stars = {2569894651365L, 9876552136549L, 4598469546321L};

        System.out.println("Задача 2");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = 0; i < numerics.length; i++) {
            if (i == numerics.length - 1) {
                System.out.println(numerics[i]);
                break;
            }
            System.out.print(numerics[i] + ", ");
        }
        for (int i = 0; i < stars.length; i++) {
            if (i == stars.length - 1) {
                System.out.println(stars[i]);
                break;
            }
            System.out.print(stars[i] + ", ");
        }

        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = numerics.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numerics[i]);
                break;
            }
            System.out.print(numerics[i] + ", ");
        }
        for (int i = stars.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(stars[i]);
                break;
            }
            System.out.print(stars[i] + ", ");
        }

        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 != 0)
                numbers[i] += 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}