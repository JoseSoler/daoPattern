package com.zanox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by josesoler on 15.02.15.
 */
@Component
public class DaoFactory {

    @Autowired
    private FilesystemDao fsDao;

    @Autowired
    private DatabaseDao dbDao;


    public Persistable getDao(String type) {

        if (type.equalsIgnoreCase("filesystem")) {
            return (Persistable) fsDao;

        } else if (type.equalsIgnoreCase("database")) {
            return (Persistable) dbDao;

        } else {
            throw new UnsupportedOperationException("Storage medium not yet implemented.");

        }
    }

}
