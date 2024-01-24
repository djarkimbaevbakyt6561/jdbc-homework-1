package peaksoft;

import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
//        1
        userService.createUsersTable();

//        2
//        userService.saveUser("Bakyt", "Dzharkymbaev", (byte) 16);
//        userService.saveUser("Nurgazy", "Hellobariev", (byte) 23);
//        userService.saveUser("Slesar", "Faridov", (byte) 53);
//        userService.saveUser("Nurmuhammed", "Agai", (byte) 53);

//        3
//        System.out.println(userService.getAllUsers());

//        4
//        userService.removeUserById(1L);
//        System.out.println(userService.getAllUsers());

//        5
          userService.cleanUsersTable();
    }
}
