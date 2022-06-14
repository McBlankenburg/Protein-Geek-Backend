package pl.proteingeekbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.proteingeekbackend.model.Product;
import pl.proteingeekbackend.repository.ProductRepository;

import java.util.List;


@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;


    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(double id) {
        return (Product) productRepository.findById(id).orElseThrow();
    }

    public Product createProduct(Product product) {
        return (Product) productRepository.save(product);

    }
}