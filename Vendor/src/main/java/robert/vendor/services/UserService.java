package robert.vendor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robert.vendor.dal.IUserDal;
import robert.vendor.models.User;
import robert.vendor.serviceinterfaces.IUserService;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserDal userDal;


    @Override
    public void AddUser(User u) {
        userDal.AddUser(u);
    }

    @Override
    public void RemoveUser(int userId) {
        userDal.RemoveUser(userId);
    }

    @Override
    public void UpdateUserName(int userId, String userName) {
        userDal.UpdateUserName(userId,userName);
    }

    @Override
    public User ReadUser(int userId) {
        return userDal.ReadUser(userId);
    }

    @Override
    public User ReadUserName(String userName) { return userDal.ReadUserName(userName);}

}
