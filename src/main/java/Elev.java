import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Elev implements  Comparable<Elev>{
    private String nume;
    private Gender gen;
    private Set<String> activitati=new TreeSet<String>();
    public Elev(String nume, Gender gen) {
        this.nume=nume;
        this.gen=gen;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public Gender getGen() {
        return gen;
    }
    public void setGen(Gender gen) {
        this.gen = gen;
    }
    public void adaugaActivitate(String numeActivitate) {
        activitati.add(numeActivitate);
    }

    public void eliminaActivitate(String numeActivitate) {
        activitati.remove(numeActivitate);
    }
    public boolean areAtcivitate(){
        return !activitati.isEmpty();
    }
    @Override
    public int compareTo(Elev o) {
        return this.getNume().compareTo(o.getNume());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elev elev = (Elev) o;
        return Objects.equals(getNume(), elev.getNume());
    }
    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }
}
