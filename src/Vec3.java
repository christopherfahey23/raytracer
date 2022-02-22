import java.io.PrintStream;

public class Vec3 {
    private double x, y, z;

    public Vec3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vec3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    public Vec3 negative() {
        return new Vec3(-x, -y, -z);
    }

    public Vec3 plus(double c) { return new Vec3(x + c, y + c, z + c); }

    public Vec3 plus(Vec3 a) { 
        return new Vec3(x + a.getX(), y + a.getY(), z + a.getZ());
    }

    public Vec3 minus(double c) { return this.plus(-c); }

    public Vec3 minus(Vec3 a) { 
        return this.plus(a.negative());
    }

    public Vec3 mult(double c) { return new Vec3(x * c, y * c, z * c); }

    public Vec3 mult(Vec3 a) {
        return new Vec3(x * a.getX(), y * a.getY(), z * a.getZ());
    }

    public Vec3 div(double c) { return this.mult((1/c)); }

    public double dot(Vec3 a) {
        return x * a.getX() + y * a.getY() + z * a.getZ();
    }

    public Vec3 cross(Vec3 a) {
        return new Vec3(
            y * a.getZ() - z * a.getY(),
            z * a.getX() - x * a.getZ(),
            x * a.getY() - y * a.getX());
    }

    public double length() { return Math.sqrt(this.lengthSquared()); }

    public double lengthSquared() { return this.dot(this); }

    public Vec3 unitVector() { return this.div(this.length()); }

    public void print(PrintStream p) { p.print(x + " " + y + " " + z); }

    public static void printAsColor(PrintStream p, Vec3 c) {
        p.println(
            (int) (255.999 * c.getX()) + " " +
            (int) (255.999 * c.getY()) + " " + 
            (int) (255.999 * c.getZ()));
    }
}
