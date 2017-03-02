
public class HumansUtils {

    // метод поиска людей по возрасту - результатом работы будет массив людей с одинаковым возрастомы
    public static Human[] searchHumanToAge(Human humans[], int age) {

        Human result[] = new Human[humans.length];
        int count = 0;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getAge() == age) {
                result[count] = humans[i];
                count++;
            }
        }
        return result;
    }


    //    //метод поиска человека по имени
    public static String searchHumanToName(Human humans[], String name) {
        String result = "DEFAULT_NAME";
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getName().equals(name))
                return humans[i].getName();

        }
        return result;
    }

    public static void main(String[] args) {

        Human marsel = new Human("MARSEL ", 23);
        Human maksim = new Human("MAKSIM", 13);
        Human guzel = new Human("GUZEL", 16);
        Human kate = new Human("KATE", 27);
        Human paul = new Human("PAUL", 16);
        Human kay = new Human("KAY", 17);

        Human humans[] = {marsel, guzel, maksim, kate, paul, kay};

        Human[] searchHumanToAge = searchHumanToAge(humans, 27);
        for (int i = 0; i < humans.length; i++) {
            System.out.println(searchHumanToAge[i].getName() + " " + searchHumanToAge[i].getAge());
        }

        System.out.println(searchHumanToName(humans, "KAY"));
    }
}


