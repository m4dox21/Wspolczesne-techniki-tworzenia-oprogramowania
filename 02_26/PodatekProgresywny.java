public class PodatekProgresywny implements Podatek
{
    private int prog = 10000;

    @Override
    public int oblicz(int wartosc)
    {
        if(wartosc <= prog)
        {
            return (int) (wartosc * 0.18);
        }
        else
        {
            return (int) (wartosc * 0.32);
        }
    }
}