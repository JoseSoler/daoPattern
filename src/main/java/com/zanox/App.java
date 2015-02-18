package com.zanox;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class App{

    public static void main(String[] args) throws Exception {

        SpringApplication app = new SpringApplication(App.class);
        app.setShowBanner(true);
        ApplicationContext applicationContext = app.run(args);

        DaoFactory daoFactory = applicationContext.getBean(DaoFactory.class);

        Document newDocument = new Document(1, "lots of text");

        //to the filesystem
        Persistable dao = daoFactory.getDao("filesystem");
        dao.save(newDocument);
        Document persistedDocument = dao.load(1);

        //to the database
        dao = daoFactory.getDao("database");
        dao.save(newDocument);
        persistedDocument = dao.load(1);
        System.out.println(persistedDocument);

        //lets create an exception
        //dao = daoFactory.getDao("cloud");

    }
}
