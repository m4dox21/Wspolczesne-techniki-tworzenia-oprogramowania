public class Main
{
    public static void main(String[] args){
        Przedmiot ksiazka = new Ksiazka(2000, 2);
        Przedmiot rzezba = new Rzezba(1500, 1);
        Podatek liniowy = new PodatekLiniowy();
        Podatek progresywny = new PodatekProgresywny();
        Magazyn magazyn = new Magazyn();
    
        magazyn.dodajDoSpisu(ksiazka);
        magazyn.dodajDoSpisu(rzezba);
        System.out.println("Wartosc: "+ magazyn.wartosc());
        magazyn.setPodatek(liniowy);
        System.out.println("Wartosc liniowy: "+ magazyn.poPodatku());
        magazyn.setPodatek(progresywny);
        System.out.println("Wartosc progresywny: "+ magazyn.poPodatku());
        
    }
}