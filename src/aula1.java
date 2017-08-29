/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class aula1 {
    
    public static void main(String args[]){
    
            int i,numAlunos,cont=0;
            double nota1, nota2, media;
            numAlunos = Input.readInt("Digite a qtde de alunos: ");
            
            for(i=0;i<numAlunos;i++){
                System.out.println("Aluno "+(i+1));
                nota1=Input.readDouble("Nota1: ");
                nota2=Input.readDouble("Nota2: ");;
                media = (nota1+nota2)/2;
                if(media >= 6)
                    cont++;
            }
            System.out.println("Qtde de alunos aprovados: "+cont);
            
    }
}
