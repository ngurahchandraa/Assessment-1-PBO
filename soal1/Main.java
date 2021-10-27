package soal1;
public class Main {
    public static void main(String[] args) {
        //Asuransi dan Dropship
        Marketplace barang1 = new Marketplace(1, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", 21000, "JNE", "N0001", true, true , 40000);
        //Asuransi
        Marketplace barang2 = new Marketplace(2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);
        //Normal
        Marketplace barang3 = new Marketplace(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang","DayeuhKolot");
        //Dropship
        Marketplace barang4 = new Marketplace(4, "N0002", "siCepat", 24000, "Dropship2", "Pontianak", "Joko","DayeuhKolot", true);
    }
}
