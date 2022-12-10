using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1._2
{
    public class Liczba
    {


        private int[] tab;
        private int mnożnik;

        public Liczba(string numer)
        {
            int[] tab2= new int[numer.Length];

            for (int i = 0; i < numer.Length; i++)
            {
                tab2[i] = (int)Char.GetNumericValue(numer[i]);
            }

            this.tab = tab2;
        }


        public void Mnożenie(int mnożnik)
        {
            string pojemnik = "";
            for (int i = 0; i < tab.Length; i++)
            {
                pojemnik += tab[i];
            }

            int pojemnik2 = Int32.Parse(pojemnik);

            int wynik = pojemnik2 * mnożnik;
            Console.WriteLine("Wynik mnożenia: " + wynik);
        }

        public void Silnia()
        {
            string tab3 = "";
            for (int i = 0; i < tab.Length; i++) tab3 += tab[i];

            int silnia = 1;
            int nSilni = (int)int.Parse(tab3);

            for (int i = 1; i <= nSilni; i++) silnia *= i;

            Console.WriteLine("Silnia z " + nSilni + " wynosi " + silnia);
        }
        

        public void WypiszLiczbe()
        {
            Console.Write("Liczba to: ");
            for (int i = 0; i < tab.Length; i++)
            {
                Console.Write(tab[i]);
            }

        }


    }
}
