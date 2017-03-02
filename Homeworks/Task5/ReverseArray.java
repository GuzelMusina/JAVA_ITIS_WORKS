class ReverseArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 6, 4, 7};
        reverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void reverse(int b[]) {


        int temp;

        for (int i = 0; i <= b.length / 2; i++) {
            temp = b[i];
            b[i] = b[(b.length - 1) - i];
            b[(b.length - 1) - i] = temp;
        }

    }
}