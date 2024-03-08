public class Ksiazka implements Przedmiot
{
    private int rok;
    private int wydanie;
    
    Ksiazka(int rok, int wydanie)
    {
        this.rok = rok;
        this.wydanie = wydanie;
    }

    @Override
    public int wartosc(){
        return okreslWartosc();
    }

    public int okreslWartosc(){
        int wartosc = (2050 - rok) / wydanie;
        return wartosc;
    }
}