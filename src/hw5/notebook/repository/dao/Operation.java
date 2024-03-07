package hw5.notebook.repository.dao;

import java.util.List;

public interface Operation<T> {
    List<T> readAll();
    void saveAll(List<T> data);
}
