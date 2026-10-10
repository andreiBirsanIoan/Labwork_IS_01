//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Creăm școala
        Scoala scoala = new Scoala();
        //creez 2 clase c1 si c2
        Clasa c1=new Clasa(25,NumarClasa.II,'A');
        Clasa c2=new Clasa(30,NumarClasa.I,'B');
        //adaug clasele in scoala
        scoala.adaugaClasa("2A",c1);
        scoala.adaugaClasa("1B",c2);
        //creez 4 elevi
        Elev e1 = new Elev("Popescu Ion", Gender.Masculin);
        Elev e2 = new Elev("Ionescu Maria", Gender.Feminin);
        Elev e3 = new Elev("Vasilescu Andrei", Gender.Masculin);
        Elev e4 = new Elev("Popa Elena", Gender.Feminin);
        Elev e5 = new Elev("Pop Stefan", Gender.Masculin);
        //adaug elevii in clase
        scoala.adaugaEleviInClasa("2A",e1);
        scoala.adaugaEleviInClasa("2A",e2);
        scoala.adaugaEleviInClasa("1B",e3);
        scoala.adaugaEleviInClasa("1B",e5);
        scoala.adaugaEleviInClasa("1B",e4);
        //creez profesori pentru activitati
        Profesor prof1=new Profesor("Mihai");
        Profesor prof2=new Profesor("Dumitru");
        //creez activitati si le atribui profesorilor
        Activitate fotbal = new Activitate("Fotbal", prof1);
        Activitate pictura = new Activitate("Pictura", prof2);
        Activitate programare = new Activitate("Programare", prof1);
        //adaug activitatile create
        scoala.adaugaActivitate("Fotbal", fotbal);
        scoala.adaugaActivitate("Pictura", pictura);
        scoala.adaugaActivitate("Programare", programare);
        //adaug elevii in activitati
        fotbal.adaugaElev(e1);
        fotbal.adaugaElev(e2);
        pictura.adaugaElev(e3);
        programare.adaugaElev(e4);
        programare.adaugaElev(e1);
        //afisez topul activitatilor in functie de cati elevi sunt inscrisi
        scoala.AfiseazaTopActivitati();
        //afisez nr de elevi cu activitati
        scoala.afisareEleviCuActivitati();
    }
}
