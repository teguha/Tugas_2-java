public abstract class Abstrakk {
     public abstract int total(int  a, int b);
     public abstract int total_1(int  a);
     public abstract int total_2(int  a);
     public abstract int total_3(int  a);
     public abstract int total_4(int  a);
    //public abstract float belanja();
}

interface menu{
     public void MenuUtama();
     public void kue();
     public void minuman();
     public void makanan();
}

class toko implements menu{
     @Override
    public void MenuUtama(){
        System.out.println("\t\t\t+======================THE THREES WARTEG==================+");
        System.out.println("\t\t\t|1. Kue           || Tekan 1 Jika Ingin Memesan Kue       |");
        System.out.println("\t\t\t|2. Minuman       || Tekan 2 Jika Ingin Memesan Minuman   |");
        System.out.println("\t\t\t|3. Makanan       || Tekan 3 Jika Ingin Memesan Makanan   |");
        System.out.println("\t\t\t|4. Stop Memesan  || Tekan 4 Jika Ingin Stop Memesan      |");
        System.out.println("\t\t\t+==========================================================+");
    }
    @Override
    public void kue () {
        System.out.println("\t\t\t+=======================THE THREES WARTEG================+");
        System.out.println("\t\t\t|1. Kue Nastar Keju || Harga : Rp 500/Perbiji            |");
        System.out.println("\t\t\t|2. Kue Klepon      || Harga : Rp 500/Perbiji            |");
        System.out.println("\t\t\t|3. Kue Serabi      || Harga : Rp 1000/Perbiji           |");
        System.out.println("\t\t\t|4. Kue Pukis       || Harga : Rp 1000/Perbiji           |");
        System.out.println("\t\t\t+========================================================+");
    }

     @Override
    public void minuman(){
         System.out.println("\t\t\t+========================THE THREES WARTEG==============+");
        System.out.println("\t\t\t1. Coca cola       || Harga : Rp 5000/Perbotol           |");
        System.out.println("\t\t\t2. Teh Kotak       || Harga : Rp 5000/Perkotak           |");
        System.out.println("\t\t\t3. Es Teh          || Harga : Rp 4000/Pergelas           |");
        System.out.println("\t\t\t4. Kopi            || Harga : Rp 3000/Pergelas           |");
        System.out.println("\t\t\t+========================================================+");
    }
    @Override
    public void makanan(){
        System.out.println("\t\t\t+=======================THE THREES WARTEG================+");
        System.out.println("\t\t\t1. Nasi Goreng     || Harga : Rp 10000/Perbungkus        |");
        System.out.println("\t\t\t2. Mie Goreng      || Harga : Rp 6000/Perbungkus         |");
        System.out.println("\t\t\t3. Soto Ayam       || Harga : Rp 12000/Permangkok        |");
        System.out.println("\t\t\t4. Nasi Rawon      || Harga : Rp 10000/Perbungkus        |");
        System.out.println("\t\t\t+=========================================================+");
    }
}
