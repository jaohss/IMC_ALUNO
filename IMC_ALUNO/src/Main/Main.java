package Main;
//Importação de pacotes 
import Aplicacao.*;
import AtributoException.*;
import Entidades.*;

public class Main {
    public static void main(String[] args) {
        //Instanciando objeto
        Aluno aluno = new Aluno("Audrenilson", "54649458811", 80, 1.78, 6.89, 0.60);
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
