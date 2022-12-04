public class MainApp
 {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Zyrex",4,4.0f);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Polytron",32,5.0f,true);
        laptop.informasi();
        laptop.bukaGame("Call Of Duty : Modern Warfare 2");
        laptop.kirimEmail("kacuping@kacuping.com");
        laptop.kirimEmail("kacuping@kacuping.com", "kacuping@kacuping.com");
        System.out.println();
        
        Handphone handphone = new Handphone("Smartfrene",90,2.4f,false);
        handphone.informasi();
        handphone.telfon(622345678);
        handphone.kirimSMS(622345678);
        handphone.kirimSMS(622345678, 622345678);
    }
}