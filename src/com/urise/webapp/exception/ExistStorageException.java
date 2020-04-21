package com.urise.webapp.exception;

public class ExistStorageException extends StorageException {
    public ExistStorageException(String uuid) {
        super("Анкета с ID " + uuid + " существует!", uuid);
    }
}
