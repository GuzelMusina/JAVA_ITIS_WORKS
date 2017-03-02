import java.util.Scanner;

class Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int i = 0;
        int count = 0;

        a = scanner.nextInt();
        i++;

        while (a != -999) {


            if (i % 10 == 6) {
                count++;
            }
            a = scanner.nextInt();
            i++;
        }


        System.out.print(count);


    }
}