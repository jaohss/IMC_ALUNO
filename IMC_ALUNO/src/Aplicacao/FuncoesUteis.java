package Aplicacao;

//Importação dos pacotes
import AtributoException.AtributoInvalidoException;
import Entidades.Aluno;

public class FuncoesUteis  {
    //Definição do atributo privado da classe
    private Aluno aluno;

    //Definição do construtor
    public FuncoesUteis(Aluno aluno){
        this.aluno = aluno;
    }

    //Vericação CPF
    private String VerificarCpf() throws AtributoInvalidoException{
        String cpf = aluno.getCpf();

        //verificação se o cpf for vazio
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new AtributoInvalidoException("O CPF não pode ser nulo");
        }
    
        //Verificação se o cpf possui 11 digitos
        if (cpf.length() != 11) {
            throw new AtributoInvalidoException("CPF deve ter 11 dígitos. Este CPF possui apenas "+cpf.length() + " digitos");
        }

        //Verificação do primeiro digito verificador
        int soma=0;
        for(int i =0;i<9;i++){
             soma+= (cpf.charAt(i)-'0') * (10 - i);
        }

        int primeiroDigitoCheck = 11 - (soma%11);
        if(primeiroDigitoCheck >= 10){
            primeiroDigitoCheck=0;
        }
        //Verificação se o primeiro digito verificador está correto
         if(primeiroDigitoCheck != cpf.charAt(9)-'0'){
            throw new AtributoInvalidoException("CPF inválido");
         }
         
        //Verificação do segundo digito verificador
        soma = 0;
         for (int i=0;i<10;i++){
            soma+= (cpf.charAt(i)-'0') * (11-i);
         } 
         int segundoDigitoCheck = 11 - (soma%11);
         if(segundoDigitoCheck >=10){
            segundoDigitoCheck=0;
         }

         //Verificação se o segundo digito verificador está correto
         if(segundoDigitoCheck != (cpf.charAt(10)-'0')){
            return "Segundo digito verificador inválido";
         }

         return "O CPF " + cpf + " é válido";

    }

    //Calculo IMC
    private String CalculoImc(){
        double peso = aluno.getPeso();
        double altura = aluno.getAltura();

        //IMC = PESO/(ALTURA²)
        double imc = peso/(Math.pow(altura, 2));

        if(imc < 18.5){
            return"Abaixo do peso";
        }

        else if(imc >= 18.5 && imc <= 24.9){
            return"Peso normal";
        }

        else if(imc >= 25 && imc <= 29.9){
            return"Sobrepeso";
        }

        else if( imc >=30 && imc <= 34.9){
            return "Obesidade grau I";
        }

        else if (imc >= 35 && imc <= 39.9){
            return "Obesidade grau II";
        }

        else{
            return "Obesidade grau III.";
        }
    }

    //Método para verificação da nota e presença do aluno
    private String AvaliarNota(){
        double nota = aluno.getNota();
        double presenca = aluno.getPresenca();

        //o aluno apenas é aprovado se sua nota for maior ou igual a 5 e se tiver presença maior que 75%(0,75)
        if(nota >=5 && presenca >0.75 ){
            return "Aluno aprovado";
        }
        else{
            return "Aluno reprovado";
        }
    }

    public String descricao() throws AtributoInvalidoException{
        return "\nDados aluno:"+
        "\nNome: "+aluno.getNome()+
        "\nCPF: "+aluno.getCpf()+
        "\nNota: "+aluno.getNota()+
        "\nPresença: "+aluno.getPresenca()*100 + "%\n" +
        "\nIMC:" + CalculoImc()+
        "\nStatus CPF: "+VerificarCpf()+
        "\nSituação Aluno: "+AvaliarNota();
        


    }
        
}