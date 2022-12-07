public class Sampan extends TransportasiAir{
protected int jumlahLayar;

public Sampan(int jumlahKursi, int biayaSewa, int jumlahLayar, String Berlayar){
    super(jumlahKursi, biayaSewa);
    this.jumlahLayar = jumlahLayar;
}
@Override
public void Detail(){
    System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp." +biayaSewa);
}
}
