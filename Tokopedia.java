public class Tokopedia{
    public String namaBarang;
    public String deskripsi;
    public String Katagori;
    public String asalBarang;
    public int hargaBarang;
    public int stokBarang;

    public Tokopedia(){

    }

    public Tokopedia(String nBarang, String des, String kat, String aBarang, int hBarang, int sBarang){
        this.namaBarang = nBarang;
        this.deskripsi = des;
        this.Katagori = kat;
        this.asalBarang = aBarang;
        this.hargaBarang = hBarang;
        this.stokBarang = sBarang;

    }

    public String getnamaBrang(){
        return this.namaBarang;
    }
    public String getdeskripsi(){
        return this.deskripsi;
    }
    public String getKatagori(){
        return this.Katagori;
    }
    public String getasalBarang(){
        return this.asalBarang;
    }
    public int gethargaBarang(){
        return this.hargaBarang;
    }
    public int getstokBarang(){
        return this.stokBarang;
    }
    public void PrintmenuTokopedia(){
        System.out.println(namaBarang +" "+deskripsi+" "+Katagori+" "+asalBarang+" "+hargaBarang+" "
                            +stokBarang);
    }
}