package Entidades;

public class Pessoas {
    //Definição dos atributos privados de pessoas
    private String nome;
    private String cpf;
    private double peso;
    private double altura;

    //Definição dos contrutores públicos
    public Pessoas(){}

    public Pessoas(String nome, String cpf, double peso, double altura){
        this.nome=nome;
        this.cpf=cpf;
        this.peso=peso;
        this.altura=altura;
    }

    //Getters e setters dos atributos comuns de pessoas
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
}
