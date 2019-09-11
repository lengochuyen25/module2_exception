public class Triangle {
    double a, b, c;

    public Triangle() {
    }

    //this is contructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Cac canh tam giac phai lon hon 0");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Tong hai canh phai lon hon canh thu 3");
        } else {
            System.out.println("\n This is a triangle");
        }
    }
}


