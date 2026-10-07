import java.util.HashMap;
import java.util.Map;

public class Scoala {
    Map<String,Clasa> Evidenta=new HashMap<String,Clasa>();
    public void adaugaClasa(String nrClasa,Clasa clasa){
        Evidenta.put(nrClasa,clasa);
    }
    public void eliminaClasa(String nrClasa){
        Evidenta.remove(nrClasa);
    }
    public void adaugaEleviInClasa(String clasa,Elev elev){
        Clasa clasa1 =Evidenta.get(clasa);
        clasa1.adaugaElev(elev);
        Evidenta.put(clasa,clasa1);
    }
    public void eliminaElevDupaNume(String nume){
        Evidenta.remove(nume);
    }
    public int getNumarClase(){
        return Evidenta.size();
    }
    public int getTotalElevi(){
        return Evidenta.size();
    }
}
