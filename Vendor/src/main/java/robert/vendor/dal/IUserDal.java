package robert.vendor.dal;
import robert.vendor.models.User;

public interface IUserDal {

    void AddUser(User u);

    void RemoveUser(int userId);

    void UpdateUserName(int userId, String userName);

    User ReadUser(int userId);

    User ReadUserName(String userName);

}
