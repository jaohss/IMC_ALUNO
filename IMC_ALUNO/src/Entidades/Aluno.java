package Entidades;

public class Aluno extends Pessoas {
    //Definição dos atributos privados
    private double nota;
    private double presenca;

    //Definição dos construtores públicos
    public Aluno(){}

    public Aluno(String nome, String cpf, double peso, double altura, double nota, double presenca){
        super(nome, cpf, peso, altura);
        this.nota=nota;
        this.presenca=presenca;

    }

    //Getters e setters dos atributos específicos do aluno
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPresenca() {
        return presenca;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
    }

    
    
}
