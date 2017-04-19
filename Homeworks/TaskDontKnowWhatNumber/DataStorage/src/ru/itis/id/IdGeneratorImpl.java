package ru.itis.id;

import java.io.*;

public class IdGeneratorImpl implements IdGenerator {
    // поле - имя файла, где находится последний сгенерированный id
    private String fileName;
    // поле - последний сгенерированный id
    private int lastGeneratedId;

    // конструктор - имя файла с последним id
    public IdGeneratorImpl(String fileName) {
        this.fileName = fileName;
        try {
            // открываем файл для чтения
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));
            // считываем последний id как строку
            String idAsString = reader.readLine();
            // преобразуем строку в число и кладем в поле
            lastGeneratedId = Integer.parseInt(idAsString);
            // файл закрываем
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO exception");
        }
        catch (Exception e){
            System.err.println("Not available");
        }
    }

    @Override
    public int generateId() {
        // генерируем новый id увеличением последнего на 1
        int newId = lastGeneratedId + 1;
        // новый id теперь последний
        lastGeneratedId = newId;
        try {
            // открываем файл с id-ником для записи
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(fileName));
            // записываем последнй id в файл
            writer.write(String.valueOf(newId));
            writer.close();
        } catch (IOException e) {
            System.err.println("Error");
        }
        return newId;
    }
}
