package hibernate.dao;

import hibernate.entities.UserEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dell on 20.11.2015.
 */
public interface UserDAO {
    public List<UserEntity> getUser() throws SQLException;
}