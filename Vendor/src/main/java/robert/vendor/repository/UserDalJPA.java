package robert.vendor.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import robert.vendor.dal.IUserDal;
import robert.vendor.models.User;
import robert.vendor.repositoryInterfaces.IUserRepository;

@Repository
public class UserDalJPA implements IUserDal {

    @Autowired
    IUserRepository userRepository;

    //add new user in the database
    @Override
    public void AddUser(User u) {
        userRepository.save(u);
    }
    //hide a user from the front end in the database
    @Override
    public void RemoveUser(int userId) {
        User u = userRepository.findUserByUserId(userId);
        u.setVisible(false);
        userRepository.saveAndFlush(u);
    }

    @Override
    public void UpdateUserName(int userId, String userName) {
        User u = userRepository.findUserByUserId(userId);
        u.setUsername(userName);
        userRepository.saveAndFlush(u);
    }

    @Override
    public User ReadUser(int userId) {
        return userRepository.findUserByUserId(userId);
    }

    @Override
    public User ReadUserName(String username) { return  userRepository.findByUsername(username);}
}
