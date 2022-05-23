package robert.vendor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robert.vendor.serviceinterfaces.IProductService;
import robert.vendor.dal.IProductDal;
import robert.vendor.models.Product;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductDal prodDal;

    @Override
    public void AddProduct(Product p) {
        int size = prodDal.getAllProducts().size();
        prodDal.AddProduct(p);
        prodDal.getAllProducts();
    }

    @Override
    public void RemoveProduct(int productId) {
        prodDal.RemoveProduct(productId);
    }

    @Override
    public void UpdateProduct(int productId, Product p) {
        Product oldProd = prodDal.ReadProduct(productId);
        prodDal.UpdateProduct(productId, p);
        //check if the old product from the db still matches the updated one
        prodDal.ReadProduct(p.getUserId());
    }

    @Override
    public Product ReadProduct(Integer productId) {
        return prodDal.ReadProduct(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return prodDal.getAllProducts();
    }
}
