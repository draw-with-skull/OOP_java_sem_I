public class Atlet {
    //variablie interne
    String nume;
    String prenume;
    String[] proba;
    int[] scor;
    int nr_probe;
    float scor_final;


//********************************************************************** */

    Atlet(String nume,String prenume, String[] proba){
        //Stocare variabilelor din parametru
        this.nume=nume;
        this.prenume=prenume;
        this.proba=proba;
        init_data();
    }

    public void afisare_nume(){
        System.out.print("nume:"+this.nume);
        System.out.print("prenume:"+this.prenume);
    }
    
    public void afisare_scor(){
        for(int i=0;i<nr_probe;i++){
            System.out.print(proba[i]+":"+scor[i]);
        }
    }

    public void afisare_scor_final(){
        calculare_scor_final();
        System.out.print("scor final:"+this.scor_final);
    }

    public void afisare_informatii(){
        afisare_nume();
        afisare_scor();
        afisare_scor_final();
    }

    public void modificare_probe(String[] probe){
         this.proba = null;
         this.proba=probe;
         init_data();
    }
    
    public void modificare_scor(int[] scor){
        this.scor=null;
        this.scor=scor;
    }

//********************************************************************** */
    private void init_data(){
        nr_probe=proba.length;
        this.scor=new int[nr_probe];

    }

    private void calculare_scor_final(){
        this.scor_final=0;
        for(int i=0;i<nr_probe;i++){
            this.scor_final+= scor[i];
        }
    }
    
}
/**
 Atlet
-nume
-prenume
-lista probe
-scor
-scor final
 *
 modificare scor
 modificare probe
*/