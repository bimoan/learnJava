
class orang {
	
	String Umur = "Tua";
	
	// set = void 
	// get = return
	
	
	public static void main(String []args) {
		
		orang aji = new orang();
		
		
		
		aji.setTinggi("Muda");
		
		System.out.println(aji.getTinggi());
		
		//System.out.println(aji.Umur);
		
		
		
		
		}
		
		
		void setTinggi(String UmurBaru) {
			
			Umur = UmurBaru; 
				
			}
			
		
		String getTinggi() {
			
			return Umur;
			
			}
			
			
	
	
	}
