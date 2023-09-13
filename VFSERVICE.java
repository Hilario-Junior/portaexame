import java.util.Scanner;

public class VFSERVICE {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int media1, media2, media3;
            String nomealuno;
            Scanner Scanner;
            System.out.print("Digite o nome do Aluno");
            String nomeAluno = in.nextLine();
            System.out.println("Digite a média do I Trimestre");
            media1 = in.nextInt();
            System.out.println("Digite a média do II Trimestre");
            media2 = in.nextInt();
            System.out.println("Digite a média do III Trimestre");
            media3 = in.nextInt();
            int mediaGlobal = (media1 + media2 + media3) / 3;
            if (mediaGlobal < 9) {
                System.out.println("Aluno Excluído");
            } else if (mediaGlobal >= 14) {
                System.out.println("Aluno Dispensado");
            } else {
                System.out.println(" Aluno Aprovado.");
            }
        }
    }
}
