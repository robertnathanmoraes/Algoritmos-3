public class Blocos {
    private static boolean[][] blocoQuadrado2x2 = new boolean[2][2];
    private static boolean[][] blocoQuadrado3x3 = new boolean[3][3];
    private static boolean[][] blocoRetangular4x2 = new boolean[4][2];
    private static boolean[][] blocoRetangular1x3 = new boolean[3][1];

    public Blocos() {
    }

    public boolean[][] getBloco(int bloco){
        switch (bloco){
            case 1:
                return blocoQuadrado2x2;
            case 2:
                return blocoQuadrado3x3;
            case 3:
                return blocoRetangular4x2;
            case 4:
                return blocoRetangular1x3;
            default:
                return null;
        }
    }
}
