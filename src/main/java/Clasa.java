import java.util.ArrayList;
import java.util.List;

public class Clasa {
    int capacitate;
    int NumarClasa;
    char litera;
    List<Elev> elevi= new ArrayList<Elev>();
    public void adaugaElev(Elev e){
       elevi.add(e);
    }
    public void eliminaElev(Elev e){
        elevi.remove(e);
    }
    public int getTotalElevi(){
        return elevi.size();
    }


}
