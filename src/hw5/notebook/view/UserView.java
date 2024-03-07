package hw5.notebook.view;

import hw5.notebook.controller.UserController;
import hw5.notebook.repository.model.User;
import hw5.notebook.util.Commands;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;
    private static final Logger LOGGER = LogManager.getLogger();

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){

        Commands com;

        while (true) {
            String command = prompt("Input command: ");
            com = Commands.valueOf(command);
            if (com.equals(Commands.EXIT)) return;
            switch (com) {
                case CREATE -> {
                    LOGGER.info("Creating users.");
                    String firstName = prompt("Name: ");
                    String surName = prompt("SurName: ");
                    String phone = prompt("Phone number: ");
                    userController.saveUser(new User(firstName, surName, phone));
                }
                case READ -> {
                    String id = prompt("Please input id to find user: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case LIST -> {
                    LOGGER.info("Showing all list of users.");
                    List<User> users = userController.getAllUsers();
                    for (User user : users) {
                        System.out.println(user);
                    }
                }
                case UPDATE -> {
                    LOGGER.warn("Beginning to update user... ");
                    long userId = Long.parseLong(prompt("Input id users: "));
                    String updateName = prompt("Name: ");
                    String updateLastName = prompt("SurName:  ");
                    String updatePhone = prompt("PhoneNumber: ");
                    User updatedUser = new User(updateName, updateLastName, updatePhone);
                    userController.userUpdate(userId, updatedUser);
                }
                case DELETE -> {
                    LOGGER.info("Begin to delete...");
                    long idForDelete = Long.parseLong(prompt("Input Id for delete: "));
                    if (userController.delete(idForDelete)) System.out.println("Delete was successful");
                    else LOGGER.error("Users was not found");
                }
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
