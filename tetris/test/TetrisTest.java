import exception.OverFlowException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TetrisTest {

    @org.junit.Test
    public void deveLancarBlocosAleatoriamenteEntre1E4() {
        Tetris tetris = new Tetris(8, 8);
        int resultadoEsperado = 3;
        int contador = 100;

        while (resultadoEsperado > 0 && resultadoEsperado < 5 && contador!=0) {
            resultadoEsperado = tetris.lancaBlocosAleatoriamente();
            contador--;
        }

        assertEquals(contador, 0);
    }

    @Test
    public void deveLancarColocarUmBlocoAleatorio() throws OverFlowException {
        Tetris tetris = new Tetris(6,6);
        Blocos blocos = new Blocos();

        tetris.colocaOBlocoNoMapaDeManeiraInteligente(blocos.getBloco(tetris.lancaBlocosAleatoriamente()));
        tetris.printaOMapa();

    }

    @Test
    public void deveLancarColocarDoisBlocosAleatorios() throws OverFlowException {
        Tetris tetris = new Tetris(6,6);
        Blocos blocos = new Blocos();

        tetris.colocaOBlocoNoMapaDeManeiraInteligente(blocos.getBloco(3));
        tetris.colocaOBlocoNoMapaDeManeiraInteligente(blocos.getBloco(3));
        tetris.printaOMapa();

    }


}