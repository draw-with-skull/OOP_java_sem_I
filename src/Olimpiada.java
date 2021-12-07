import java.util.Scanner;

public class Olimpiada {
    Atlet[] atlet;
    int nr_atleti;
    Scanner input = new Scanner(System.in);
    //public
    public Olimpiada(int nr_maxim_atleti){
        this.nr_atleti=nr_maxim_atleti;
        init_data();
    }

    private void init_data(){
        atlet=new Atlet[nr_atleti];
    }

    public void run(){
        afisare_meniu();
    }
    //private
    private void afisare_meniu(){
        System.out.print("0)Oprire");
        System.out.print("1)Adauga participant");
        System.out.print("2)Modifica probe");
        System.out.print("3)Modificare scor");
        System.out.print("4)Afisare nume atleti");
        System.out.print("5)Afisare scor");
        System.out.print("6)Afisare scor final");
        System.out.print("7)Afiseaza tot");
    }
    

    
}
/*
Olimpiada
-adauga participant
-modificare probe
-modificare scor
-afisare diverse(dupa gust)


*/
