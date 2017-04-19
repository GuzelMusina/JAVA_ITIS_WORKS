package ru.itis;

import ru.itis.id.IdGenerator;
import ru.itis.id.IdGeneratorImpl;
import ru.itis.models.Car;
import ru.itis.storages.CarDataStorageFileBasedImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car ford = new Car("Mondeo", 20);
        Car bmw = new Car("X6", 30);
        Car audi = new Car("A5", 40);

        IdGenerator idGenerator = new IdGeneratorImpl("id2.txt");
        CarDataStorageFileBasedImpl dataStorageFileBased =
                new CarDataStorageFileBasedImpl("car.txt", idGenerator);

        dataStorageFileBased.save(ford);
        dataStorageFileBased.save(audi);
        dataStorageFileBased.save(bmw);

        List<Car> fromStorage = dataStorageFileBased.findAll();
        for (int i  = 0; i < fromStorage.size(); i++) {
            System.out.println(fromStorage.get(i));
        }

        dataStorageFileBased.delete(2);


        Car newCar = new Car(15,"BMW", 50);
        dataStorageFileBased.update(newCar);

        List<Car> cars = dataStorageFileBased.findAllLessThanGiven(30);

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }


        /** Human marsel = new Human("Marsel", 23);
         Human guzel = new Human("Guzel", 18);
         IdGenerator idGenerator = new IdGeneratorImpl("id.txt");
         HumansDataStorageFileBasedImpl dataStorage =
         new HumansDataStorageFileBasedImpl("human.txt", idGenerator);

         dataStorage.save(marsel);
         dataStorage.save(guzel);

         List<Human> fromStorage = dataStorage.findAll();

         for (int i  = 0; i < fromStorage.size(); i++) {
         System.out.println(fromStorage.get(i));
         }

         dataStorage.delete(4);

         Human newHuman = new Human(6, "Alina", 77);
         dataStorage.update(newHuman);

         List<Human> guzels = dataStorage.findAllByName("Guzel");

         for (int i  = 0; i < guzels.size(); i++) {
         System.out.println(guzels.get(i));
         }
         **/
    }
}
