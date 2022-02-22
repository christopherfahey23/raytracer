import java.io.PrintStream;

public class Raytracer {
    public static final int WIDTH = 256;
    public static final int HEIGHT = 256;

    public static void main(String[] args) throws Exception {
        try {
            PrintStream p = new PrintStream("output.ppm");

            p.println("P3");
            p.println(WIDTH + " " + HEIGHT);
            p.println(255);

            for (int j = HEIGHT; j >= 0; j--) {
                System.out.println("Scanlines remaining: " + j);
                for (int i = 0; i < WIDTH; i++) {
                    Vec3 pixelColor = new Vec3(
                        (double) (i) / (WIDTH - 1), 
                        (double) (j) / (HEIGHT - 1), 0.25);
                    Vec3.printAsColor(p, pixelColor);
                }
            }

            p.close();
        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }
}
