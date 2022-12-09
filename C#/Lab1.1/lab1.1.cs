using System;
using System.Runtime.CompilerServices;

public class HelloWorld
{
    public static void Main(string[] args)
    {

        Console.Write("Wprowadz numer zadania: ");
        int zad = int.Parse(Console.ReadLine());
        switch (zad)
        {
            case (0):
                {
                    break;
                }
            case (1):
                {
                    zadanie1();
                    break;
                }
            case (2):
                {
                    zadanie2();
                    break;
                }
            case (3):
                {
                    zadanie3();
                    break;
                }
            case (4):
                {
                    zadanie4();
                    break;
                }
            case (5):
                {
                    zadanie5();
                    break;
                }
            case (6):
                {
                    zadanie6();
                    break;
                }
            case (7):
                {
                    zadanie7();
                    break;
                }
            case (8):
                {
                    zadanie8();
                    break;
                }
            case (10):
                {
                    zadanie10();
                    break;
                }
            default:
                {
                    Console.WriteLine("Bledne dane");
                    break;
                }

        }

        static void zadanie1()
        {
            Console.WriteLine("Zadanie1");
            Console.WriteLine("Nr albumu: 122957");
        }



        static void zadanie2()
        {
            Console.WriteLine("Zadanie2");

            Console.WriteLine("Podaj liczbe");
            int liczba = int.Parse(Console.ReadLine());

            if (liczba % 2 == 0) Console.WriteLine("Liczba jest Parzysta");
            else Console.WriteLine("Liczba jest nieparzysta");

        }


        static void zadanie3()
        {
            Console.WriteLine("\nZadanie3");

            Console.WriteLine("\nPodaj liczbe a");
            double liczbaA = double.Parse(Console.ReadLine());

            Console.WriteLine("Podaj liczbe b");
            double liczbaB = double.Parse(Console.ReadLine());

            if (liczbaA > liczbaB) Console.WriteLine("Wieksza liczbą jest liczba A");
            else Console.WriteLine("Wieksza liczba jest liczba B");
        }


        static void zadanie4()
        {
            Console.WriteLine("Podaj cztery liczby");

            double a = double.Parse(Console.ReadLine());
            double b = double.Parse(Console.ReadLine());
            double c = double.Parse(Console.ReadLine());
            double d = double.Parse(Console.ReadLine());
            double srednia = (a + b + c + d) / 4;
            Console.WriteLine("Srednia: " + srednia);
        }

        static void zadanie5()
        {
            Console.WriteLine("Liczba A:");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("Liczba B:");
            int b = int.Parse(Console.ReadLine());
            Console.WriteLine("Podaj znak:");
            char znak = char.Parse(Console.ReadLine());
            double wynik;

            switch (znak)
            {
                case '+':
                    wynik = a + b;
                    Console.WriteLine("Wynik: " + wynik);
                    break;
                case '-':
                    wynik = a - b;
                    Console.WriteLine("Wynik: " + wynik);
                    break;
                case '/':
                    wynik = a / b;
                    Console.WriteLine("Wynik: " + wynik);
                    break;
                case '*':
                    wynik = a * b;
                    Console.WriteLine("Wynik: " + wynik);
                    break;
                default:
                    Console.WriteLine("Bledne dane");
                    break;

            }
        }

        static void zadanie6()
        {
            Console.WriteLine("Podaj liczbe naturanla:");
            int liczba = int.Parse(Console.ReadLine());
            for (int i = 0; i <= liczba; i++)
            {
                Console.WriteLine("Liczba: " + i);
            }

        }



        static void zadanie7()

        {
            Console.Write("\nWprowadz liczbe: ");
            int liczba = int.Parse(Console.ReadLine());
            Boolean prime = true;

            for (int i = 2; i < liczba; i++)
            {
                if (liczba % i == 0) prime = false;
            }
            {
                if (prime)
                {
                    Console.WriteLine(liczba + " to liczba pierwsza.");
                }
                else
                {
                    Console.WriteLine(liczba + " to nie liczba pierwsza.");
                }
            }
        }


        static void zadanie8()
        {

            Console.WriteLine("Tysiąc liczb pierwszych: ");
            int counter = 0;

            Console.WriteLine("Petla For:");
            int i, j;
            for (i = 2; counter < 1000; i++)
            {
                Boolean prime = true;
                for (j = 2; j < i; j++)
                {
                    if (i % j == 0) prime = false;
                }
                if (prime)
                {
                    Console.Write(i + " ");
                    counter++;
                }
            }


            Console.WriteLine("\n\n\nPętla While:");

            i = 2;

            while (counter < 1000)
            {
                Boolean prime = true;
                for (j = 2; j < i; j++)
                {
                    if (i % j == 0) prime = false;
                }

                if (prime)
                {
                    Console.Write(i + " ");
                    counter++;
                }

                i++;
            }

        }


        static void zadanie10()
        {
            Console.WriteLine("Wprowadź wysokość:");
            int h = int.Parse(Console.ReadLine());

            for (int i = 1; i <= h; i++)
            {
                int liczba = (int)Math.Pow(2, i);
                Console.Write(liczba + ", ");
                for (int j = 1; j <= i - 1; j++)
                {
                    Console.Write((liczba + j) + ", ");
                }
                Console.WriteLine();

            }


        }



    }
}