package Polymorphism;

public class Main {

    static public class KISI
    {
        public void BenKimim()
        {
            System.out.println("Ben herhangi bir kisiyim.");
        }
    }

    static public class PERSONEL extends KISI
    {
        @Override
        public void BenKimim()
        {
            System.out.println("Ben bir personelim.");
        }
    }

    static public class MUHENDIS  extends PERSONEL
    {
        @Override
        public void BenKimim()
        {
            System.out.println("Ben bir mühendisim.");
        }
    }

    static public class TEKNISYEN  extends PERSONEL
    {
        @Override
        public void BenKimim()
        {
            System.out.println("Ben bir teknisyenim.");
        }
    }

    static public void KimimOnuYaz(KISI Birisi)
    {
        Birisi.BenKimim();
    }

    public static void main(String[] args)
    {
        KISI Insan1=new KISI();
        PERSONEL Insan2=new PERSONEL();
        MUHENDIS Insan3=new MUHENDIS();
        TEKNISYEN Insan4=new TEKNISYEN();
        KimimOnuYaz(Insan1);
        KimimOnuYaz(Insan2);
        KimimOnuYaz(Insan3);
        KimimOnuYaz(Insan4);
    }

}
