/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Aluno {

    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMediaFinal() {
        double mediaProvas = (notaProva1 * 0.4) + (notaProva2 * 0.4);
        double mediaTrabalho = notaTrabalho * 0.2;
        return mediaProvas + mediaTrabalho;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno(123456, "João", 7.5, 8.0, 9.0);
        double mediaFinal = aluno.calcularMediaFinal();
        System.out.println("Média final do aluno " + aluno.nome + ": " + mediaFinal);

    }
}
