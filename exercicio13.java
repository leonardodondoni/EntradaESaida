import java.util.Scanner;
public class exercicio13 {

    public static void main(String args[]){

    
    Scanner teclado = new Scanner(System.in);

    //Um robô precisa percorrer um piso revestido com cerâmidas pretas e brancas. 
    //Crie um programa que recebe como entrada a linha e a coluna (ver
    //imagem abaixo) correspondente a cada cerâmica do piso e escreve 0 quando
    //a cerâmica tem cor preta e 1 quando a cerâmica tem cor branca
    
    int linha,coluna,cor;
    
    System.out.println("Informe a linha: ");
    linha = teclado.nextInt();
    System.out.println("Informe a coluna: ");
    coluna = teclado.nextInt();

    if ((linha+coluna)%2==0){
        cor = 0;}
        else cor = 1;

    System.out.printf("Cerâmica = %d",cor); 

    

    




    



    
    

    





    }


}

