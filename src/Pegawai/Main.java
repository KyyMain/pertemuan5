package Pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager
        Manager manager = new Manager();
        manager.setNama("Agus");
        manager.setGajiPokok(8000000);
        manager.setTunjangan(2000000);
        manager.cetakInfo();

        System.out.println();

        // Membuat objek Programmer
        Programmer programmer = new Programmer();
        programmer.setNama("Bagus");
        programmer.setGajiPokok(9000000);
        programmer.setBonus(1500000);
        programmer.cetakInfo();
    }
}
