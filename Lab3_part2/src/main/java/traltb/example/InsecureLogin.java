package traltb.example;

public class InsecureLogin {

    public static void login(String username, String password) {
        if (username.equals("admin") && password.equals("123456")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public void printUserInfo(String user) {
        System.out.println("User: " + user);
    }


    }
