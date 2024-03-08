public class Rzezba implements Przedmiot
{
    private int rok;
    private int rozmiar;

    Rzezba(int rok, int rozmiar){
        this.rok = rok;
        this.rozmiar = rozmiar;
    }

    @Override
    public int wartosc(){
        return okreslWartosc();
    }

    public int okreslWartosc(){
        int wartosc = (int)((2020 - rok) * Math.pow(rozmiar, 3) * 2);
        return wartosc;
    }
}