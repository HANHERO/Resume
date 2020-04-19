package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

public class ArrayStorage extends AbstractArrayStorage {

    public void save(Resume r) {
        if (getIndex(r.getUuid()) != -1) {
            System.out.println("Анкета с ID " + r.getUuid() + " существует!");
        } else if (size == STORAGE_LIMIT) {
            System.out.println("Хранилище переполнено!");
        } else {
            storage[size] = r;
            System.out.println("Анкета создана.");
            size++;
        }
    }

    public void update(Resume r) {
        if (getIndex(r.getUuid()) != -1) {
            storage[getIndex(r.getUuid())] = r;
            System.out.println("Анкета успешно обновлена.");
        } else System.out.println("Анкета с ID " + r.getUuid() + " не существует!");
    }


    public Resume get(String uuid) {
        if (getIndex(uuid) != -1) {
            return storage[getIndex(uuid)];
        }
        System.out.println("Такой анкеты не существует!");
        return null;
    }

    public void delete(String uuid) {
        if (getIndex(uuid) != -1) {
            storage[getIndex(uuid)] = storage[size - 1];
            storage[size - 1] = null;
            size--;
            System.out.println("Анкета удалена.");
        }
    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}