package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public class ArrayStorage implements Storage{
    private static final int STORAGE_LIMIT = 10000;
    private Resume[] storage = new Resume[STORAGE_LIMIT];
    private int size = 0;

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    private boolean isExist(Resume r) {
        boolean isExist = false;
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(r.getUuid())) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public void save(Resume r) {
        if (isExist(r)) {
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
        if (isExist(r)) {
            for (int i = 0; i < size; i++) {
                if (storage[i].getUuid().equals(r.getUuid())) {
                    storage[i] = r;
                    System.out.println("Анкета успешно обновлена.");
                }
            }
        } else System.out.println("Анкета с ID " + r.getUuid() + " не существует!");
    }

    public Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return storage[i];
            }
        }
        return null;
    }

    public void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                size--;
                System.out.println("Анкета удалена.");
            }
        }
    }

    public Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    public int size() {
        return size;
    }
}
