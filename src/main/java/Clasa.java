import java.util.ArrayList;
import java.util.List;

public class Clasa {
    private int capacitate;
    private NumarClasa NrClasa;
    private char litera;
    private List<Elev> elevi= new ArrayList<Elev>();

    public Clasa(int capacitate, NumarClasa numar, char litera) {
        this.capacitate = capacitate;
        this.NrClasa = numar;
        this.litera = litera;

    }
    public void adaugaElev(Elev e){
       elevi.add(e);
    }

    public void eliminaElev(Elev e){
        elevi.remove(e);
    }

    public int getTotalElevi(){
        return elevi.size();
    }

    public List<Elev> getElevi() {
            return elevi;
    }
    public int getCapacitate(){
        return capacitate;
    }
    public char getLitera(){
        return litera;
    }
    public NumarClasa getNumar(){
        return NrClasa;
    }
}
