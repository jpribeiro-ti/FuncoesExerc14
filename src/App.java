
public class App {
    public static void main(String[] args) {

        int a, b;
        int matriz[][] = new int[3][3];

        matriz[0][0] = 2;
        matriz[0][1] = 9;
        matriz[0][2] = 4;
        matriz[1][0] = 7;
        matriz[1][1] = 5;
        matriz[1][2] = 3;
        matriz[2][0] = 6;
        matriz[2][1] = 1;
        matriz[2][2] = 8;

        boolean quadradomagico = true;
        int linha1 = 0;
        int coluna1 = 0;
        

        for (a = 0; a < 3; a++) {
            int linhatotal = 0;
            int colunatotal = 0;
            for (b = 0; b < 3; b++) {
                if (b == 0) {
                    linha1 += matriz[a][b];
                    coluna1 += matriz[b][a];
                }
                linhatotal += matriz[a][b];
                colunatotal += matriz[b][a];

            }
            if (linhatotal != linha1 || linhatotal != colunatotal || colunatotal != coluna1 || coluna1 != linha1) {
                quadradomagico = false;

            }
        }

        if (quadradomagico) {
            System.out.println("É um quadrado magico:");
        } else {
            System.out.println("Não é um quadrado magico.");

        }

    }
}
