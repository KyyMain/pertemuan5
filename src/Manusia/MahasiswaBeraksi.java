package Manusia;
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(312310572, "Teknik Informatika");

        mhs.setNama("Kyy");
        mhs.setJenisKelamin("Laki-Laki");
        mhs.setAlamat("Bekasi");
        mhs.setUmur(18);

        mhs.cetakInfo();
    }
}
