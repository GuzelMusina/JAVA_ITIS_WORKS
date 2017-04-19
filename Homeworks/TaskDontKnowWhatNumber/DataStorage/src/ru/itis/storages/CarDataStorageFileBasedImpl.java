package ru.itis.storages;

import ru.itis.id.IdGenerator;
import ru.itis.models.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarDataStorageFileBasedImpl implements CarDataStorage {

    private String fileName;
    private IdGenerator idGenerator;

    //конструктор
    public CarDataStorageFileBasedImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public int save(Car model) {
        int generateId = idGenerator.generateId();
        model.setId(generateId);

        try {
            OutputStream outputStream = new FileOutputStream(fileName, true);
            outputStream.write((model.toString() + "\n").getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return -1;
        } catch (IOException e) {
            System.err.println("Exeption in IO");
            return -1;
        }
        return generateId;
    }

    @Override
    public void delete(int id) {
        List<Car> cars = findAll();
        int indexForRemove = -1;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                indexForRemove = i;
                break;
            }
        }
        if (indexForRemove > -1) {
            cars.remove(indexForRemove);
        }
        flushToFile(cars);
    }

    @Override
    public void update(Car model) {

        List<Car> cars = findAll();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == model.getId()) {
                cars.set(i, model);
            }
        }
        flushToFile(cars);
    }

    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();

        // открыть файл
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentCarAsString = reader.readLine();

            while (currentCarAsString != null) {
                // разбиваем считанную строку по пробелам
                String splitCar[] = currentCarAsString.split(" ");
                // получаем id
                int carId = Integer.parseInt(splitCar[0]);
                // получаем имя
                String carModel = splitCar[1];
                // получаем возраст
                int carMileage = Integer.parseInt(splitCar[2]);
                Car car = new Car(carId, carModel, carMileage);
                cars.add(car);
                currentCarAsString = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return null;
        }
        return cars;
    }

    //найти все машины с пробегом меньше заданного
    @Override
    public List<Car> findAllLessThanGiven(int mileage) {


        List<Car> cars = new ArrayList<>();

        // открыть файл
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentCarAsString = reader.readLine();

            while (currentCarAsString != null) {
                // разбиваем считанную строку по пробелам
                String carSplit[] = currentCarAsString.split(" ");
                // получаем id
                int carId = Integer.parseInt(carSplit[0]);
                // получаем имя
                String carModel = carSplit[1];
                // получаем возраст
                int carMileage = Integer.parseInt(carSplit[2]);

                if (mileage > carMileage) {
                    Car car = new Car(carId, carModel, carMileage);
                    cars.add(car);
                }
                currentCarAsString = reader.readLine();
            }
            reader.close();
        } catch (
                FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (
                IOException e) {
            System.err.println("Exception in IO");
            return null;
        }
        return cars;
    }

    private void flushToFile(List<Car> cars) {
        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < cars.size(); i++) {
                writer.write(cars.get(i).toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

}
