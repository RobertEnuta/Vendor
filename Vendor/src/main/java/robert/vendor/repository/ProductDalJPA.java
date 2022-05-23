package robert.vendor.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import robert.vendor.dal.IProductDal;
import robert.vendor.models.Product;
import robert.vendor.repositoryInterfaces.IProductRepository;

import java.util.List;

@Repository
public class ProductDalJPA implements IProductDal {
    @Autowired
    IProductRepository productRepository;

    //create a new product in the database
    @Override
    public void AddProduct(Product p) {
        int prodCount = productRepository.countProductsByUserIdNotNull();
        productRepository.save(p);
        productRepository.countProductsByUserIdNotNull();
    }

    //change product isVisible property to false
    @Override
    public void RemoveProduct(int productId) {
        Product p = productRepository.findProductByProductId(productId);
        p.setIsVisible(false);
        productRepository.saveAndFlush(p);
    }

    @Override
    public void UpdateProduct(int productId, Product p) {
        Product prod = productRepository.findProductByProductId(productId);
        ////check if the returned entity is a product
        productRepository.saveAndFlush(p);
        productRepository.findProductByProductId(p.getProductId());
    }

    //add a check for removed items
    //return selected product in DB
    @Override
    public Product ReadProduct(int productId) {
        return productRepository.findProductByProductId(productId);
    }

    //return a list of all products in DB
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
