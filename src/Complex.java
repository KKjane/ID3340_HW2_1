/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Complex {

    private double real;
    private double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;    
    }
    
    public Complex(double r,double m) {
        this.real = r;
        this.imag = m;
    }
    
    public double getRealPart(){
        return real;
    }
    
    public double getImaginaryPart(){
        return imag;
    }
    
    public Complex add(Complex s){
        double r = real + s.real;
        double m = imag + s.imag;
        return new Complex(r,m);
    }
    
    public Complex substract(Complex s){
        double r = real - s.real;
        double m = imag - s.imag;
        return new Complex(r,m);
    }
    
    public Complex multiple(Complex s){
        //(a + bi)(c + di) = (ac - bd) + (ad +bc)i
        double r = (real * s.real) - (imag * s.imag);
        double m = (real * s.imag) + (imag * s.real);
        return new Complex(r,m);
    }
    
    public Complex add(double s){
        return new Complex(real + s,imag);
    }
    
    public Complex substract(double s){
        return new Complex(real - s,imag);
    }
    
    public Complex multiple (double s){
        return new Complex(real * s,imag * s);
    }
    
    public double magnitude (){
        return Math.sqrt((real*real) + (imag*imag));
    }
    
    @Override
    public String toString(){
        return "(" + real + "+" + imag + "i)";
    }
    
    public boolean compare(Complex s){
        return Math.sqrt((real*real) + (imag*imag)) == Math.sqrt((s.real*s.real) + (s.imag*s.imag));
    }
}
