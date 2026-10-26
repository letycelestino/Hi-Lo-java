import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();

        char resp;

        System.out.println("=================================");
        System.out.println("     BEM-VINDO(A) AO HI-LO!      ");
        System.out.println("=================================");
        System.out.println("Sorteei um número de 1 a 50.");
        System.out.println("Você tem 3 chances para acertar.");
        System.out.println("Dica: 'lo' = o número é maior, 'hi' = o número é menor.");
        System.out.println("Boa sorte!\n");
            do {
                int num = r.nextInt(50) + 1;
                int jog = 0, ptos = 100, tent = 1;
                String status = "Perdeu! ";

                System.out.println("\n");

                while (tent <= 3 && jog != num) {
                    System.out.printf("%dª Jogada - ", tent);
                    jog = ent.nextInt();
                    if (jog == num) {
                        status = "Ganhou! ";
                    } else {
                        ptos = ptos - 25;
                        if (jog < num) {
                            System.out.println("Lo! Escolha um número maior.\n");
                        } else {
                            System.out.println("Hi! Escolha um número menor.\n");
                        }
                    }
                    tent++;
                }
                    System.out.printf("%s | Pontuação: %d%n", status, ptos);
                    System.out.printf("RESPOSTA: %d%n%n", num);
                    System.out.print("Mais uma vez? [S ou N]-> ");
                    resp = ent.next().charAt(0);
            } while (resp == 'S' || resp == 's');
    }
}