class MainHuman {

    // метод, возвращающий человека с максимальным возрастом

    public static Human maxAgeHuman(Human humans[]) {
        Human max = humans[0];

        for (int i = 1; i < humans.length; i++) {
            if (humans[i].getAge() > max.getAge()){
                max = humans[i];
            }
        }

        return max;
    }

    // метод, возвращающий индекс человека с максимальным возрастом

    public static int indexOfMaxAgeHuman(Human humans[]) {
        int result = 0;

        Human max = humans[0];

        for (int i = 1; i < humans.length; i++) {
            if (humans[i].getAge() > max.getAge()){
                result = i;
            }
        }
        return result;
    }
    // метод, сортирующий людей по возрасту от мин к макс

    public static void sort(Human humans[]) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (humans[j].getAge() > humans[j + 1].getAge()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {


        Human marsel = new Human ("MARSEL ", 23);
        Human maksim = new Human ("MAKSIM", 13);
        Human guzel = new Human ("GUZEL", 18);

        Human marsel1 = new Human ("MARSEL1 ", 27);
        Human maksim1 = new Human ("MAKSIM1", 16);
        Human guzel1 = new Human ("GUZEL1", 19);

        Human humans[] ={ marsel, guzel, maksim, marsel1, guzel1,maksim1};

        sort(humans);
        for (int i = 0; i < humans.length;i++) {
            System.out.println(humans[i].getAge() + " " + humans[i].getName());
        }

        Human maxAgeHuman = maxAgeHuman(humans);
        System.out.println("Human with max age: " + maxAgeHuman.getName());


        System.out.println("Index of human with max age: " + indexOfMaxAgeHuman(humans));
    }



    }

