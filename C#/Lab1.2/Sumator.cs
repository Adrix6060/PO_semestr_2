using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1._2
{
    public class Sumator
    {

        private double[] liczby;

        public Sumator(double[] tab)
        {
            this.liczby = tab;
        }

        public double Suma()
        {
            double suma = 0;

            for (int i = 0; i < liczby.Length; i++)
            {
                suma += liczby[i];               
            }
            return suma;

        }

        public double SumaPodziel2()
        {
          double suma = 0;

            for (int i = 0; i < liczby.Length; i++)
            {
                if (liczby[i] % 2 == 0)
                {
                    suma += liczby[i];
                }
            }
            return suma;
        }

        public int IleElementow()
        {
            return liczby.Length;
        }

        public void WypiszElementy()
        {
            for (int i = 0; i < liczby.Length; i++)
            {
                Console.WriteLine(liczby[i]);
            }
        }

        public void WypiszPrzezIndex(int lowIndex, int highIndex)
        {
            

            for (int i = 0; i < liczby.Length; i++)
            {
                if (liczby[i]>=lowIndex && liczby[i]<=highIndex)
                {
                    Console.WriteLine(liczby[i]);
                }
                
            }


        }



    }
}
