import java.util.logging.Logger;

class UnreachableCodeExample {
    private static final Logger logger =
            Logger.getLogger(UnreachableCodeExample.class.getName());

    public static int getNumber() {
        int result = 42;
        logger.info("Returning: " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}