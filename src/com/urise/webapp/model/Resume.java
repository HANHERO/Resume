package com.urise.webapp.model;
import java.util.Objects;

public class Resume {
    private String uuid;
    private String name;
    private String surname;
    private String birthDay;
    private String address;

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "ID: " + uuid + '\n' +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Дата рождения: " + birthDay + '\n' +
                "Адрес: " + address + '\n';
    }

    public Resume(String uuid, String name, String surname, String birthDay, String address) {
        this.uuid = uuid;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return uuid.equals(resume.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}