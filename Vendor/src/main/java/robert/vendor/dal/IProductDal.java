package robert.vendor.dal;
import  robert.vendor.models.Product;

import java.util.List;

public interface IProductDal {

    void AddProduct(Product p);

    void RemoveProduct(int productId);

    void UpdateProduct(int productId, Product p);

    Product ReadProduct(int productId);

    List<Product> getAllProducts();
}
