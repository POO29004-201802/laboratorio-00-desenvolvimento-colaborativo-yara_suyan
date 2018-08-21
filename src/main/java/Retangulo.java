public class Retangulo {
    //retorna uma string formando uma linha
    //por exemplo n = 3, retornara +---+
    private String linhasHorizontal(int n) {
        String linhas = new String("+");
        for (int i = 0; i < n - 2; i++) linhas += "-";
        linhas += "+";
        return linhas;
    }

    //retorna uma string formando duas linhas verticais
    //por exemplo n = 3, retornara | |
    private String linhasVertical(int n) {
        String linhas = new String("|");
        for (int i = 0; i < n - 2; i++) linhas += " ";
        linhas += "|";
        return linhas;
    }

    //imprime na tela um retangulo quadrado vazado
    public void retanguloQuadradoVazado(int n) {
        System.out.println(this.linhasHorizontal(n));
        for (int i = 0; i < n - 2; i++) System.out.println(this.linhasVertical(n));
        System.out.println(this.linhasHorizontal(n));
    }
}
