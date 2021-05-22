import java.util.Scanner;

public class main {
    public static void main(String []args){
        int a,hasil,tampung,jumlah,c,b,d;
        int pilih,ulang;
        String[] arr= new String[5];
        Scanner input=new Scanner(System.in);
        toko menu_1 = new toko();            //interface
        belanja hitung = new belanja();     //abstract
        hasil=0;
        d=0;
        do{
            System.out.println("+=======================================================================================================================+");
            menu_1.MenuUtama();
            System.out.println("\t\t\tSilahkan Memasukan No Pilihan Menu :");
            pilih=input.nextInt();
            System.out.println("+========================================================================================================================+");
           if(pilih==1){
               do{
                   menu_1.kue();   //interface
                   System.out.println("\t\t\tSilahkan memilih No kue untuk dipesan :");
                   pilih=input.nextInt();
                       System.out.println("+=============================================================================================================+");
                   if(pilih>4){
                       System.out.println("coba lagi");
                   }else {
                       System.out.println("\t\t\tanda ingin memesan berapa kue :");
                       a = input.nextInt();
                       System.out.println("+=============================================================================================================+");
                       if (pilih == 1) {
                           jumlah = 500 * a;
                           System.out.println("\t\t\t"+a + " " + "Kue Nastar Keju Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Kue Nastar\n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else if (pilih == 2) {
                           jumlah = 500 * a;
                           System.out.println("\t\t\t"+a + " " + "Kue Klepon Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Kue Klepon\n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else if (pilih == 3) {
                           jumlah = 1000 * a;
                           System.out.println("\t\t\t"+a + " " + "Kue Serabi  Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Kue Serabi\n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else if (pilih == 4) {
                           jumlah = 1000 * a;
                           System.out.println("\t\t\t"+a + " " + "Kue Pukis  Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Kue Pukis \n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else {
                           System.out.println("\t\t\tInputan Menu Salah");
                       }
                   }d=d+1;
                   System.out.println("+====================================================================================================================+");
                   System.out.println("\t\t\tJika Ingin Memesan Kue Lagi Tekan 1:");
                   ulang=input.nextInt();
               }while(ulang==1);
           }else if(pilih==2){
               do{
                   menu_1.minuman(); //interface
                   System.out.println("\t\t\tSilahkan memilih Minuman untuk dipesan :");
                   pilih=input.nextInt();
                   if(pilih>4){
                       System.out.println("coba lagi");
                   }else {
                       System.out.println("\t\t\tanda ingin memesan berapa Minuman :");
                       a = input.nextInt();
                       if (pilih == 1) {
                           jumlah = 5000 * a;
                           System.out.println("\t\t\t"+a + " " + "Coca cola Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Coca Cola   \n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else if (pilih == 2) {
                           jumlah = 5000 * a;
                           System.out.println("\t\t\t"+a + "Teh Kotak Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Teh Kotak   \n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else if (pilih == 3) {
                           jumlah = 4000 * a;
                           System.out.println("\t\t\t"+a + " " + "Es Teh Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Es Teh      \n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else if (pilih == 4) {
                           jumlah = 3000 * a;
                           System.out.println("\t\t\t"+a + " " + "Kopi  Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d]="\t\t\tNama Pesanan:              :Kopi        \n\t\t\tjumlah      :              :"+a+"\n\t\t\tTotal Harga :              :Rp."+jumlah+"\n\t\t\t+===========================================================+";
                       } else {
                           System.out.println("\t\t\tInputan Menu Salah");
                       }
                   }d=d+1;
                   System.out.println("\t\t\t+==========================================================================================+");
                   System.out.println("\t\t\tJika Ingin Memesan Minuman Lagi Tekan 1:");
                   ulang=input.nextInt();
               }while(ulang==1);
            }else if(pilih==3) {
               do {
                   menu_1.makanan(); //interface
                   System.out.println("\t\t\tSilahkan memilih Makanan untuk dipesan :");
                   pilih = input.nextInt();
                   if (pilih > 4) {
                       System.out.println("coba lagi");
                   } else {
                       System.out.println("\t\t\tanda ingin memesan berapa Bungkus Makanan :");
                       a = input.nextInt();
                       if (pilih == 1) {
                           jumlah = 5000 * a;
                           System.out.println("\t\t\t" + a + " " + "Nasi Goreng Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d] = "\t\t\tNama Pesanan:              :Nasi Goreng \n\t\t\tjumlah      :              :" + a + "\n\t\t\tTotal Harga :              :Rp." + jumlah + "\n\t\t\t+===========================================================+";
                       } else if (pilih == 2) {
                           jumlah = 5000 * a;
                           System.out.println("\t\t\t" + a + "Mie Goreng Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d] = "\t\t\tNama Pesanan:              :Mie Goreng  \n\t\t\tjumlah      :              :" + a + "\n\t\t\tTotal Harga :              :Rp." + jumlah + "\n\t\t\t+===========================================================+";
                       } else if (pilih == 3) {
                           jumlah = 4000 * a;
                           System.out.println("\t\t\t" + a + " " + "Soto Ayam Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d] = "\t\t\tNama Pesanan:              :Soto Ayam   \n\t\t\tjumlah      :              :" + a + "\n\t\t\tTotal Harga :              :Rp." + jumlah + "\n\t\t\t+===========================================================+";
                       } else if (pilih == 4) {
                           jumlah = 3000 * a;
                           System.out.println("\t\t\t" + a + " " + "Nasi Rawon  Berhasil Dipesan dengan Total Harga " + jumlah);
                           hasil = hasil + jumlah;
                           arr[d] = "\t\t\tNama Pesanan:              :Nasi Rawon  \n\t\t\tjumlah      :              :" + a + "\n\t\t\tTotal Harga :              :Rp." + jumlah + "\n\t\t\t+===========================================================+";
                       } else {
                           System.out.println("\t\t\tInputan Menu Salah");
                       }
                   }
                   d = d + 1;
                   System.out.println("\t\t\t+==========================================================================================+");
                   System.out.println("\t\t\tJika Ingin Memesan Minuman Lagi Tekan 1:");
                   ulang = input.nextInt();
               } while (ulang == 1);
           }else{
               System.out.println("\t\t\t Menu Inputan Anda Salah! , Coba Lagi");
           }
            System.out.println("\t\t\t+=================================================================================================+");
            System.out.println("\t\t\tJika Ingin Memesan Ulang Tekan 4:");
            ulang=input.nextInt();
        }while(ulang==4 || pilih==4);
        System.out.println("\t\t\t+===========================================================+");
        System.out.println("\t\t\t\t\t                 THE THREES WARTEG                       ");
        System.out.println("\t\t\t+===========================================================+");
        for (b=0; b<=d; b++){
            if(arr[b]!=null){
                System.out.println(arr[b]);
            }
        }
        System.out.println("\t\t\t|Total Belanja      :\t         "+ hasil+"                   ");
        System.out.println("\t\t\t+===========================================================+");
        if(hasil > 30000 && hasil <=50000) {
            System.out.println("\t\t\tAnda Mendapat Diskon 3000 Karena Total Belanja Anda Lebih Dari 30000");
            System.out.println("\t\t\t+===========================================================+");
            jumlah = hitung.total_1(hasil);
            System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
        }else if(hasil >50000 && hasil <=100000){
            System.out.println("\t\t\tAnda Mendapat Diskon 3000 Karena Total Belanja Anda Lebih Dari 50000");
            System.out.println("\t\t\t+===========================================================+");
            jumlah = hitung.total_2(hasil);
            System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
        }else if(hasil >100000){
            System.out.println("\t\t\tAnda Mendapat Diskon 3000 Karena Total Belanja Anda Lebih Dari 100000");
            System.out.println("\t\t\t+===========================================================+");
            jumlah = hitung.total_3(hasil);
            System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
        }else{
            jumlah=hitung.total_4(hasil);
            System.out.println("\t\t\t+===========================================================+");
            System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
            System.out.println("\t\t\t+===========================================================+");
        }
do{
    System.out.println("\t\t\tMasukan Besar Uang yang dibayar :");
        a=input.nextInt();

        if (a < jumlah) {
            System.out.println("\t\t\tMohon maaf Uang Anda Tidak Cukup");
            System.out.println("\t\t\tSilahkan Bayar Ulang :");
            c = 1;
        } else {
            c=0;
            hitung.total(a, jumlah);
            System.out.println("\t\t\t+============================================+");
            System.out.println("\t\t\tKembalian Anda :" + hitung.total(a, jumlah));
            System.out.println("\t\t\t+============================================+");
            System.out.println("\t\t\tTerimakasi Telah Berbelanja");
            System.out.println("\t\t\t+===========================================================+");
            }
        }while(c==1);
    }
}

class belanja extends Abstrakk{
    public int a,s;
    @Override
    public int total(int a, int b){
        int hasil;
        hasil=a-b;
        return hasil;
    }
    public int total_1(int a){
        int hasil;
        hasil=0;
        hasil=a-3000;
     return hasil;
    }
    public int total_2(int a){
        int hasil;
        hasil=0;
        hasil=a-5000;
        return hasil;
    }public int total_3(int a){
        int hasil;
        hasil=0;
        hasil=a-10000;
        return hasil;
    }
    public int total_4(int a){
        int hasil;
        hasil=0;
        hasil=a-0;
        return hasil;
    }
}
