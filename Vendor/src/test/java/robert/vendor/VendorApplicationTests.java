package robert.vendor;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import robert.vendor.models.Address;
import robert.vendor.models.Product;
import robert.vendor.models.User;
import robert.vendor.controllers.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import robert.vendor.controllers.UserController;
import robert.vendor.fakerepo.FakeData;
import robert.vendor.serviceinterfaces.IProductService;
import robert.vendor.serviceinterfaces.IUserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(SpringExtension.class)
//@DataJpaTest
//@TestPropertySource(properties = {"spring.datasource.url=jdbc:mysql://localhost:3306/vendor?autoReconnect=true&useSSL=false\n" +
//		"spring.datasource.driver-class-name=com.mysql.jdbc.Driver\n" +
//		"spring.datasource.username=root\n" +
//		"spring.datasource.password=2006\n" +
//		"\n" +
//		"spring.jpa.show-sql=true\n" +
//		"spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect\n" +
//		"spring.jpa.hibernate.ddl-auto= update\n"})
@SpringBootTest
class VendorApplicationTests {

	 @Test
	 void contextLoads() {
	 	FakeData f = new FakeData();
	 	assertEquals(f.getAllProducts().get(0).getName() , f.getAllProducts().get(0).getName());
	 }

	 @Test
	 void userNameTest(){
	 	User u = new User("test","email","111");
	 	u.setUsername("name");
	 	assertEquals("name",u.getUsername());
	 }

	 @Test
	 void userPasswordTest() {
	 	User u = new User("test","email","111");
	 	u.setPassword("pas");
	 	assertEquals("pas",u.getPassword());
	 }

	 @Test
	 void userEmailTest() {
	 	User u = new User("test","email","111");
	 	u.setEmail("email1@test.com");
	 	assertEquals("email1@test.com",u.getEmail());
	 }

	 @Test
	 void userVisible() {
	 	User u = new User("test","email","111");
	 	u.setVisible(false);
	 	assertFalse(u.isVisible());
	 }
	 @Test
	 void userTest() {
	 	User u = new User("test","email","111");
	 	assertNotNull(u);
	 }

	 @Test
	 void userIdTest(){
	 	User u = new User("test","email","111");
	 	u.setUserId(112);
	 	assertEquals(112,u.getUserId());
	 }

	 @Test
	 void productTest(){
	 	Product p = new Product(0,"product",1.00,"s",null);
	 	assertNotNull(p);
	 }

	 @Test
	 void productNameTest(){
	 	Product p = new Product(0,"product",1.00,"s",null);
	 	p.setName("newname");
	 	assertEquals("newname",p.getName());
	 }

	 @Test
	 void productPriceTest(){
	 	Product p = new Product(0,"product",1.00,"s",null);
	 	p.setPrice(100.00);
	 	assertEquals(100.00,p.getPrice());
	 }

	 @Test
	 void productDescriptionTest(){
	 	Product p = new Product(0,"product",1.00,"s",null);
	 	p.setDescription("description");
	 	assertEquals("description", p.getDescription());
	 }

	 @Test
	 void productDateTest(){
	 	Product p = new Product(0,"product",1.00,"s",null);
	 	LocalDateTime uploadDate = LocalDateTime.now();
	 	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 	uploadDate.format(formatter);
	 	p.setUploadDate(uploadDate);
	 	assertEquals(uploadDate, p.getUploadDate());
	 }

	 @Test
	 void productUserIdTest(){
	 	Product p = new Product(0,"product",1.00,"s",null);
	 	p.setUserId(1);
	 	assertEquals(1,p.getUserId());
	 }

}
