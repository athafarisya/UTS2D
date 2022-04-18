import java.util.ArrayList;
import java.util.Scanner;

public class TokopediaArray {

    public static void main(String[] args) {
        ArrayList<Tokopedia> penggunaTokopedia = new ArrayList<>();
        for(int index=0;index<3;index++){
            Tokopedia pembeliTokopedia = new Tokopedia();
            Scanner inputDetail = new Scanner(System.in);

            System.out.println("masukan nama barang");
            pembeliTokopedia.namaBarang = inputDetail.nextLine();

            System.out.println("masukan dekripsi barang");
            pembeliTokopedia.deskripsi = inputDetail.nextLine();

            System.out.println("masukan katagori barang");
            pembeliTokopedia.Katagori = inputDetail.nextLine();

            System.out.println(":masukan asal barang");
            pembeliTokopedia.asalBarang = inputDetail.nextLine();

            System.out.println("harga barang");
            pembeliTokopedia.hargaBarang = inputDetail.nextInt();

            System.out.println("stok barang");
            pembeliTokopedia.stokBarang = inputDetail.nextInt();
        }
    }
}
