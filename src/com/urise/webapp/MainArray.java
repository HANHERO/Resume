package com.urise.webapp;


import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.ArrayStorage;

public class MainArray {
    private final static ArrayStorage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) {

        ARRAY_STORAGE.save(new Resume("M160361", "John", "Sins", "12.05.80", "Earth"));

        System.out.println(ARRAY_STORAGE.get("M160361").toString());

        System.out.println("Кол-во анкет: " + ARRAY_STORAGE.size());

        for (int i = 0; i < ARRAY_STORAGE.size(); i++) {
            System.out.println(ARRAY_STORAGE.getAll()[i].toString());
        }
        ARRAY_STORAGE.clear();
        System.out.println("Кол-во анкет: " + ARRAY_STORAGE.size());

    }
}
