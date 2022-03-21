package com.netcracker.oop2;

public class MyPolynomial {

    private double[] coeffs;

    MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length-1;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = coeffs.length - 1; i>=0; i--){
            if(i>1) {
                stringBuilder.append(coeffs[i]).append("x^").append(i).append(" + ");
            }
            else if(i==1){
                stringBuilder.append(coeffs[i]).append("x + ");
            }else {
                stringBuilder.append(coeffs[i]);
            }
        }
        return stringBuilder.toString();
    }
    public double evaluate(double x) {
        double result = 0;

        for (int i = coeffs.length - 1; i >= 0; i--) {
            if(i>1) {
                result += coeffs[i] * Math.pow(x,i);
            }
            else if(i==1){
                result += coeffs[i] * x;
            }else {
                result += coeffs[i];
            }
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){

            double[] result = new double[Math.max(right.getDegree(),this.getDegree()) +1];
            for (int i = 0; i<=Math.max(right.getDegree(),this.getDegree()); i++){
                if(i<=this.getDegree() && i<= right.getDegree()) {
                    result[i] = right.getCoeffs()[i] + this.coeffs[i];
                }else if(right.getDegree()==Math.max(right.getDegree(),this.getDegree())){
                    result[i] = right.getCoeffs()[i];
                }else if (this.getDegree()==Math.max(right.getDegree(),this.getDegree())){
                    result[i] = this.coeffs[i];
                }
            }
            return new MyPolynomial(result);
    }

    public MyPolynomial multiple(MyPolynomial right){

        double[] result = new double[Math.max(right.getDegree(),this.getDegree()) +1];
        for (int i = 0; i<=Math.max(right.getDegree(),this.getDegree()); i++){
            if(i<=this.getDegree() && i<= right.getDegree()) {
                result[i] = right.getCoeffs()[i] * this.coeffs[i];
            }else if(right.getDegree()==Math.max(right.getDegree(),this.getDegree())){
                result[i] = right.getCoeffs()[i];
            }else if (this.getDegree()==Math.max(right.getDegree(),this.getDegree())){
                result[i] = this.coeffs[i];
            }
        }
        return new MyPolynomial(result);
    }


    public static void main(String[] args) {
        MyPolynomial myPolynomial = new MyPolynomial(1,2,3);
        System.out.println(myPolynomial.evaluate(2));
        System.out.println(myPolynomial.multiple(new MyPolynomial(1,2,3,4,5,6)).toString());
    }
}
