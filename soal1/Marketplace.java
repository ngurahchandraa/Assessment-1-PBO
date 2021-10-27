package soal1;
public class Marketplace {
    private int Nomortransaksi;
    private String Namapengirim;
    private String Alamatpengirim;
    private String Namapenerima;
    private String Alamatpenerima;
    private double Ongkoskirim;
    private String Namaekspedisi;
    private String Nomorresi;
    private boolean Statusasuransi;
    private boolean Statusdropshipper;
    private double Nominalasuransi;

    Marketplace(int nomortransaksi, String namapengirim, String alamatpengirim, String namapenerima, String alamatpenerima, double ongkoskirim, String namaekspedisi, String nomorresi, boolean statusasuransi, boolean statusdropshipper, double nominalasuransi) {
        this.Nomortransaksi = nomortransaksi;
        this.Namapengirim = namapengirim;
        this.Alamatpengirim = alamatpengirim;
        this.Namapenerima = namapenerima;
        this.Alamatpenerima = alamatpenerima;
        this.Ongkoskirim = ongkoskirim;
        this.Namaekspedisi = namaekspedisi;
        this.Nomorresi = nomorresi;
        this.Statusasuransi = statusasuransi;
        this.Statusdropshipper = statusdropshipper;
        this.Nominalasuransi = nominalasuransi;
        print(this.Statusasuransi, this.Statusdropshipper);
    }

    //Asuransi
    Marketplace(int Nomortransaksi, String Nomorresi, String Namaekspedisi, double Ongkoskirim, String Namapengirim, String Alamatpengirim, String Namapenerima, String Alamatpenerima, boolean Statusasuransi, int Nominalasuransi){
        this.Nomortransaksi = Nomortransaksi;
        this.Nomorresi = Nomorresi;
        this.Namaekspedisi = Namaekspedisi;
        if(Ongkoskirim>20000){
            Ongkoskirim = Ongkoskirim - 5000;
        }
        this.Ongkoskirim = Ongkoskirim;
        this.Namapengirim = Namapengirim;
        this.Alamatpengirim = Alamatpengirim;
        this.Namapenerima = Namapenerima;
        this.Alamatpenerima = Alamatpenerima;
        this.Statusasuransi = Statusasuransi;
        this.Nominalasuransi = Nominalasuransi;
        print(this.Statusasuransi, this.Statusdropshipper);
    }

    //Normal

    Marketplace(int Nomortransaksi, String Nomorresi, String Namaekspedisi, double Ongkoskirim, String Namapengirim, String Alamatpengirim, String Namapenerima, String Alamatpenerima){
        this.Nomortransaksi = Nomortransaksi;
        this.Nomorresi = Nomorresi;
        this.Namaekspedisi = Namaekspedisi;
        this.Ongkoskirim = Ongkoskirim;
        this.Namapengirim = Namapengirim;
        this.Alamatpengirim = Alamatpengirim;
        this.Namapenerima = Namapenerima;
        this.Alamatpenerima = Alamatpenerima;
        print(this.Statusasuransi, this.Statusdropshipper);
    }

    //Dropship

    Marketplace(int Nomortransaksi, String Nomorresi, String Namaekspedisi, double Ongkoskirim, String Namapengirim, String Alamatpengirim, String Namapenerima, String Alamatpenerima, boolean Statusdropshipper){
        this.Nomortransaksi = Nomortransaksi;
        this.Nomorresi = Nomorresi;
        this.Namaekspedisi = Namaekspedisi;
        this.Ongkoskirim = Ongkoskirim;
        this.Namapengirim = Namapengirim;
        this.Alamatpengirim = Alamatpengirim;
        this.Namapenerima = Namapenerima;
        this.Alamatpenerima = Alamatpenerima;
        this.Statusdropshipper = Statusdropshipper;


        print(this.Statusasuransi, this.Statusdropshipper);
    }


    public void print(boolean Statusasuransi, boolean Statusdropshipper){
        if (Statusasuransi==true && Statusdropshipper==true){
            System.out.println("\nAsuransi dan Dropship");
            System.out.println("\nNo Transaksi :"+this.Nomortransaksi+"\nNo Resi : "+this.Nomorresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkoskirim+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima+"\nNominal Asuransi : "+this.Nominalasuransi);
        }else if (Statusasuransi==true){
            System.out.println("\nAsuransi");
            System.out.println("\nNo Transaksi : "+this.Nomortransaksi+"\nNo Resi : "+this.Nomorresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkoskirim+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima+"\nNominal Asuransi : "+this.Nominalasuransi);
        }else if (Statusdropshipper==true){
            System.out.println("\nDropship");
            System.out.println("\nNo Transaksi : "+this.Nomortransaksi+"\nNo Resi : "+this.Nomorresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkoskirim+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima);
        }else {
            System.out.println("\nNormal");
            System.out.println("\nNo Transaksi : "+this.Nomortransaksi+"\nNo Resi : "+this.Nomorresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkoskirim+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima);
        }
    }
}
