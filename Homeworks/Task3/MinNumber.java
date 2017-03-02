class MinNumber {

    public static void main(String[] args) {

        int a[] = {5, 9, 8, -1, 0, -8};
        min(a);
        System.out.print(min(a));
    }

    public static int min(int b[]) {

        int minN = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] < minN) {
                minN = b[i];
            }
        }
        return minN;
    }


}
