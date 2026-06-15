import java.io.*;
import java.nio.file.*;

class PathTraversalExample {
    private static final String BASE_DIR = "/safe/files/";

    public static void main(String[] args) throws IOException {
        String userInput = "report.txt";
        Path basePath = Paths.get(BASE_DIR).toRealPath();
        Path filePath = basePath.resolve(userInput).normalize();

        if (!filePath.startsWith(basePath)) {
            throw new SecurityException("Path traversal detected!");
        }
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filePath.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}