package com.tactfactory.monprojetsb.monprojetsb;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String Name;
    private Float Price;
    
    @OneToMany
    private List<Product> listProduit;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Float getPrice() {
		return Price;
	}
	public void setPrice(Float price) {
		Price = price;
	}
	public List<Product> getListProduit() {
		return listProduit;
	}
	public void setListProduit(List<Product> listProduit) {
		this.listProduit = listProduit;
	}
    
	
}
