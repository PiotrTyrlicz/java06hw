import java.util.Random;

public class Tablica {

    private int []tab= new int[10];

    public void wpisz(){
        Random random = new Random();
        for(int i=0; i<10; i++){
            tab[i]=random.nextInt(10);
        }
    }

    public void wypisz(){
        for(int i=0; i<10; i++){
            System.out.println(tab[i]);
        }
    }

    public void wypiszOdwrotnie(){
        for(int i=9; i>=0; i--){
            System.out.println(tab[i]);
        }
    }


}
