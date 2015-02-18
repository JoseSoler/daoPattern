package com.zanox;

import org.springframework.stereotype.Component;

/**
 * Created by josesoler on 15.02.15.
 */
@Component
public class FilesystemDao implements Persistable {

    @Override
    public void save(Document document) {
        System.out.println("Document saved into the filesystem !!!");

    }

    @Override
    public Document load(Integer id) {
        System.out.println("Document loaded from the filesystem !!!");
        return new Document(1, "lot of text");
    }
}
