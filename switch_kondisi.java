package basic_java;

public class switch_kondisi {

	public static void main(String[] args) {
		
		// switch(variabel) { case kondisi : Aksi; break; }
		
		int angka = 6;
		
		switch(angka){
		
		case 0  :
			System.out.println("Ini adalah angka 0");
			break; // untuk menghentikan jalannya kode apabila, kondisi telah terpenuhi
			
		case 1:
			System.out.println("ini adalah angka 1");
			break;
			
		case 2:
			System.out.println("ini adalah angka 2");
			break;
			
		case 3:
			System.out.println("ini adalah angka 3");
			break;
			
		case 4:
			System.out.println("ini adalah angka 4");
			break;
			
		case 5:
			System.out.println("ini adalah angka 5");
			break;
			
		default:
			System.out.println("Mohon Maaf, Angka Diluar jangkauan");
			break;
		}

	}

}
