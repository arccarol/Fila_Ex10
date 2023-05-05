package view;

import br.arccarol.filaObject.Fila;
import controller.OperacaoController;
import model.Cliente;

	public class Principal {
	    public static void main(String[] args) {
	    	
	        Fila f = new Fila();

	      
	        for (int i = 1; i <= 20; i++) {
	            String nome = "Cliente" + i;
	            int quantidade = (int) (Math.random() * 31) + 20; 
	            double valor = (Math.random() * 96) + 5; 
	            Cliente model = new Cliente(nome, quantidade, valor);
	            f.insert(model);
	        }

	        OperacaoController operacaoController = new OperacaoController();
	        try {
				operacaoController.caixa(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	}



