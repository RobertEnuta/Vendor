package robert.vendor.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

//    @OneToOne
//    @JoinColumn(name = "productId")
//    private User seller;
    @Column
    private int userId;
    @Column
    private String name;
    @Column
    private Double price;
    //shows the product to the frontend if true, changed to false when item listed is removed
    @Column
    private String description;
    @Column
    private LocalDateTime uploadDate;
    @Column
    private boolean isVisible = true;
    @OneToMany
    @JoinColumn(name = "productId")
    List<Image> images = new ArrayList<>();

    public Product() {
    }

    public Product(int userId, String name, Double price, String description, LocalDateTime uploadDate) {
        this.userId = userId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.uploadDate = uploadDate;
    }

//    public Product(int userId, String name, Double price, String description) {
//        this.userId = userId;
//        this.name = name;
//        this.price = price;
//        this.description = description;
//    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean visible) {
        isVisible = visible;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void addImage(Image image) {
        this.images.add(image);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", uploadDate=" + uploadDate +
                ", isVisible=" + isVisible +
                '}';
    }
}
