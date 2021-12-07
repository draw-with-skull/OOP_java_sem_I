import java.util.Scanner;

public class Olimpiada {
    Atlet[] atlet;
    int nr_atleti,meniu=-1,ultimul_participant=0;
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
        while(meniu!=0){
        afisare_meniu();
        System.out.print("\nOptiune:");
        meniu = input.nextInt();
        optiune();
        }
    }
    //private
    private void afisare_meniu(){
        System.out.print("\n0)Oprire");
        System.out.print("\n1)Adauga participant");
        System.out.print("\n2)Modifica probe");
        System.out.print("\n3)Modificare scor");
        System.out.print("\n4)Afisare nume atleti");
        System.out.print("\n5)Afisare scor");
        System.out.print("\n6)Afisare scor final");
        System.out.print("\n7)Afiseaza tot");
    }
    
    private void optiune(){
        switch(meniu){
            case 0:{/*acest caz este gol deoarece in cazul in care se introduce 0 sa nu tipe prog */}break;
            case 1:{optiunea_1();}break;
            case 2:{optiunea_2();}break;
            case 3:{optiunea_3();}break;
            case 4:{optiunea_4();}break;
            case 5:{optiunea_5();}break;
            case 6:{optiunea_6();}break;
            case 7:{optiunea_7();}break;
            default:{System.out.print("Aceasta optiune nu exista");}break;
        }
    }

    private void optiunea_1(){
        String nume, prenume;
        System.out.println("Nume:");
        nume=input.next();
        System.out.println("Preume:");
        prenume=input.next();

        atlet[ultimul_participant] = new Atlet(nume,prenume,citire_probe());
        ultimul_participant++;
    }
    
    private void optiunea_2(){
        int nr_participant;
        do{
            System.out.println("\nNumarul participantului:");
            nr_participant=input.nextInt();
        }while(nr_participant>nr_atleti);

        atlet[nr_participant-1].modificare_probe(citire_probe());
    }
    
    private void optiunea_3(){
        int nr_participant;
        do{
            System.out.println("\nNumarul participantului:");
            nr_participant=input.nextInt();
        }while(nr_participant>nr_atleti);
        atlet[nr_participant-1].modificare_scor(citire_scor());
    }
    
    
    private void optiunea_4(){
        for(int i=0;i<ultimul_participant;i++)
            atlet[i].afisare_nume();
    }
    
    private void optiunea_5(){
        for(int i=0;i<ultimul_participant;i++){
            atlet[i].afisare_scor();
        }
    }
    
    private void optiunea_6(){
        int nr_participant;
        System.out.println("\n Numarul participantului:");
        nr_participant=input.nextInt();

        while(nr_participant>nr_atleti){
            System.out.println("\n Numarul participantului:");
            nr_participant=input.nextInt();
        }
        atlet[nr_participant-1].afisare_scor_final();
    }
    
    private void optiunea_7(){
        for(int i=0;i<ultimul_participant;i++)
            atlet[i].afisare_informatii();
    }

    private String[] citire_probe(){
        int nr_probe;
        String[] proba;
        System.out.println("Numarul de probe:");
        nr_probe=input.nextInt();
        proba = new String[nr_probe];
        for(int i=0;i<nr_probe;i++){
            proba[i]=input.next();
        }
        return proba;
    }
    private int[] citire_scor(){
        int nr_probe;
        int[] scor;
        System.out.println("Numarul de probe:");
        nr_probe=input.nextInt();
        scor = new int[nr_probe];
        for(int i=0;i<nr_probe;i++){
            scor[i]=input.nextInt();
        }
        return scor;
    }
}


/*
Olimpiada
-adauga participant
-modificare probe
-modificare scor
-afisare diverse(dupa gust)


*/
