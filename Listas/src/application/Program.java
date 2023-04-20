package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//CLIENTE
		System.out.println("Entre com os dados do cliente: ");
		System.out.println("Nome: ");
		String name = scan.nextLine();
		System.out.println("Email: ");
		String email = scan.nextLine();
		System.out.println("Entre com a data de aniversario: (dd/MM/yyyy)");
		Date aniversario = sdf.parse(scan.next());
		
		Client c1 = new Client(name,email,aniversario);//CRIADO CLIENTE
		
		System.out.println("Entre com os dados do pedido: ");
		OrderStatus status = OrderStatus.PROCESSING; //STATUS DO PEDIDO
		
		Order order = new Order(new Date(), status, c1);  //CRIADO PEDIDO
		
		System.out.println("Quantos itens tem no pedido?");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			System.out.println("Entre com os dados do pedido "+i +":");
			System.out.println("Nome do produto: ");
			String productName = scan.nextLine();
			scan.nextLine();
			System.out.println("Preço do pedido: ");
			double producPrice = scan.nextDouble();
			scan.nextLine();
			System.out.println("Digite a quantidade: ");
			
			Product product = new Product(productName,producPrice); //CRIADO PRODUTO COM NOME E PRECO
			
			System.out.println("Quantidade: ");
			int qtd = scan.nextInt();
			
			OrdemItem items = new OrdemItem(qtd,producPrice,product); //CRIADO ITEM COM PRODUTO
			
			order.addItem(items); //ADICIONADO ITEMS A LISTA
			
		}
		

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		
		

	}

}
