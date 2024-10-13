package Main;
//Importação de pacotes 
import Aplicacao.*;
import AtributoException.*;
import Entidades.*;

public class Main {
    public static void main(String[] args) {
        //Instanciando objeto
        Aluno aluno = new Aluno("Cristiano Ronaldo", "07068093868", 80, 1.78, 6.89, 0.90);
        FuncoesUteis funcao = new FuncoesUteis(aluno);
        
        try {
            //Exibição de dados dos alunos
            System.out.println(funcao.descricao());
        } 
        //Exibição de menssagem de erro
        catch (AtributoInvalidoException e) {
            System.out.println("Erro: "+e.getMessage());
        }
       
        
    }
    
}
