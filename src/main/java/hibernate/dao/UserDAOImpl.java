package hibernate.dao;

import hibernate.entities.UserEntity;
import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dell on 20.11.2015.
 */

public class UserDAOImpl implements UserDAO {

        private EntityManager em;

        public List<UserEntity> getUser() throws SQLException {
            List<UserEntity> userList = null;
            userList = em.createQuery("SELECT e FROM User e", UserEntity.class).getResultList();
            return userList;
        }

}