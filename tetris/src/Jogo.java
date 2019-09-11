public class Jogo {
    private int rodadas;
    private Tetris tetris;

    public Jogo(int rodadas, Tetris tetris) {
        this.rodadas = rodadas;
        this.tetris = tetris;

        tetris.lancaBlocosAleatoriamente();


    }
}
