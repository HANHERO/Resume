package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

public class ArrayStorage extends AbstractArrayStorage {

    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index == -1) {
            storage[size] = r;
            System.out.println("Анкета создана.");
            size++;
        } else if (size == STORAGE_LIMIT) {
            System.out.println("Хранилище переполнено!");
        } else {
            System.out.println("Анкета с ID " + r.getUuid() + " существует!");
        }
    }

    public void update(Resume r) {
        int index = getIndex(r.getUuid());
        if (index == -1) {
            System.out.println("Анкета с ID " + r.getUuid() + " не существует!");
        } else {
            storage[getIndex(r.getUuid())] = r;
            System.out.println("Анкета успешно обновлена.");
        }
    }

    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {
            System.out.println("Такой анкеты не существовало!");
        }
        storage[index] = storage[size - 1];
        storage[size - 1] = null;
        size--;
        System.out.println("Анкета удалена.");
    }

    protected int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}