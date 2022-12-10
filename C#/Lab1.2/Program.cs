using Lab1._2;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Wpisz numer zadania: ");
        int zad = int.Parse(Console.ReadLine());   
        

        switch (zad)
        { 
        case 1:
                //zadanie1
                Licz wartosc1 = new Licz(10);
                Console.WriteLine(wartosc1.Dodaj(2.0));
                Console.WriteLine(wartosc1.Odejmij(3.5));
                wartosc1.PokazWartosc();
                break;
        case 2:

                //zadanie2
                double[] tab = { 1.4, 2.6, 4.4, 6.0, 7.0, 4.0 };
                Sumator sumator = new Sumator(tab);
                Console.WriteLine("Suma elementów: " + sumator.Suma());
                Console.WriteLine("Suma elementów podzielnych przez 2: " + sumator.SumaPodziel2());
                Console.WriteLine("Tablica posiada " + sumator.IleElementow() + " elementów");

                Console.WriteLine("Wszystkie elementy tablicy: ");
                sumator.WypiszElementy();
                Console.WriteLine("Elemendy oparte o index: ");
                sumator.WypiszPrzezIndex(1, 3);
                break;
        case 3:

                //zadanie3
                int dzien = 10, miesiac = 12, rok = 2022;
                Data data = new Data(dzien, miesiac, rok);
                Console.Write("Po dodaniu tygodnia mamy: ");
                data.DodajTydzien();
                data.Odczyt();
                Console.WriteLine();

                Console.Write("Po odjęciu tygodnia mamy: ");
                data.OdejmijTydzien();
                data.OdejmijTydzien();
                data.Odczyt();
                Console.WriteLine();

                data.OdczytDzisiaj();
                break;

        case 4:
                //zadanie4
                String numer = "3";
            Liczba liczba = new Liczba(numer);

            liczba.WypiszLiczbe();
            Console.WriteLine();
            liczba.Mnożenie(4);
            Console.WriteLine();
            liczba.Silnia();
                break;
        default: 
            Console.WriteLine("Nie ma takiego zadania");
            break;
        }
}
}