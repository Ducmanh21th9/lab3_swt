final class AppConstants {
    private AppConstants() {}

    public static final int MAX_USERS = 100;
}

class InterfaceFieldModificationExample {
    public static void main(String[] args) {
        System.out.println("Max users: " + AppConstants.MAX_USERS);
    }
}