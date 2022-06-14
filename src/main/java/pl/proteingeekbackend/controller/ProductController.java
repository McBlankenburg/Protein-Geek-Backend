package pl.proteingeekbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.proteingeekbackend.model.Product;
import pl.proteingeekbackend.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable double id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Product getProductById(@RequestBody Product product){
        return productService.createProduct(product);
    }

}
