package com.urise.webapp;

import com.urise.webapp.model.Resume;

import java.util.*;

public class MainCollections implements Collection {
    public static void main(String[] args) {
        Collection<Resume> collection = new ArrayList<>();
        collection.add(new Resume("John", "Sins", "12.05.80", "Earth"));
        collection.add(new Resume("John", "Sins", "12.05.80", "Earth"));
        collection.add(new Resume("23132", "John", "Sins", "12.05.80", "Earth"));
        collection.add(new Resume("John", "Sins", "12.05.80", "Earth"));

        Iterator<Resume> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Resume r = iterator.next();
            System.out.println(r);
            if (Objects.equals(r.getUuid(), "23132")) {
                iterator.remove();
            }
        }
        System.out.println(collection.toString());

        Map <String, Resume> map = new HashMap<>();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
