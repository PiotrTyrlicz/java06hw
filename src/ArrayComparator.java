public class ArrayComparator {

    public boolean compare(int[][] tab1, int [][] tab2 ){
        boolean status=true;

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                if (tab1[i][j]!=tab2[i][j]){
                    status=false;
                    return status;
                }
                if (tab1[i][j]==tab2[i][j]){
                    System.out.println("ok");
                }

            }
        }
        return status;
    }


}