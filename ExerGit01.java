package ExerGit;

import java.util.Scanner;

public class ExerGit01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
		
    System.out.println("Digite seu E-mail: ");
    String email = scan.nextLine();
		
    System.out.println("Digite sua senha: ");
    String senha = scan.nextLine();
		
    if (email+senha !=null) {
      System.out.println("Logado com sucesso!");		
    } else {
      System.out.println("Credenciais incorretas!");
    }		
  }
}
