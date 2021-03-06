package exe1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	   public static void main(String[] args) 
	         throws UnknownHostException, IOException {
	     // dispara cliente
	     new Cliente("127.0.0.1", 9090).executa();
	   }
	   
	   private String host;
	   private int porta;
	   
	   public Cliente (String host, int porta) {
	     this.host = host;
	     this.porta = porta;
	   }
	   
	   public void executa() throws UnknownHostException, IOException {
	     Socket cliente = new Socket(this.host, this.porta);
	     System.out.println("O cliente se conectou ao servidor!");
	     
	     // thread para receber mensagens do servidor
	     Servidor server = new Servidor(cliente.getInputStream());
	     new Thread(server).start();
	     
	     // l� msgs do teclado e manda pro servidor
	     Scanner teclado = new Scanner(System.in);
	     PrintStream saida = new PrintStream(cliente.getOutputStream());
	     while (teclado.hasNextLine()) {
	       saida.println(teclado.nextLine());
	     }
	     
	     saida.close();
	     teclado.close();
	     cliente.close();    
	   }
	 }