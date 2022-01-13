package com.company;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {
        this.z = 0.0f;
    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.z = z ;
    }

     public double[] getXYZ() {
        return new double[]{this.getX(),this.getY(),z};
     }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+","+z+")";
    }
}
