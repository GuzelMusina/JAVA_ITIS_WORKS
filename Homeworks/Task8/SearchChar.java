public class SearchChar {

    public static void main(String[] args) {
        System.out.println(haveSubArray("hello", "ell"));
    }

    /**
     * Написать метод, который ищет в массиве символов подмассив из символов. Обясняю:
     * Пусть есть массив символов 'h','e','l','l','o'
     * На вход методу вы подаете этот массив, и искомый подмассив, например 'e' 'l' 'l'
     * Подмассив ell в массиве hello встречается, начиная с первой позиции, значит ваш метод должен вернуть 1
     */
    public static int haveSubArray(String string, String subString) {

        char array[] = string.toCharArray();
        char subArray[] = subString.toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == subArray[count]) {
                count++;
            } else {
                count = 0;
            }
            if (count == subArray.length)
                return 1;
        }
        return -1;
    }
}

