package robert.vendor.repositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import robert.vendor.models.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    Product findProductByProductId(int id);

    int countProductsByUserIdNotNull();

}
