public class ArrayTest {
    public static void main (String[] args)
    {
        System.out.println("Zadanie 3");
        ArrayComparator ac = new ArrayComparator();

        int[][] tab1=new int[2][2];
        int[][] tab2=new int [2][2];

//        tab1[0][0] = 2;
//        tab2[0][0] = 2;
        tab1[0][1] = 1;
//        tab2[0][1] = 1;
//        tab1[1][1] = 1;
//        tab2[1][1] = 1;

        System.out.println(ac.compare(tab1, tab2));


    }
}
