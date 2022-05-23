package robert.vendor.serviceinterfaces;

import robert.vendor.models.Product;

import java.util.List;

public interface IProductService {
    void AddProduct(Product p);

    void RemoveProduct(int productId);

    void UpdateProduct(int productId, Product p);

    Product ReadProduct(Integer productId);

    List<Product> getAllProducts();
}
