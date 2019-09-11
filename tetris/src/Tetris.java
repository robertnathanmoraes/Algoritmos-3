import exception.OverFlowException;

import java.util.Random;

public class Tetris {

    private boolean[][] mapaTetris;
    private int pontos;

    public Tetris(int linha, int coluna) {
        this.mapaTetris = new boolean[Math.max(linha,6)][Math.max(coluna, 6)];
    }

    public int lancaBlocosAleatoriamente(){
        Blocos blocos = new Blocos();
        Random random = new Random();
        return random.nextInt((4-1)+1)+1;
    }

    private int linhaLivre( int tamanhoDaUltimaLinhaBloco,int linha){
        int tamanhoLivre = 0;

        for (int i = 0; i < mapaTetris.length; i++) {
            if(!mapaTetris[linha][i]){
                tamanhoLivre++;
            }
        }

        if (tamanhoDaUltimaLinhaBloco<=tamanhoLivre) {
            return linha;
        }
            return -1;
        }

    public void colocaOBlocoNoMapaDeManeiraInteligente(boolean[][] bloco) throws OverFlowException {
        int primeiroEspacoLivre = -1;

        int tamanhoDaUltimaLinhaBloco = bloco.length;
        int alturaDaUltimaLinhaBloco = bloco[0].length;

        int tamanhoLivre = 0;

        int linhaLivre = -1;
        for (int i = 0; i < mapaTetris.length; i++) {
            linhaLivre = linhaLivre(tamanhoDaUltimaLinhaBloco, i);
            if (linhaLivre != -1)
                break;
        }

        if(linhaLivre > -1){
            for (int i = 0; i < mapaTetris.length; i++) {
                if(!mapaTetris[i][linhaLivre]){
                    tamanhoLivre++;
                    if(primeiroEspacoLivre == -1)
                        primeiroEspacoLivre = i;
                }
            }
        }else {
            throw new OverFlowException();
        }

        if (tamanhoDaUltimaLinhaBloco<=tamanhoLivre){
            for (int i = primeiroEspacoLivre; i < primeiroEspacoLivre+tamanhoDaUltimaLinhaBloco ; i++) {
                for (int j = primeiroEspacoLivre; j <primeiroEspacoLivre+alturaDaUltimaLinhaBloco ; j++) {
                    mapaTetris[i][j] = true;
                }
            }
        }

    }

    public void pontua(){
        boolean iraPontuar = true;
        for (int i = 0; i < mapaTetris.length; i++) {
            if (!mapaTetris[0][i]){
                   iraPontuar = false;
            }
        }
        if (iraPontuar){
            pontos++;
        }
    }

    public void printaOMapa(){
        for (int i = 0; i <mapaTetris.length ; i++) {
            for (int j = 0; j <mapaTetris.length; j++) {
                System.out.print(mapaTetris[i][j]+" ");
            }
            System.out.println();
        }
    }
}
