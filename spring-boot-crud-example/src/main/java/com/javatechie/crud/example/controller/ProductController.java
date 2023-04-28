package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/productById/{id}")
    public Product getProductById(@PathVariable int id)
        {
            return service.getProductById(id);
        }
    @GetMapping("/productByName/{name}")
    public Product getProductByName(@PathVariable String name)
    {
        return service.getProductByName(name);
    }
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProductById(@PathVariable int id)
    {
     return service.deleteProductById(id);
    }


}
