package robert.vendor.interfaces;
import  robert.vendor.models.Product;

import java.util.List;

public interface IProductData {

    boolean AddProduct(Product p);

    boolean RemoveProduct(Integer productId);

    boolean UpdateProduct(int productId, Product p);

    Product ReadProduct(Integer productId);

    List<Product> getAllProducts();

}
