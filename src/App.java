import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float peso = 0;
        float altura = 0;

        System.out.println("Calculadora IMC");

        System.out.println("Seu peso?");
        peso = entrada.nextFloat();
        System.out.println("Sua altura?");
        altura = entrada.nextFloat();

        float altura2 = altura*altura;
        float calculoIMC = peso/altura2;

        System.out.println("Seu IMC é: " + calculoIMC);
        System.out.println("");
        if(calculoIMC < 16){
            System.out.println("Magreza grave");
        } else if(calculoIMC < 17){
            System.out.println("Magreza moderada");
        } else if(calculoIMC < 18.6){
            System.out.println("Magreza leve");
        } else if(calculoIMC < 25){
            System.out.println("Peso ideal");
        } else if(calculoIMC < 30){
            System.out.println("Sobrepeso");
        } else{
            System.out.println("Obesidade grau I");
        }
    
    






    entrada.close();
    }
}
