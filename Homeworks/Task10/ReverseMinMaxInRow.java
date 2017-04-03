
// /Поменять местами максимальный и минимальный элементы каждой строки

import java.util.Random;

public class ReverseMinMaxInRow {

    public static void main(String[] args) {

        int array[][];

        array = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(25);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("..........");

        //метод, который меняет макс. элемент в строке с мин.
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            // создаем две дополнительных переменных, чтобы потом развернуть два значения
            int min_m = 0;
            int max_m = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    min_m = j;
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                    max_m = j;
                }
                int temp;
                temp = array[i][min_m];
                array[i][min_m] = array[i][max_m];
                array[i][max_m] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
