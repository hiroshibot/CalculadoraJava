import java.util.Scanner;
public class CalculadoraJava {
    public static void main(String[] args) {
        menu();
    }

    public static void opcoes() {
        System.out.println("Olá! Selecione a operação matemática a ser feita:\n" +
                " 1 - Adição\n" +
                " 2 - Subtração\n" +
                " 3 - Multiplicação \n" +
                " 4 - Divisão\n");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        opcoes();
        int escolha = scanner.nextInt();


        while (escolha > 4 || escolha < 1) {
            System.out.println("Opcão Invlálida!\n Digite um número de 1-4:");
            opcoes();
            escolha = scanner.nextInt();
        }

        System.out.println("Escolha o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Escolha o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (escolha == 1) {
            double calculo = (numero1 + numero2);
            System.out.println("Esta soma desta adição é " + calculo);

        } else if (escolha == 2) {
            double calculo = (numero1 - numero2);
            System.out.println("Esta subtração tem como resultado: " + calculo);
        } else if (escolha == 3) {
            double calculo = (numero1 * numero2);
            System.out.println("Esta multiplicação  possui um resultado de: " + calculo);
        }

        else if (escolha == 4) {
            while (numero2 == 0) {
                System.out.println("Não é possível dividir por zero. Tente novamente:");
                System.out.println("Digite um novo valor sem ser 0 para o número 2:");
                numero2 = scanner.nextDouble();
            }
            double calculo = (numero1/numero2);
            System.out.println("Esta divisão tem como resultado: " + calculo);

        }
        scanner.close();
    }
}