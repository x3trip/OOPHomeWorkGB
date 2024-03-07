package hw5.notebook.controller;

import hw5.notebook.repository.GBRepository;
import hw5.notebook.repository.dao.impl.FileOperation;
import hw5.notebook.repository.impl.UserRepository;
import hw5.notebook.repository.model.User;
import hw5.notebook.view.UserView;

import static hw5.notebook.util.DBConnector.DB_PATH;
import static hw5.notebook.util.DBConnector.createDB;

public class Program {
    public static void runApp() {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
