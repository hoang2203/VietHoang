package bai1;

public class HinhTron {
    private double radius = 1.0;

    public HinhTron() {
    }

    public HinhTron(double radius) {
        if ( radius <= 0){
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumfernece(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle" + "[" + radius + "]" + "\nArea = " + getArea() + "\nCircumference = " + getCircumfernece();
    }
}
