package com.zanox;

/**
 * Created by josesoler on 15.02.15.
 */
public interface Persistable {

    void save(Document document);

    Document load(Integer id);
}
