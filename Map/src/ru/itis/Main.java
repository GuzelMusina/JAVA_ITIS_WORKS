package ru.itis;

public class Main {
    public static void main(String[] args) {
        Human marsel = new Human(23, "Marsel");
        Human marat = new Human(17, "Marat");
        Human ruslan = new Human(16, "Ruslan");
        Human guzel = new Human(18, "Guzel");

        String key1 = "Botanik";
        String key2 = "Scala";
        String key3 = "Net";
        String key4 = "Miss";

        MyHashMap<String, Human> humanMyHashMap = new MyHashMap<>();
        humanMyHashMap.put(key1, marsel);
        humanMyHashMap.put(key2, marat);
        humanMyHashMap.put(key3, ruslan);
        humanMyHashMap.put(key4, guzel);

        Human guzelFromMap = humanMyHashMap.get("Miss");
    }
}
