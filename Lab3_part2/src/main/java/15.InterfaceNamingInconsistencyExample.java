interface LoginHandler {
    boolean login(String username, String password);
}

class DefaultLoginHandler implements LoginHandler {
    @Override
    public boolean login(String username, String password) {
        return username != null && !username.isEmpty()
                && password != null && !password.isEmpty();
    }
}