package basic_java;

public class If_elseif_kondisi {

	public static void main(String[] args) {
		
		String username = "Admin";
		String username2= "User";
		String password = "Sandi";
		
		if(username == "admin" & password == "Sandi"){
		System.out.println("Selamat Datang, Anda Masuk Sebagai " + username);	
	}else if(username2 == "User" & password == "Sandi"){
		System.out.println("Selamat Datang, Anda Masuk Sebagai " + username2);
	}else{
		System.out.println("Selamat Datang, Anda Masuk Sebagai GUEST");		
	
	}
  
  }

}
