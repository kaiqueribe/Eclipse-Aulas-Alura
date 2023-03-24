package br.com.alura;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import br.com.alura.model.NotaFiscal;
import br.com.alura.wsclient.NotaFiscalWSClient;

public class TesteEnvioBloqueante {

	public static void main(String[] args) {

		List<NotaFiscal> notasFiscais = List.of(new NotaFiscal("João", 39.99, LocalDate.now(),LocalTime.now()),
				new NotaFiscal("Renata", 41.20, LocalDate.now(),LocalTime.now()), 
				new NotaFiscal("Paulo", 32.10, LocalDate.now(),LocalTime.now()),
				new NotaFiscal("Feranda", 15.00, LocalDate.now(),LocalTime.now()));
		

		NotaFiscalWSClient nfwsc = new NotaFiscalWSClient();
		notasFiscais.forEach(nf -> {
			nfwsc.enviar(nf);
			System.out.println("Parabéns pela compra!!");
			System.out.println("Kaique");
		});
	}
}
