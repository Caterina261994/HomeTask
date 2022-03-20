package com.netcracker.oop2;

public class MyComplex {

    private double real = 0.0;

    private double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag<0) {
            return "(" + real + "-" + imag + "i)";
        }
        return "(" + real + "+" + imag + "i)";
    }

    public boolean equals(double real, double imag) {
        return real == this.real && imag == this.imag;
    }

    public boolean equals(MyComplex right){
        return right.getReal()==this.real && right.getImag()==this.imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public double argument(){
        if (this.real > 0) {
            return Math.atan(imag / real);
        } else {
            if (real < 0 && imag > 0) {
                return Math.PI + Math.atan(imag / real);
            } else {
                return -Math.PI + Math.atan(imag / real);
            }
        }
    }

    public MyComplex divide(MyComplex right) {
        MyComplex temp = new MyComplex(right.getReal(), (-1) * right.getImag());
        temp = this.multiply(temp);
        double denominator = right.getReal() * right.getReal() + right.getImag() * right.getImag();
        this.real = temp.getReal() / denominator;
        this.imag = temp.getImag() / denominator;
        return this;
    }

    public MyComplex subtract(MyComplex right) {
        this.real = this.real - right.getReal();
        this.imag = this.imag - right.getImag();
        return this;
    }

    public MyComplex add(MyComplex right) {
        this.real = this.real + right.getReal();
        this.imag = this.imag + right.getImag();
        return this;
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real*right.getReal() - this.imag*right.getImag();
        this.imag = this.real*right.getReal() + this.imag*right.getImag();
        return  this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.getReal(),this.imag - right.getImag());
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex conjugate(){
        this.imag = this.imag * (-1);
        return this;
    }
}
