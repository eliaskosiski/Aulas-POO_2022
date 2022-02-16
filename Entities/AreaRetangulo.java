package Entities;


public class AreaRetangulo
{
    private double base;
    private double altura;
    
    public AreaRetangulo(){
        this.base = 10.56;
        this.altura = 56.22;
    }
    
    public double get(){
        return (this.base * this.altura);
    }
    
    public void set(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
}
