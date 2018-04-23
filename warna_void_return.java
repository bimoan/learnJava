class warna{ 
	
	String warna = "hitam";
	
	public static void main(String args[]){ 
		
		warna hitam = new warna();
		
		hitam.menampilkan("Gelap"); // action method void,(isi dari parameter)
		
		
		String WarnaBaru = hitam.warnabaru();
		
		System.out.println(WarnaBaru); //action method return
		
		
		
		}
		
	void menampilkan(String visual) { 
		
		// didalam () parameter dideklarasikan 
		
		System.out.println("ini adalah warna hitam yang " + visual );
		
		}
		
	String warnabaru(){ 
		
		return 
		
		// kata kunci return haruslah dideklarasikan terlebih dahulu dalam method return
		
		warna = "putih";
	
		}
	
	}
