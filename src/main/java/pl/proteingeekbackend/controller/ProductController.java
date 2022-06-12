package pl.proteingeekbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.proteingeekbackend.model.Product;
import pl.proteingeekbackend.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return ProductService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(){
        return ProductService.getProductById();
    }


}
