package src.main.java;

public class Counter {

	private int count;
	
	// Skenario Gagal 1: Menambahkan variabel yang tidak pernah digunakan (Code Smell: Unused Private Field)
	private String dummyVariable = "Halo Dosen"; 

	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		// Skenario Gagal 2: Menggunakan System.out untuk logging (Code Smell: Replace this use of System.out or System.err by a logger)
		System.out.println("Nilai counter bertambah!");
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		// Skenario Gagal 3: Menulis baris kode mati setelah statement return (Bug/Code Smell: Unreachable Code)
		return count;
		// count = 0; // Sengaja di-comment atau dibiarkan aktif jika compiler mengizinkan untuk memicu deteksi analisis
	}
	
	// Skenario Gagal 4: Membuat fungsi kosong yang tidak melakukan apa-apa (Code Smell: Empty Method Body)
	public void fungsiGabutSengajaDibuat() {
		// Kosong sengaja untuk memicu komplain SonarCloud
	}
	
}
