package hw5.notebook.repository.impl;

import hw5.notebook.util.mapper.impl.UserMapper;
import hw5.notebook.repository.GBRepository;
import hw5.notebook.repository.dao.impl.FileOperation;
import hw5.notebook.repository.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private final FileOperation operation;

    public UserRepository(FileOperation operation) {
        this.mapper = new UserMapper();
        this.operation = operation;
    }

    @Override

    public List<User> findAll() {
        List<String> lines = operation.readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id) {
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User u : users) {
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long id, User update) {
        try {
            List<User> users = findAll();
            User updateUser = users.stream().filter(u -> u.getId().equals(id))
                    .findFirst()
                    .get();
            updateUser.setFirstName(update.getFirstName());
            updateUser.setLastName(update.getLastName());
            updateUser.setPhone(update.getPhone());
            List<String> list = new ArrayList<>();
            for (User user : users) {
                list.add(mapper.toInput(user));
            }
            operation.saveAll(list);
            return Optional.of(updateUser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Long id) {
        long idForDelete = findAll()
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .get().getId();

        List<String> list = new ArrayList<>();
        for (User user : findAll()) {
            if (user.getId().equals(idForDelete)) continue;
            list.add(mapper.toInput(user));
        }
        operation.saveAll(list);
        System.out.println(idForDelete);
        return true;
    }
}
