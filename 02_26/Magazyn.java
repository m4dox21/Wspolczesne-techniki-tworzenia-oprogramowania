import java.util.ArrayList;
import java.util.List;


public class Magazyn
{
    private List<Przedmiot> list;
    private Podatek podatek;

    public void setPodatek(Podatek podatek)
    {
        this.podatek = podatek;
    }

    Magazyn()
    {
        list = new ArrayList<>();
    }

    public void dodajDoSpisu(Przedmiot przedmiot)
    {
        list.add(przedmiot);
    }

    public int wartosc()
    {
        int suma = 0;
        for (Przedmiot przedmiot : list)
        {
            suma += przedmiot.wartosc();
        }
        return suma;
    }

    public int poPodatku()
    {
        return wartosc() - podatek.oblicz(wartosc());
    }
}