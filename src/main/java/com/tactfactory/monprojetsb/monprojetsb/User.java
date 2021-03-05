package com.tactfactory.monprojetsb.monprojetsb;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      private Long id;
      private String firstName;
      private String lastName;
      @OneToMany
      private List<Product> listProduit;

      protected User() {}

      public User(Long id, String firstName, String lastName, List<Product> listProduit) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.listProduit = listProduit;
      }

      @Override
      public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", listProduit=" + listProduit
                + "]";
      }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Product> getListProduit() {
        return listProduit;
    }

    public void setListProduit(List<Product> listProduit) {
        this.listProduit = listProduit;
    }

}