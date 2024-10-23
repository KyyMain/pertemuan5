package Manusia;

public class Manusia {
    private String nama;
    private String jenisKelamin;
    private int umur;
    private String alamat;

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Setter Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter Jenis Kelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Setter Jenis Kelamin
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter Umur
    public int getUmur() {
        return umur;
    }

    // Setter Umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Getter Alamat
    public String getAlamat() {
        return alamat;
    }

    // Setter Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetakInfo() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Umur          : " + this.umur);
        System.out.println("Alamat        : " + this.alamat);

    }
}
