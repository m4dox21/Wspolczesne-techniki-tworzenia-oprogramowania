public class Obraz implements Przedmiot
{
    private int rok;    

    Obraz(int rok){
        this.rok = rok;
    }

    @Override
    public int wartosc(){
        return okreslWartosc();
    }

    public int okreslWartosc(){
        int wartosc = (2100 - rok) * 10;
        return wartosc;
    }
}