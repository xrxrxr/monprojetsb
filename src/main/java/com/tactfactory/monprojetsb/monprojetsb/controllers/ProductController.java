package com.tactfactory.monprojetsb.monprojetsb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tactfactory.monprojetsb.monprojetsb.entities.Product;
import com.tactfactory.monprojetsb.monprojetsb.repositories.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @RequestMapping("/index")
    public String hello(Model model) {
        List<Product> produits = this.repo.findAll();
        model.addAttribute("allproducts", produits);

        return "productList";
    }

}
