import java.util.Scanner;

public class CalculadoraCaronaSolidaria {
	public static void main (String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		float kmPercorridos;
		float precoCombustivel;
		float kmPlCarro;
		float estacionamento;
		float pedagio;
		float litrosPdia;
		float combPrecoPDia;
		int caronaSeg;
		int caronaTer;
		int caronaQua;
		int caronaQui;
		int caronaSex;
		int caronaSab;
		int caronaDom;
		float caronaMedia;
		int diasTrabalho;
		float precoTotalSem;
		float precoTotalMes;
		float precoEconomizadoSem;
		float precoEconomizadoMes;

		
		System.out.print("Seja bem vindo... errr, qual o seu nome mesmo?\n ");
		nome = entrada.next();
		
		System.out.printf("\nAgora sim! Bem vindo ao calculador de economia caso você faça caronas.\n",nome);
		
		System.out.printf("\nQuantos dias da semana você trabalha?");
		diasTrabalho = input.nextInt();
		
		System.out.printf("\nQuantos Quilometros você percorre por dia?\n");
		kmPercorridos = input.nextFloat();
		
		System.out.printf("Quanto que está o preço por litro do combustivel utilizado?\n");
		precoCombustivel = input.nextFloat();
		
		System.out.printf("Quantos km/l seu automovel faz?\n");
		kmPlCarro = input.nextFloat();
		
		litrosPdia = kmPercorridos / kmPlCarro;
		combPrecoPDia = litrosPdia * precoCombustivel;
		
		System.out.printf("Digite em ordem o preço do estacionamento por dia e do pédagio (caso não existir, insira 0).\n");
		estacionamento = input.nextFloat();
		pedagio = input.nextFloat();
		
		if(diasTrabalho == 5) {
			System.out.printf("Agora me diga em ordem, quantas pessoas você leva por dia na Segunda, Terça, Quarta, Quinta e Sexta:\n ");
			caronaSeg = input.nextInt();
			caronaTer = input.nextInt();
			caronaQua = input.nextInt();
			caronaQui = input.nextInt();
			caronaSex = input.nextInt();
			
			caronaMedia = (caronaSeg+caronaTer+caronaQua+caronaQui+caronaSex)/diasTrabalho;
			
			precoTotalSem = (estacionamento+pedagio+combPrecoPDia) * 5;
			precoTotalMes = precoTotalSem * 4;
			
			precoEconomizadoSem = precoTotalSem / caronaMedia;
			precoEconomizadoMes = precoTotalMes / caronaMedia;
			
			System.out.printf("%s, você gastaria %f por semana e %f por mês sem a carona.\nCom a carona, passou a gastar %f por semana e %f por mês!",nome,precoTotalSem,precoTotalMes,precoEconomizadoSem,precoEconomizadoMes);
		}
		
		if(diasTrabalho == 6) {
			System.out.printf("Agora me diga em ordem, quantas pessoas você leva por dia na Segunda, Terça, Quarta, Quinta, Sexta e Sabado:\n ");
			caronaSeg = input.nextInt();
			caronaTer = input.nextInt();
			caronaQua = input.nextInt();
			caronaQui = input.nextInt();
			caronaSex = input.nextInt();
			caronaSab = input.nextInt();
			
			caronaMedia = (caronaSeg+caronaTer+caronaQua+caronaQui+caronaSex+caronaSab)/diasTrabalho;
			
			precoTotalSem = (estacionamento+pedagio+combPrecoPDia) * 6;
			precoTotalMes = precoTotalSem * 4;
			
			precoEconomizadoSem = precoTotalSem / caronaMedia;
			precoEconomizadoMes = precoTotalMes / caronaMedia;
			
			System.out.printf("%s, você gastaria %f por semana e %f por mês sem a carona.\nCom a carona, passou a gastar %f por semana e %f por mês!",nome,precoTotalSem,precoTotalMes,precoEconomizadoSem,precoEconomizadoMes);
		}
		
		if(diasTrabalho == 7) {
			System.out.printf("Agora me diga em ordem, quantas pessoas você leva por dia na Segunda, Terça, Quarta, Quinta, Sexta, Sabado e Domingo:\n ");
			caronaSeg = input.nextInt();
			caronaTer = input.nextInt();
			caronaQua = input.nextInt();
			caronaQui = input.nextInt();
			caronaSex = input.nextInt();
			caronaSab = input.nextInt();
			caronaDom = input.nextInt();
			
			caronaMedia = (caronaSeg+caronaTer+caronaQua+caronaQui+caronaSex+caronaSab+caronaDom)/diasTrabalho;
			
			precoTotalSem = (estacionamento+pedagio+combPrecoPDia) * 7;
			precoTotalMes = precoTotalSem * 4;
			
			precoEconomizadoSem = precoTotalSem / caronaMedia;
			precoEconomizadoMes = precoTotalMes / caronaMedia;
			
			System.out.printf("%s, você gastaria %f por semana e %f por mês sem a carona.\nCom a carona, passou a gastar %f por semana e %f por mês!",nome,precoTotalSem,precoTotalMes,precoEconomizadoSem,precoEconomizadoMes);
		}
		

	}
}
