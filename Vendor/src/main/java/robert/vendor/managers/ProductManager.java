package robert.vendor.managers;

import org.springframework.stereotype.Service;
import robert.vendor.models.Product;
import robert.vendor.interfaces.IProductData;

import java.util.List;

@Service
public class ProductManager implements IProductData {

    //Add methods
    @Override
    public boolean AddProduct(Product p) {
        return false;
    }

    @Override
    public boolean RemoveProduct(Integer product_id) {
        return false;
    }

    @Override
    public boolean UpdateProduct(int productId, Product p) {
        return false;
    }

    @Override
    public Product ReadProduct(Integer product_id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
