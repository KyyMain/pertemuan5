package Manusia;
public class Mahasiswa extends Manusia {
    private int nim;
    private String jurusan;

    public Mahasiswa(int nim, String jurusan) {
        this.nim = nim;
        this.jurusan = jurusan;

    }

    // Getter Nim
    public int getNim() {
        return nim;
    }

    // Setter Nim
    public void setNim(int nim) {
        this.nim = nim;
    }

    // Getter Jurusan
    public String getJurusan() {
        return jurusan;
    }

    // Setter Jurusans
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Nim           : " + this.nim);
        System.out.println("Jurusan       : " + this.jurusan);
    }

}