import java.io.FileWriter;

public class Raytracer {
    public static final int WIDTH = 256;
    public static final int HEIGHT = 256;

    public static void main(String[] args) throws Exception {
        try {
            FileWriter f = new FileWriter("output.ppm");

            f.write("P3\n");
            f.write(WIDTH + " " + HEIGHT + "\n");
            f.write(255 + "\n");

            for (int i = 0; i < HEIGHT; i++) {
                for (int j = 0; j < WIDTH; j++) {
                    f.write("255 0 0\n");
                    System.out.println("Scanline " + (i + 1) + " of 256");
                }
            }

            f.close();
        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }
}
