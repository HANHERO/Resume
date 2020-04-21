package com.urise.webapp.exception;

public class NotExistStorageException extends StorageException{
    public NotExistStorageException(String uuid) {
        super("Анкета с ID " + uuid + " не существует!", uuid);
    }
}
