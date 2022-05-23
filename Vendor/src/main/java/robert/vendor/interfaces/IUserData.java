package robert.vendor.interfaces;

import robert.vendor.models.User;

import java.util.List;

public interface IUserData {

    boolean AddUser(User u);

    boolean RemoveUser(Integer userId);

    boolean UpdateUser(User u);

    User ReadUser(Integer userId);

    List<User> getAllUsers();

    User ReadUserName(String username);

}
