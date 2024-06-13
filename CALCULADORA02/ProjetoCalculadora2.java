package projetocalculadora1;
import java.util.Scanner;
public class ProjetoCalculadora2 {
public static void main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);
    float numero1, numero2;
    char operador;

    System.out.println("Digite o primeiro número:");
    numero1 = scanner.nextFloat();

    System.out.println("Digite a operação ( + , - , * , / ):");
    operador = scanner.next().charAt(0);

    System.out.println("Digite o segundo número:");
    numero2 = scanner.nextFloat();

    scanner.close();

    double resultado = calcular(numero1, numero2, operador);
    System.out.println("O resultado é: " + resultado);
}

public static float calcular(float numero1, float numero2, char operador) {
    switch (operador) {
        case '+':
            return numero1 + numero2;
        case '-':
            return numero1 - numero2;
        case '*':
            return numero1 * numero2;
        case '/':
            if (numero2 != 0) {
                return numero1 / numero2;
            } else {
                System.out.println("Erro! Divisão por zero não é permitida.");
                System.exit(1);
            }
        default:
            System.out.println("Erro! Operação inválida.");
          
    }
    return 0;
	
	
	}

}
