package latihan.tabungan;

public class Tabungan {
	public double saldo;
	public double target;
	private double bunga = 0.08;
	public void Hitung() {
		int i = 1;
		while(saldo <= target) {
			saldo += bunga * saldo;
			System.out.printf("Saldo di bulan ke-"+i+" : Rp.%,.0f%n", saldo);
			i++;
		}

	}
}
