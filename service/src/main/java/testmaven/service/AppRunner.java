package testmaven.service;

public class AppRunner {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.getUser(25L));
    }
}
