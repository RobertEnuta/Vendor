package robert.vendor.fakerepo;

import robert.vendor.models.Address;
import robert.vendor.models.Product;
import robert.vendor.models.User;
import robert.vendor.interfaces.IProductData;
import robert.vendor.interfaces.IUserData;

import java.util.ArrayList;
import java.util.List;

public class FakeData implements IProductData, IUserData {

    private final List<Product> products = new ArrayList<>();
    private final List<User> users = new ArrayList<>();
    private final List<Address> addresses = new ArrayList<>();

    public FakeData() {
        Product car = new Product(1, "Toyota Corolla 2011", 12.20,"",null);
        Product phone = new Product(2, "Nokia 3300", 14.20,"",null);
        products.add(car);
        products.add(phone);
        User u = new User("R","email@ex.com","1");
        users.add(u);
        u = new User("B","bmail@ex.com","2");
        users.add(u);
        addresses.add(new Address("Netherlands","Eindhoven","1","1000NL"));
    }

    public List<Product> getAllProductsFake() {
        return products;
    }

    public Product getProductByIdFake(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getProductId()) {
                return products.get(i);
            }
        }
        return null;
    }

    public List<User> getAllUsersFake() {
        return users;
    }

    public User getUserByIdFake(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (id == users.get(i).getUserId()) {
                return users.get(i);
            }
        }
        return null;
    }

    public void addProductFake(Product product) {
        products.add(product);
    }

    public Address getAddressByCodeFake(String postal) {
        for (int i = 0; i < addresses.size(); i++) {
            if (postal.equals(addresses.get(i).getPostalCode())) {
                return addresses.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean AddProduct(Product p) {
        //save length of the array
        int length = products.size();
        products.add(p);
        //check if the size of the list has increased
        return length != products.size();
    }

    @Override
    public boolean RemoveProduct(Integer product_id) {
        //save length of the array
        int length = products.size();
        for (int i = 0; i < length; i++) {
            //check if id is found in list and remove it
            if (products.get(i).getProductId() == product_id) {
                products.remove(i);
                return true;
            }
        }
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
        return products;
    }

    @Override
    public boolean AddUser(User u) {
        return false;
    }

    @Override
    public boolean RemoveUser(Integer userId) {
        return false;
    }

    @Override
    public boolean UpdateUser(User u) {
        return false;
    }

    @Override
    public User ReadUser(Integer userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User ReadUserName(String username) { return null;}
}
