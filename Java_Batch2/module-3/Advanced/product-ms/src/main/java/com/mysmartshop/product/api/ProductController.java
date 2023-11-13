package com.mysmartshop.product.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysmartshop.product.model.Product;
import com.mysmartshop.product.repository.ProductRepository;
import com.mysmartshop.product.service.ProductService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
    public List<Product> getAll(){
        return productService.getAvailableProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    
    @GetMapping("/{id}")
    public Product getProductDetails(@PathVariable String id){
        return productService.getProductDetails(id);
    }

    @DeleteMapping("/{id}")
    public void removeProduct(@PathVariable String id){
    	productService.removeProduct(id);
    }


}
