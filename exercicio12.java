import java.util.Scanner;
public class exercicio12 {

    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);

        //Faça um programa que leia uma quantia inteira em R$ e decompõe essa
        //quantia na menor quantidade de notas de 100, 50, 20, 10, 5, 2 e 1. Por
        //exemplo, se o usuário informar R$ 236 como entrada, o programa deve
        //exibir:
        //• 2 nota(s) de 100
        //• 0 nota(s) de 50
        //• 1 nota(s) de 20
        //• 1 nota(s) de 10
        //• 1 nota(s) de 5
        //• 0 nota(s) de 2
        //• 1 moeda(s) de 1
        int quantiaInteira, notaDe100, restoNotaDe100, restoNotaDe50, notaDe50, restoNotaDe20, notaDe20, notaDe10,restoNotaDe10, notaDe5, restoNotaDe5, notaDe2, restoNotaDe2, notaDe1;

        System.out.println("Informe uma quantia inteira em R$: ");
        quantiaInteira = teclado.nextInt();
        notaDe100 = quantiaInteira/100;
        restoNotaDe100 = quantiaInteira%100;
        notaDe50 = restoNotaDe100/50;
        restoNotaDe50 = restoNotaDe100%50;
        notaDe20 = restoNotaDe50/20;
        restoNotaDe20 = restoNotaDe50%20;
        notaDe10 = restoNotaDe20/10;
        restoNotaDe10 = restoNotaDe20%10;
        notaDe5 = restoNotaDe10/5;
        restoNotaDe5 = restoNotaDe10%5;
        notaDe2 = restoNotaDe5/2;
        restoNotaDe2 = restoNotaDe5%2;
        notaDe1 = restoNotaDe2/1;
        System.out.printf("%d nota(s) de 100\n%d nota(s) de 50\n%d nota(s) de 20\n%d nota(s) de 10\n%d nota(s) de 5\n%d nota(s) de 2\n%d nota(s) de 1", notaDe100, notaDe50, notaDe20, notaDe10, notaDe5, notaDe2, notaDe1);








    }
    
}
