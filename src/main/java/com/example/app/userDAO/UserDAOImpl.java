package com.example.app.userDAO;

import com.example.app.model.User;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public void updateUser(User user) {
        manager.merge(user);
    }

    @Override
    public List<User> getAllUsers() {
        return manager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        manager.persist(user);
    }

    @Override
    public User getUserById(long id) {
        return manager.find(User.class, id);
    }

    @Override
    public void removeUser(long id) {
        manager.remove(manager.find(User.class, id));
    }
}
