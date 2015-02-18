package com.zanox;

/**
 * Created by josesoler on 15.02.15.
 */
public class Document {

    private Integer id;
    private String text;

    public Document(){};

    public Document(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
