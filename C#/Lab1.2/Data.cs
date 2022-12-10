using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1._2
{
    public class Data
    {
        private int dzien, miesiac, rok;
        private int staticDzien, staticMiesiac, staticRok;
        public Data(int dzien,int miesiac,int rok)
        {
            this.dzien = dzien;
            this.miesiac= miesiac;
            this.rok = rok;
            staticDzien = dzien;
            staticMiesiac = miesiac;
            staticRok = rok;
        }

        public void OdejmijTydzien()
        {
            if (this.dzien - 7 < 1)
            {
                this.dzien = (this.dzien - 7) + 30;
                this.miesiac--;
            }
            else this.dzien -= 7;
        }

        public void DodajTydzien()
        {
            if (this.dzien + 7 > 30)
            {
                this.dzien = this.dzien - 30;
                this.miesiac++;
            }
            else
            {
                this.dzien = this.dzien + 7;
            }
        }
        public void Odczyt()
        {
            Console.Write(this.dzien + "." + this.miesiac + "." + this.rok);
        }
        public void OdczytDzisiaj()
        {
            Console.Write("Dzisiaj jest: " + this.staticDzien + "." + this.staticMiesiac + "." + this.staticRok);
        }
    }
}
