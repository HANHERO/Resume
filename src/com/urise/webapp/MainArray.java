package com.urise.webapp;


import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.ArrayStorage;

public class MainArray {
    public static void main(String[] args) {
        ArrayStorage as = new ArrayStorage();
        as.save(new Resume("M160361", "Миша", "Пилипенко", "15.03.1995", "пр Гагарина 167а"));
        as.save(new Resume("M160362", "Даша", "Бурилкина", "03.09.1998", "пр Гагарина 167а"));
        as.save(new Resume("M160363", "Леха", "Черников", "17.12.1995", "пр Гагарина 174"));
        as.save(new Resume("M160364", "Сява", "Павлов", "07.03.1996", "пр Гагарина 176"));
        as.save(new Resume("M160365", "Вика", "Тищенко", "06.03.1997", "пр Гагарина 174"));
        System.out.println(as.get("M160362").toString());
        as.update(new Resume("M160362", "Дарина", "Бурилкина", "03.09.1998", "пр Гагарина 167а"));
        System.out.println(as.get("M160362").toString());

        as.delete("M160365");

        System.out.println("Rол-во анкет: " + as.size());


        for (int i = 0; i < as.size(); i++) {
            System.out.println(as.getAll()[i].toString());
        }
        as.clear();
        System.out.println("Rол-во анкет: " + as.size());


    }
}
