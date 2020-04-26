package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AbstractArrayStorageTest {
    private Storage storage = new ArrayStorage();
    private static final String UUID_1 = "uuid1";
    private static final String UUID_2 = "uuid2";
    private static final String UUID_3 = "uuid3";

    @Before
    public void setUp() {
        storage.clear();
        storage.save(new Resume(UUID_1));
        storage.save(new Resume(UUID_2));
        storage.save(new Resume(UUID_3));
    }

    @Test
    public void size() {
        Assert.assertEquals(3, storage.size());
    }

    @Test(expected = NotExistStorageException.class)
    public void delete() {
        storage.delete(UUID_1);
        Assert.assertEquals(2, storage.size());
        storage.get(UUID_1);
    }
    @Test(expected = NotExistStorageException.class)
    public void deleteNotExist() {
        storage.delete("2323");
        Assert.assertEquals(2, storage.size());

    }

    @Test
    public void save() {
        storage.save(new Resume());
        Assert.assertEquals(4, storage.size());
    }
    @Test(expected = ExistStorageException.class)
    public void saveIfExist() throws Exception {
        storage.save(new Resume(UUID_1));
        Assert.assertEquals(4, storage.size());
    }

    @Test
    public void getAll() {
        Resume[] resumes = storage.getAll();
        Assert.assertEquals(resumes[0].getUuid(), "uuid1");
        Assert.assertEquals(resumes[1].getUuid(), "uuid2");
        Assert.assertEquals(resumes[2].getUuid(), "uuid3");
    }

    @Test
    public void clear() {
        storage.clear();
        Assert.assertEquals(0,storage.size());
    }

    @Test
    public void update() {
        Resume s = new Resume("238577","Misha","Pilipenko","15","efesf");
        storage.save(s);
        Resume u = new Resume("238577","Misha","Pilipenko","15","aaaaa");
        storage.update(u);
        Assert.assertEquals(storage.get(u.getUuid()).getAddress(), "aaaaa");
    }

    @Test
    public void get() {
        Assert.assertEquals(storage.get(UUID_1).getUuid(), "uuid1");
    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExist() throws Exception {
        storage.get("dummy");
    }
}