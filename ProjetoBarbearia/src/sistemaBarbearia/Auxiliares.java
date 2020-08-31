package sistemaBarbearia;

public class Auxiliares {

	
	
	String  aniversarioFormatado(String aniversario) {
		
		String dia = aniversario.substring(0, 2);
		String mes = aniversario.substring(3, 5);
		String ano = aniversario.substring(6);
		
		 aniversario = ano +"-"+ mes +"-"+ dia;
		 
		 return aniversario;
	}
}
