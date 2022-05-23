package robert.vendor.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import robert.vendor.fakerepo.FakeData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Pattern;

import robert.vendor.models.User;
import robert.vendor.serviceinterfaces.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RequestMapping("/users")
public class UserController {

    private static final FakeData data = new FakeData();

    @Autowired
    IUserService userService;

    //return only selected user, most cases it will be the account you log into
    @PreAuthorize("hasAnyRole()")
    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        return ResponseEntity.ok().body(userService.ReadUser(id));
    }

    @GetMapping("/name/{id}")
    public String getUserName(@PathVariable int id) {
        return userService.ReadUser(id).getUsername();
    }

//    @PostMapping("/register")
//    public void createUser(@RequestParam String name, @RequestParam String email, @RequestParam String password){
//        User user = new User(name, email, password);
//        userService.AddUser(user);
//    }
//
//    //endpoint for logging in a user
//    @PostMapping("/login")
//    public ResponseEntity<String> loginUser(@RequestParam String name, @RequestParam String password){
//        return ResponseEntity.ok().body("logged in");
//    }

    //create user api? i guess this is just register


}
