using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace Lab1._2
{
    public class Licz
    {
        public Licz(double parametrKonstruktora)
            {
                this.wartosc = parametrKonstruktora;
            }

        private double wartosc = 5.0;


        public double Dodaj(double parametr)
        {

            return this.wartosc + parametr;
        }

        public double Odejmij(double parametr)
        {

            return this.wartosc - parametr;
        }

        public void PokazWartosc()
        {
            Console.WriteLine("Liczba wynosi: " + this.wartosc);
        }



    }
}
