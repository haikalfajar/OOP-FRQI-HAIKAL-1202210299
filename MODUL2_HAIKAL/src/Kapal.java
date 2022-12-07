public class Kapal extends TransportasiAir {
    protected String Berlayar;

    public Kapal(int jumlahKursi, int biayaSewa, String Berlayar){
        super(jumlahKursi, biayaSewa);
        this.Berlayar = Berlayar;
    }
    @Override
    public void Detail(){
        System.out.println("Transportasi jenis Kapal dengan kursi" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp." + biayaSewa);
    }
    @Override
    public void keterangan(){
        System.out.println("Transportasi Air Jenis Kaal sedang berlayar menggunakan" + Berlayar + "dengan kecepatan yang ridak stabil");
    }
}
    

