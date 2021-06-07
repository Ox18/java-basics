package task;

import java.util.Random;

public class Password {

	private int longitud; // 8
	private String contrasena;
	private String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private String numbers = "1234567890";
    
	public Password(int longitud) {
		this.longitud = this.ValidateAndGetLongitud(longitud);
	}
	private int ValidateAndGetLongitud(int longitud) {
		return longitud > 8 ? 8 : longitud < 0 ? 0 : longitud;
	}
	@SuppressWarnings("unused")
	public void GeneratePassword() {
	    String words = this.capitalCaseLetters + this.lowerCaseLetters + this.numbers;
	    Random random = new Random();
	    String password = "";
	    for(int pointerPassword = 0; pointerPassword < this.longitud; pointerPassword++) {
	    	password += words.charAt(random.nextInt(words.length()));
	    }
	    this.contrasena = password;
	}
	@SuppressWarnings("unused")
	public boolean Fuerte() {
		int uppercase = 0;
		int lowercase = 0;
		int numbers = 0;
		for(int i = 0; i < this.contrasena.length(); i++) {
			char letter = this.contrasena.charAt(i);
			for(int j = 0; j < this.capitalCaseLetters.length(); j++) {
				char letterCapital = this.capitalCaseLetters.charAt(j);
				if(letter == letterCapital) uppercase++;
			};
			for(int j = 0; j < this.lowerCaseLetters.length(); j++) {
				char letterCapital = this.lowerCaseLetters.charAt(j);
				if(letter == letterCapital) numbers++;
			};
			for(int j = 0; j < this.numbers.length(); j++) {
				char letterCapital = this.numbers.charAt(j);
				if(letter == letterCapital) numbers++;
			};
		}
		return uppercase > 2 && lowercase > 1 && numbers > 5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public String getContrasena() {
		return contrasena;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
