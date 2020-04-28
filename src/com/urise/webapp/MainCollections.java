package com.urise.webapp;

import com.urise.webapp.model.Resume;

import java.util.*;

public class MainCollections implements Collection {
    public static void main(String[] args) {
        Collection<Resume> collection = new ArrayList<>();

        String UUID_1 = "uuid1";
        String UUID_2 = "uuid2";
        String UUID_3 = "uuid3";
        String UUID_4 = "uuid4";

        Resume RESUME_1 = new Resume(UUID_1);
        Resume RESUME_2 = new Resume(UUID_2);
        Resume RESUME_3 = new Resume(UUID_3);
        Resume RESUME_4 = new Resume(UUID_4);

        collection.add(RESUME_1);
        collection.add(RESUME_2);
        collection.add(RESUME_3);
        collection.add(RESUME_4);
        Iterator<Resume> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Resume r = iterator.next();
            System.out.println(r);
            if (Objects.equals(r.getUuid(), "23132")) {
                iterator.remove();
            }
        }
        System.out.println(collection.toString());

        Map<String, Resume> map = new HashMap<>();
        map.put(UUID_1, RESUME_1);
        map.put(UUID_2, RESUME_2);
        map.put(UUID_3, RESUME_3);
        map.put(UUID_4, RESUME_4);
        for (String uuid : map.keySet()) {
            System.out.println(map.get(uuid));
        }
        for (Map.Entry<String, Resume> entry :
                map.entrySet()) {
            System.out.println(entry.getValue());
        }
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
