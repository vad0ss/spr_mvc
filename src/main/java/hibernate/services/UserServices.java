package hibernate.services;

import hibernate.entities.UserEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dell on 25.11.2015.
 */
public interface UserServices {

    public List<UserEntity> getUser() throws SQLException;

}
