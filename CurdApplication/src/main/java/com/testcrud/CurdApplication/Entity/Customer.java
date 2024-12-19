package com.testcrud.CurdApplication.Entity;


import jakarta.persistence.*;
@Entity
@Table(name = "CustomerTable")
public class Customer {
    @Id
    @Column(name = "id" ,length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name",length = 50)
    private String name;
    @Column(name = "contact",length = 50)
    private String contact;

    public Customer(String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}


