import java.util.Scanner;

public class Menu {
    Operarions operacao = new Operarions();
    Scanner scan = new Scanner(System.in);

    public Menu(){}

    byte opcao;
    float a, b;

    public void menu() {
        descritivoMenu();
        System.out.printf("O resultado da operação é: %.2f\n\n", chooseOption(opcao, a, b));
    }

    public void descritivoMenu(){
        System.out.println("Escolha a operação que deseja realziar:");
        System.out.print(" 1 - Soma \n 2 - Subtração \n 3 - Divisão \n 4 - Multiplicação \n ->");
        opcao = scan.nextByte();
        System.out.print("Digite o primeiro número\n ->");
        a = scan.nextFloat();
        System.out.print("Digite o segundo número\n ->");
        b = scan.nextFloat();
    }

    public float chooseOption(byte opcao, float a, float b){
        if(opcao == 1)
            return operacao.sum(a,b);
        if(opcao == 2)
            return operacao.sub(a,b);
        if(opcao == 3)
            return operacao.div(a,b);
        if(opcao == 4)
            return operacao.mult(a,b);

        return 0;
    }
}
