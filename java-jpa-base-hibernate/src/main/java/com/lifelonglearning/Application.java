package com.lifelonglearning;


import entities.People;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {

        People p1 = new People(null, "John", "j@j.com", "555-555-5555");
        People p2 = new People(null, "Jane", "j@j.com", "555-555-5555");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // Adiciona os dois registros no BD
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p1);
        em.getTransaction().commit();

        // Busca algum registro no BD
        em.getTransaction().begin();
        People people = em.find(People.class, 2);
        System.out.println(people);
        em.getTransaction().commit();

        // Remove algum registro no BD
        People people2 = em.find(People.class, 3);
        em.getTransaction().begin();
        em.remove(people2);
        System.out.println("Removed: " + people2);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}