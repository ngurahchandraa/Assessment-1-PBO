package soal2;

import java.text.DecimalFormat;
import java.util.*;

public class ShowroomJaya {
    ArrayList<Mobil> arrMobil = new ArrayList();


    public void tambahMobil(Mobil mobil){
        arrMobil.add(mobil);

    }

    public void beliMobil(Scanner input ) {
        DecimalFormat df = new DecimalFormat("########.#");
        String merk, tahunKeluaran;
        int jumlah;
        System.out.println("Showroom Mobil Jaya - Penjualan");
        System.out.println("INPUT");
        System.out.print("Merk : ");
        merk = input.nextLine();
        System.out.print("Tahun Keluaran : ");
        tahunKeluaran = input.next();
        System.out.print("Jumlah : ");
        jumlah = input.nextInt();
        System.out.println();

        for (Mobil mobil : arrMobil) {
            if (merk.equalsIgnoreCase(mobil.getMerk()) && tahunKeluaran.equalsIgnoreCase(mobil.getTahunKeluaran()) && jumlah <= mobil.getStok()) {

                mobil.setStok(mobil.getStok() - jumlah);

                double diskon = 0.0;
                double hargaDiskon = 0.0;

                System.out.println("Merk : " + mobil.getMerk());
                System.out.println("Harga Satuan : " + df.format(mobil.getHarga()));
                System.out.println("Tahun Keluaran : " + mobil.getTahunKeluaran());
                System.out.println("Jumlah Beli : " + jumlah);
                System.out.println("Total Harga : " + df.format(mobil.getHarga() * jumlah));

                double total = mobil.getHarga() * jumlah;

                if (jumlah == 1) {
                    diskon = 0.0;
                    hargaDiskon = diskon;
                } else if (jumlah == 2) {
                    diskon = 10.0;
                    hargaDiskon = mobil.getHarga() * jumlah * diskon / 100;
                    mobil.setHarga(hargaDiskon);

                } else if (jumlah > 2) {
                    diskon = 20.0;
                    hargaDiskon = mobil.getHarga() * jumlah * diskon / 100;
                    mobil.setHarga(hargaDiskon);
                }

                System.out.println("Diskon : " + diskon + " persen");
                System.out.println("Total Diskon : " + df.format(hargaDiskon));
                System.out.println("Total Bayar : " + df.format(total - hargaDiskon));
                break;
            } else if (jumlah > mobil.getStok()) {
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi ");
                break;

            }
        }
    }

    public void viewStock(){
        for (Mobil newcar: arrMobil){

            newcar.displayInfo();
            System.out.println();

        }
    }

    public static void main(String[] args) {
        ShowroomJaya shw =  new ShowroomJaya();
        Scanner input = new Scanner(System.in);
        Mobil mobil1 = new Mobil("Avanza","2018",10,150000000.0);
        Mobil mobil2 = new Mobil("Aston Martin","2019",10,394000000.0);
        Mobil mobil3 = new Mobil("YARIS 1.5 G M/T 3 Airbags","2020",15,248300000.0);

        shw.tambahMobil(mobil1);
        shw.tambahMobil(mobil2);
        shw.tambahMobil(mobil3);

        shw.viewStock();

        shw.beliMobil(input);

    }
}