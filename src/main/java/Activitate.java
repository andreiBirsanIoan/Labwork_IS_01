import java.util.*;

public class Activitate implements Comparable<Activitate>{
    private Profesor profesor;
    private Set<Elev> participanti=new HashSet<Elev>();
    private String numeActivitate;
    public Activitate(String numeActivitate, Profesor profesor) {
        this.numeActivitate = numeActivitate;
        this.profesor = profesor;
    }
    public String getNumeActivitate() {
        return numeActivitate;
    }
    public void adaugaElev(Elev elev){
        if (participanti.add(elev)) {
            elev.adaugaActivitate(this.numeActivitate);
        }
    }
    public void eliminaElev(Elev elev){
        if (participanti.remove(elev)) {
            elev.eliminaActivitate(this.numeActivitate);
        }
    }
    public int getParticipanti(){
        return participanti.size();
    }
    public void setNumeActivitate(String numeActivitate) {
        this.numeActivitate = numeActivitate;
    }
    @Override
    public int compareTo(Activitate a){
        int comparareDupaNumar=Integer.compare(this.getParticipanti(),a.getParticipanti());
        if(comparareDupaNumar==0){
            return this.numeActivitate.compareTo(a.numeActivitate);
        }
        return  comparareDupaNumar;
    }
}
