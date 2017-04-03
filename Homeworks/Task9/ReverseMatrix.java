import java.util.Random;

//Развернуть каждую строку матрицы
public class ReverseMatrix {

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

        //метод разворота каждой строки матрицы
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length / 2; j++) {
                temp = array[i][j];
                array[i][j] = array[i][(array[0].length - 1) - j];
                array[i][(array[0].length - 1) - j] = temp;
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



