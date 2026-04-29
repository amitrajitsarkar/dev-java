interface Volume {
    double PI = Math.PI;
    double CalVolume(double radius, double height);
}

class Cylinder implements Volume {
    public double CalVolume(double radius, double height) {
        return PI * radius * radius * height;
    }
}

class Cone implements Volume {
    public double CalVolume(double radius, double height) {
        return (PI * radius * radius * height) / 3;
    }
}

public class volmain {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        double x = cl.CalVolume(10, 5);

        Cone co = new Cone();
        double y = co.CalVolume(10, 5);

        System.out.printf("Cylinder : %.3f\n", x);
        System.out.printf("Cone : %.3f", y);
    }
}