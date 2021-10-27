package soal2;

import java.text.DecimalFormat;

public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk , String tahunKeluaran , int stok , double harga){
    this.merk = merk;
    this.tahunKeluaran = tahunKeluaran;
    this.harga = harga;
    this.stok = stok;
    }
    public String getMerk(){
        return merk;
    }
    public String getTahunKeluaran(){
        return tahunKeluaran;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void displayInfo(){
        DecimalFormat df = new DecimalFormat("########.#");
        System.out.println();
        System.out.println("Informasi Mobil" +
                "\nMerk : " +getMerk() +"" +
                "\nHarga : " + df.format(getHarga())+"" +
                "\nTahun Keluaran : "+getTahunKeluaran() + "" +
                "\nSisa Stok : "+ getStok());
    }

}
