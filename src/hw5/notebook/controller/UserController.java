package hw5.notebook.controller;

import hw5.notebook.repository.model.User;
import hw5.notebook.repository.GBRepository;

import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository<User, Long> repository;

    public UserController(GBRepository<User, Long> repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }

    public User findUserById(long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found."));
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public boolean userUpdate(long id, User update) {
        try {
            repository.update(id, update);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean delete(long id) {
        try {
            repository.delete(id);
            return true;
        } catch (Exception e) {
            e.getCause();
        }
    return false;
    }
}