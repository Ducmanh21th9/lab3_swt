import java.util.logging.Logger;

class HardcodedCredentialsExample {
    private static final Logger logger =
            Logger.getLogger(HardcodedCredentialsExample.class.getName());

    public static void main(String[] args) {
        String username = System.getenv("APP_USERNAME");
        String password = System.getenv("APP_PASSWORD");
        if (authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.warning("Access denied");
        }
    }
    private static boolean authenticate(String user, String pass) {
        String validUser = System.getenv("APP_USERNAME");
        String validPass = System.getenv("APP_PASSWORD");
        return validUser != null && validUser.equals(user)
                && validPass != null && validPass.equals(pass);
    }
}