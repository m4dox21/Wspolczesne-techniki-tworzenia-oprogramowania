public class PodatekLiniowy implements Podatek
{
    @Override
    public int oblicz(int wartosc)
    {
        return (int) (wartosc * 0.19);
    }
}