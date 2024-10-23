package Pegawai;

public class Programmer extends Pegawai {
    private double bonus;

    // Setter dan Getter untuk bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method untuk mencetak informasi programmer
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus          : " + this.bonus);
    }

    // Method untuk mencetak bonus
    public void cetakBonus() {
        System.out.println("Bonus          : " + this.bonus);
    }
}
