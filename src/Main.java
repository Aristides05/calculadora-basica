import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        byte auxiliarRepeticao;
        boolean repeticao = true;

        do{
            menu.menu();
            System.out.println("Deseja realizar outra operação? ");
            System.out.println("1 - SIM ");
            System.out.println("2 = NÃO ");
            auxiliarRepeticao = input.nextByte();

            if(auxiliarRepeticao != 1)
                repeticao = false;

        }while(repeticao);
    }
}