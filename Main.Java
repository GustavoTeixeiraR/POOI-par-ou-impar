import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		
		int valor = scan.nextInt();
		
		
		if (valor%2 == 0){
		    System.out.println("O número é par");
		}else{
		    System.out.println("O número é impar");
		}
	}
}
