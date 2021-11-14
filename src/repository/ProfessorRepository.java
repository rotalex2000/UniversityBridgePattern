package repository;

import models.BasePersonnel;
import storage.BaseStorage;

public class ProfessorRepository implements BaseRepository {

    protected BaseStorage storage;

    public ProfessorRepository(BaseStorage storage) {
        this.storage = storage;
    }

    @Override
    public void save(BasePersonnel basePersonnel) {
        storage.save(basePersonnel);
    }
}
