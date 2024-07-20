package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode()); // -602288624
		System.out.println(c2.hashCode()); // -602288624
		System.out.println(c1.equals(c2)); // true
		System.out.println(c1 == c2);      
		// false => como foram criados 2 objs diferentes em 2 posições de memoria diferentes na comparação retorna que os objetos não são iguais por estarem em 
		// posições de referencia de memória distintas.
		
		
		String s1 = "Test";
		String s2 = "Test";
		System.out.println(s1 == s2); // true funciona porque estamos lidando com literais
		String ss1 = new String("Test");
		String ss2 = new String("Test");
		System.out.println(ss1 == ss2); // false => ao fazeermos isso, estamos criando uma nova referencia de memória e por isso dará falso.
		
	}

}
