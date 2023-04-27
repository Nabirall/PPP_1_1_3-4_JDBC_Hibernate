package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
public static void main(String[] args) {
    UserServiceImpl userService = new UserServiceImpl();
    userService.createUsersTable();
    userService.saveUser("bob", "lol", (byte) 34);
    userService.saveUser("vov", "lole", (byte) 4);
    userService.saveUser("zpd", "lolw", (byte) 124);
    userService.saveUser("cww", "lolq", (byte) 54);
    userService.getAllUsers();
    userService.cleanUsersTable();
    userService.dropUsersTable();
}
}
