/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;
    
    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }
    
    // Métodos getters e setters
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Pai: " + pai.getNome() + ", Mãe: " + mae.getNome();
    }
    
    public static void main(String[] args) {
        Pessoa avo1 = new Pessoa("Avo1", 80, null, null);
        Pessoa avo2 = new Pessoa("Avo2", 75, null, null);
        Pessoa pai = new Pessoa("Nome do Pai", 50, avo1, avo2);
        Pessoa avo3 = new Pessoa("Avo3", 70, null, null);
        Pessoa avo4 = new Pessoa("Avo4", 65, null, null);
        Pessoa mae = new Pessoa("Nome da Mãe", 45, avo3, avo4);
        Pessoa filho = new Pessoa("Filho", 20, pai, mae);
        
        System.out.println(filho);
    }
}

