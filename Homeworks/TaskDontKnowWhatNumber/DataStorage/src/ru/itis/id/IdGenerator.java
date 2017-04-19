package ru.itis.id;

/**
 * Created by User on 12.04.2017.
 */
public interface IdGenerator {
    /**
     * Метод генерации идентификатора, при каждом вызове метода
     * generateId должен возвращатся новый уникальный id-шник, который раньше не генерировался
     * @return целое число - идентификатор новый
     */
    int generateId();
}
