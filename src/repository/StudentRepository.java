package repository;

import models.BasePersonnel;
import storage.BaseStorage;

public class StudentRepository implements BaseRepository {

    protected BaseStorage storage;

    public StudentRepository(BaseStorage storage) {
        this.storage = storage;
    }

    @Override
    public void save(BasePersonnel basePersonnel) {
        storage.save(basePersonnel);
    }
}
