package storage;

import models.BasePersonnel;

public class DB implements BaseStorage {

    @Override
    public void save(BasePersonnel basePersonnel) {
        System.out.println("Saving " + basePersonnel.toString() + " to DB.");
    }
}
