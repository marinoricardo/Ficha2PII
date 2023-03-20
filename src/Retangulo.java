/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return base * altura;
    }
    
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
