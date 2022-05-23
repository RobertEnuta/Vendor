package robert.vendor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import robert.vendor.serviceinterfaces.IProductService;
import robert.vendor.models.Product;
import robert.vendor.fakerepo.FakeData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", maxAge = 3600)
@RequestMapping("/products")
public class ProductController {

    private static final FakeData data = new FakeData();

    @Autowired
    IProductService productService;

    //products dont require authorization to view since I want people to look for the item they want without an account
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        List<Product> visibleProducts = new ArrayList<>();
        if (products != null) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).isVisible()){
                    visibleProducts.add(products.get(i));
                }
            }
            return ResponseEntity.ok().body(visibleProducts);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        return ResponseEntity.ok().body(productService.ReadProduct(id));
    }

//    public String getItemName(int itemId) {
//        return data.getProductByIdFake(itemId).getName();
//    }

    //Create a product
    @PostMapping("{userId}")
    public void createItemListing(@PathVariable int userId, @RequestParam String itemName, @RequestParam Double price, @RequestParam String description) {
        //save current date and time
        LocalDateTime uploadDate = LocalDateTime.now();
        //create a date formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //change the format of the date to match the formatter
        uploadDate.format(formatter);
        Product productCreated = new Product(userId, itemName, price, description, uploadDate);
        productService.AddProduct(productCreated);
    }

    //update a product
    @PutMapping("{productId}")
    public void updateItem(@PathVariable int productId, @RequestParam String itemName, @RequestParam double price, @RequestParam String description){
        Product p = productService.ReadProduct(productId);
        p.setName(itemName);
        p.setPrice(price);
        p.setDescription(description);
        productService.UpdateProduct(productId, p);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("{productId}/hide")
    public void hideItem(@PathVariable int productId){
        Product p = productService.ReadProduct(productId);
        p.setIsVisible(false);
        productService.UpdateProduct(productId, p);
    }
}
