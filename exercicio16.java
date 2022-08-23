import java.util.Scanner;
public class exercicio16 {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double alturaUsuario,alturaDesejada,alturaEscada,degrausEscada;

        System.out.println("Informe a altura do usuário(cm):");
        alturaUsuario = teclado.nextDouble();
        System.out.println("Informe a altura desejada(cm):");
        alturaDesejada = teclado.nextDouble();
        System.out.println("Informe a altura dos degraus da escada(cm):");
        alturaEscada = teclado.nextDouble();
        System.out.println("Informe a quantidade de degraus da escada:");
        degrausEscada = teclado.nextDouble();

        double alturaTotalDegraus = degrausEscada*alturaEscada;
        double diferencaAlturaDesejada = alturaDesejada-alturaUsuario;
        double quantidadeDeDegrausPraSubir = alturaTotalDegraus-diferencaAlturaDesejada;



        System.out.println("" +quantidadeDeDegrausPraSubir);


    



        

        


        




    }
    
}
