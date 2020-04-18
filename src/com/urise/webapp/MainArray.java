package com.urise.webapp;


import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.ArrayStorage;

public class MainArray {
    public static void main(String[] args) {
        ArrayStorage as = new ArrayStorage();
        as.save(new Resume("M160361", "John", "Sins", "12.05.80", "Earth"));

        System.out.println(as.get("M160361").toString());

        System.out.println("Кол-во анкет: " + as.size());

        for (int i = 0; i < as.size(); i++) {
            System.out.println(as.getAll()[i].toString());
        }
        as.clear();
        System.out.println("Кол-во анкет: " + as.size());


    }
}
