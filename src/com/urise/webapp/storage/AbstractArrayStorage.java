package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.exception.StorageException;
import com.urise.webapp.logger.ProgramLogger;
import com.urise.webapp.model.Resume;

import java.util.Arrays;

public abstract class AbstractArrayStorage implements Storage {
    protected static final int STORAGE_LIMIT = 100000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public int size() {
        return size;
    }

    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {
            throw new NotExistStorageException(uuid);
        }
        storage[index] = storage[size - 1];
        storage[size - 1] = null;
        size--;
        ProgramLogger.getProgramLogger().addLogInfo("Анкета удалена.");
    }

    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index == -1) {
            storage[size] = r;
            ProgramLogger.getProgramLogger().addLogInfo("Анкета создана.");
            size++;
        } else if (size == STORAGE_LIMIT) {
            throw new StorageException("Хранилище переполнено!" ,r.getUuid());
        } else {
            throw new ExistStorageException(r.getUuid());
        }
    }

    public Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
        ProgramLogger.getProgramLogger().addLogInfo("Все записи удалены.");
    }

    public void update(Resume r) {
        int index = getIndex(r.getUuid());
        if (index == -1) {
            throw new NotExistStorageException(r.getUuid());
        } else {
            storage[index] = r;
            ProgramLogger.getProgramLogger().addLogInfo("Анкета успешно обновлена.");
        }
    }

    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {
            throw new NotExistStorageException(uuid);
        }
        return storage[getIndex(uuid)];
    }

    protected abstract int getIndex(String uuid);

}
