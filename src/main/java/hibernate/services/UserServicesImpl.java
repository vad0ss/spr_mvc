package hibernate.services;

import hibernate.dao.UserDAOImpl;
import hibernate.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dell on 25.11.2015.
 */
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserDAOImpl dao;

    @Override
    public List<UserEntity> getUser() throws SQLException {
        return dao.getUser();
    }

}
