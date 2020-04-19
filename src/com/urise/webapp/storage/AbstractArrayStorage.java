package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public abstract class AbstractArrayStorage implements Storage{
    protected static final int STORAGE_LIMIT = 100000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public int size() {
        return size;
    }
    public Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }
    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

}