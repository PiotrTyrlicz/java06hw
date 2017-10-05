import java.util.Random;

public class MultiArray {

    private int[][] tab;

    public MultiArray(int n, int m) {
        tab = new int[n][m];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tab[i][j] = random.nextInt(10);
            }
        }
    }//kons

    public void randomize() {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(10);
            }
        }
    }

    public void print() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
                System.out.print(" ");
            }
        }
    }

    public int findMax() {
        int max=tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j]>max){
                   max=tab[i][j];
                }
            }
        }
    return max;
    }


    public int findMin() {
        int min=tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j]<min){
                    min=tab[i][j];
                }
            }
        }
        return min;
    }


}