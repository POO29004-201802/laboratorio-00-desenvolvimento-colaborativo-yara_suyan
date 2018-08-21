

public class Losango {
    public void ImprimeLosango(int altura) {
        if (altura % 2 == 0) {
            System.out.println("Número inválido, Entre com um número ímpar");
            return;
        }
        System.out.println("Losango com altura " + altura);

        imprimeParteSuperior(altura);

        imprimeParteInferior(altura);

    }

    public void imprimeParteInferior(int altura) {

        int espacoLateralEsquerdo = 1;
        int espacoLateralDireito = altura - 2;

        for (int linha = 0; linha < altura / 2; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                if (coluna == espacoLateralEsquerdo) {
                    System.out.print("*");
                } else {
                    if (altura / 2 < coluna) {
                        if (espacoLateralDireito == coluna) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    } else {
                        System.out.print(" ");
                    }

                }

            }
            espacoLateralEsquerdo++;
            espacoLateralDireito--;
            System.out.println();

        }
    }


    public void imprimeParteSuperior(int altura) {
        int espacoLateralEsquerdo = altura / 2;
        int espacoLateralDireito = espacoLateralEsquerdo;

        for (int linha = 0; linha < altura / 2 + 1; linha++) {

            for (int coluna = 0; coluna < altura; coluna++) {

                if (espacoLateralEsquerdo > coluna) {
                    System.out.print(" ");
                } else {
                    if (espacoLateralEsquerdo == coluna) {
                        System.out.print("*");
                    } else {
                        if (espacoLateralDireito == coluna) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                }
            }
            espacoLateralEsquerdo--;
            espacoLateralDireito++;
            System.out.println();
        }
    }
}


