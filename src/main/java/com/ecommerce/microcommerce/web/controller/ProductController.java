package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    // Liste de produits
    @RequestMapping(value="/Produits", method= RequestMethod.GET)
    public String listeProduits() {
        return "Un exemple de produit";
    }

    // Un produit via son id
    @GetMapping(value = "/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        Product product = new Product(id, new String("Aspirateur"),100 );
        return product;
    }

    //@PostMapping
    //@DeleteMapping
}


