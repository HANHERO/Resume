package com.urise.webapp.model;

import java.util.Objects;
import java.util.UUID;

public class Resume implements Comparable<Resume>{
    private final String uuid;
    private String name;
    private String surname;
    private String birthDay;
    private String address;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + uuid + '\n' +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Дата рождения: " + birthDay + '\n' +
                "Адрес: " + address + '\n';
    }

    public Resume(String name, String surname, String birthDay, String address) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.address = address;
    }
    public Resume(String uuid, String name, String surname, String birthDay, String address) {
        this.uuid = uuid;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.address = address;
    }

    public Resume(String uuid) {
        this.uuid = uuid;
    }

    public Resume() {
        this(UUID.randomUUID().toString());
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

    @Override
    public int compareTo(Resume o) {
        return uuid.compareTo(o.uuid);
    }
}