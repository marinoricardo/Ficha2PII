/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;
    private boolean ligado;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Carro desligado");
    }

    public void acelerar() {
        if (this.ligado) {
            this.velocidade += 10;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("Não é possível acelerar com o carro desligado.");
        }
    }

    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= 10;
            System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("Não é possível frear com o carro parado.");
        }
    }

    public void dirigir(int distancia) {
        if (this.ligado) {
            double tempo = (double)distancia / this.velocidade;
            System.out.println("Dirigindo por " + distancia + " km. Tempo estimado: " + tempo + " horas.");
        } else {
            System.out.println("Não é possível dirigir com o carro desligado.");
        }
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("BMW", 1975, "Verde");
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.dirigir(50);
        meuCarro.frear();
        meuCarro.dirigir(100);
        meuCarro.desligar();
    }
}

