package br.com.screenmatch;

// Importa os arquivos do Spring boot.

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.screenmatch.principal.Principal;

//Cria a classe Run, que permite a inicialização da aplicação.

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu(); // Exibe o menu para o usuario digitar o nome da série.
	}
}