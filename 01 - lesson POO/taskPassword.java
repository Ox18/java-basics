package task;

public class taskPassword {

	public taskPassword() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
//		Password password = new Password(8);
//		password.GeneratePassword();
//		System.out.println(password.getContrasena());
//		System.out.println(password.Fuerte());
		taskPassword task = new taskPassword();
		task.GeneratePasswords(99, 8);
	}
	private void GeneratePasswords(int largo, int longitud) {
		String[] passwords = new String[largo];
		for(int i = 0; i < largo; i++) {
			Password password = new Password(longitud);
			password.GeneratePassword();
			passwords[i] = password.getContrasena() + " " + password.Fuerte();
		}
		this.ReadPasswords(passwords);
	}
	private void ReadPasswords(String[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
