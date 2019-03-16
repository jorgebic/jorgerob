package exec01;
 import java.util.Scanner;

import model.ItemPedido;
import model.Pedido;

 public class Principal {
	public static void main(String[] args) {
		{System.out.println("          MENU DE PEDIDO");}
		{System.out.println(" ");}
		{System.out.println("1 - Inclusao");}
		{System.out.println(" ");}
		{System.out.println("2 - Lista");}
		{System.out.println(" ");}
		{System.out.println("3 - Alteracao");}
		{System.out.println(" ");}
		{System.out.println("4 - Exclusao");}
		{System.out.println(" ");}
	    {System.out.println("5 - Sair do programa");}
	    
	    Pedido p = new Pedido("Bahia", "Bahia 01", "lista01");
	    
	    ItemPedido ip = new ItemPedido(1000, 25, "geladeira");
	    
	    Scanner sc = new Scanner(System.in);
		int valorDigitado = sc.nextInt();
		int resultado = valorDigitado;
	    if (resultado == 1)
	        {System.out.println("  NOME " + "     QTD " + "    VALOR" ); 
	         System.out.println(ip.getNome() + "    " + ip.getQtd()); } 
		else
		    {System.out.print("impar");}
	}
}
 

