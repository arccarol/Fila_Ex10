package controller;

import br.arccarol.filaObject.Fila;

import model.Cliente;

	public class OperacaoController {
		
		public void caixa(Fila f) throws Exception {
		
	        while (!f.isEmpty()) {
	            Object model = f.remove();
	            double valorTotal = ((Cliente) model).getQuantidade() * ((Cliente) model).getValor();
	            System.out.println("Nome: " + ((Cliente) model).getNome() + ", Valor Total da Compra: " + valorTotal);
	        }
	    }
	}



