package br.com.alura.wsclient;

import br.com.alura.model.NotaFiscal;

public class NotaFiscalWSClient {

	public void enviar(NotaFiscal nf) {
		try {
			System.out.println("Emitindo nota fiscal");
			Thread.sleep(5000);
			System.out.format("Nota fiscal emitida %nEm nome de %s %nNa data de %s %n as %s", 
					nf.getNome(),nf.getValor(), nf.getData(),nf.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
