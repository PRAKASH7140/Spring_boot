package com.testcrud.CurdApplication.CustomerDTO;

public class CustomerSaveDTO {

    private int id;
    private String name;
    private String contact ="12";

    public CustomerSaveDTO( String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public CustomerSaveDTO() {
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
        return "CustomerDTO{" +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

