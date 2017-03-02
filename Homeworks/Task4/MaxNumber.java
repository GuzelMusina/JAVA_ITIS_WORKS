class MaxNumber {

    public static void main(String[] args) {

        int a[] = {5, 9, 8, -1, 0, -8};
        max(a);
        System.out.print(max(a));
    }

    public static int max(int b[]) {

        int maxNumber = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > maxNumber) {
                maxNumber = b[i];
            }
        }
        return maxNumber;
    }


}
