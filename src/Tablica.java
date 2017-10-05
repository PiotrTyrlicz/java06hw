import java.util.Random;

import static java.lang.StrictMath.abs;

public class Tablica {

    private int []tab= new int[10];

    public void wpisz(){
        Random random = new Random();
        for(int i=0; i<10; i++){
            tab[i]=random.nextInt(10);
        }
    }

    public void wypisz(){

        int j=0;
        int k=0;

        for(int i=0; i<10 && j>=0 && k<2; i++){
            System.out.println(tab[abs (j-i)] );

            if(i==9)
            {
                System.out.println("");
               i=i-10;
               j=9;
               k=k+1;
            }
        }
    }




}
