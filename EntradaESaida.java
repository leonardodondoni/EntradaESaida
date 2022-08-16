import java.util.Scanner;
public class EntradaESaida
{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        //double valor1,resultado;
        //int valor2;
        //String nome;

        //System.out.println("Vai");
        //System.out.println("tomar");
        //System.out.println("no");
        //System.out.println("cu");
        //System.out.println("Informe o nome: ");
        //nome = teclado.nextLine();
        //System.out.println("Digite o valor1 em reais: ");
        //valor1 = teclado.nextDouble();
        //System.out.println("Digite o valor2 em inteiros: ");
        //valor2 = teclado.nextInt();
        //resultado = valor1+valor2;
        //System.out.println("Resultado: "+resultado);

        //System.out.println("Nome: " + nome + "Valor1: " + valor1 + "Valor2: " +valor2);
        
        //double volume,raio;

        //System.out.println("Informe o valor de raio: ");
        //raio = teclado.nextDouble();
        //volume= 4.0/3*Math.PI*Math.pow(raio,3);
        //System.out.println("Volume: " +volume);

        //double area,raio;

        //System.out.println("Informe o valor de raio: ");
        //raio = teclado.nextDouble();
        //area = 4.0*Math.PI*Math.pow(raio,2);
        //System.out.println("Área: " +area);

        //double valor,resultado1,resultado2,resultado3;

        //System.out.println("Informe o valor de n: ");
        //valor = teclado.nextDouble();
        //resultado1 = Math.pow(valor,2);
        //resultado2aa = Math.pow(valor,3);
        //resultado3 = Math.pow(valor,4);
        //System.out.println("Resultado de n²: " + resultado1 + "Resultado de n³: " + resultado2 + "Resultado de n².n²= " + resultado3);
        
        //double fahrenheit,celsius;

        //System.out.println("Informe a temperatura em fahrenheit: ");
        //fahrenheit = teclado.nextDouble();
        //celsius = 5.0/9*(fahrenheit-32);
        //System.out.println("Temperatura em celsius: " +celsius);

        int primeiro_valor,segundo_valor;
        int soma,diferença,media,distancia,maior,menor;

        System.out.println("Informe números inteiros, o código exibirá para você a soma, a diferença, a média, a diferença entre eles(valor absoluto), o maior dos dois, e o menos dos dois");
        System.out.println("Informe o primeiro valor:");
        primeiro_valor = teclado.nextInt();
        System.out.println("Informe o segundo valor:");
        segundo_valor = teclado.nextInt();
        soma = primeiro_valor+segundo_valor;
        diferença = primeiro_valor-segundo_valor;
        media = primeiro_valor/segundo_valor;
        distancia = Math.abs(primeiro_valor-segundo_valor);
        maior = Math.max(primeiro_valor,segundo_valor);
        menor = Math.min(primeiro_valor,segundo_valor); 

        System.out.println("Soma:" +soma +  "Diferença:" +diferença + "Média:" +media + "Distância entre os números:" +distancia + "Maior número:" +maior + "Menor número:" +menor);







    }

}
 