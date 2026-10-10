import java.util.*;

public class Scoala {
    private Map<String,Clasa> Evidenta=new HashMap<String,Clasa>();
    private Map<String,Activitate> activitati=new HashMap<>();
    public void adaugaClasa(String nrClasa,Clasa clasa){
        Evidenta.put(nrClasa,clasa);
    }
    public void eliminaClasa(String nrClasa){
        Evidenta.remove(nrClasa);
    }
    public void adaugaEleviInClasa(String clasa,Elev elev){
        Clasa clasa1 =Evidenta.get(clasa);
        if(clasa1!=null){
            clasa1.adaugaElev(elev);
        }
    }
    public void eliminaElevDupaNume(String nume){
        for(Clasa clasa : Evidenta.values()){
            clasa.getElevi().removeIf(elev->elev.getNume().equals(nume));
        }
    }
    public void adaugaActivitate(String numeActivitate,Activitate activitate){
        activitati.put(numeActivitate,activitate);
    }
    public void eliminaActivitate(String numeActivitate){

            activitati.remove(numeActivitate);

    }
    public void inscrieElevLaActivitate(String numeActivitate, Elev elev) {
        Activitate activitate = activitati.get(numeActivitate);
        if (activitate != null) {
            activitate.adaugaElev(elev);
        }
    }
    public void eliminaElevDinActivitate(String numeActivitate, Elev elev) {
        Activitate activitate = activitati.get(numeActivitate);
        if (activitate != null) {
            activitate.eliminaElev(elev);
        }
    }
    public int getNumarClase(){
        return Evidenta.size();
    }
    public int getTotalElevi(){
        int totalElevi=0;
        for(Clasa c:Evidenta.values()){
            totalElevi+=c.getTotalElevi();
        }
        return totalElevi;
    }
    public void AfiseazaTopActivitati(){
        System.out.println("Top Activitati: ");
        activitati.values().stream()
                .sorted((a1,a2)->Integer.compare(a2.getParticipanti(),a1.getParticipanti()))
                .forEach(a->System.out.println(a.getNumeActivitate() + ": " + a.getParticipanti() + " elevi"));


    }
    public void afisareEleviCuActivitati(){

        int rezultat=0;
        for(Clasa c:Evidenta.values()){
            for(Elev e:c.getElevi()){
                if(e.areAtcivitate()){
                    rezultat++;
                }
            }
        }
        System.out.println("Numarul de elevi cu activitati: "+rezultat);
    }

}
