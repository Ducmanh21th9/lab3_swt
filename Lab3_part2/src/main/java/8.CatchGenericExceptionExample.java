import java.util.logging.Logger;

class CatchGenericExceptionExample {
    private static final Logger logger =
            Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            logger.severe("Null pointer: " + e.getMessage());
        }
    }
}