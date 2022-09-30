package br.edu.iftm.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbctemplateApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JdbctemplateApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {

		jdbcTemplate.execute("DROP TABLE contatos IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE contatos(id SERIAL, nome VARCHAR(255), telefone VARCHAR(255) )");

		jdbcTemplate.update("INSERT INTO contatos(nome,telefone) VALUES (?,?)", "Edson Angoti Júnior", "123");
		jdbcTemplate.update("INSERT INTO contatos(nome,telefone) VALUES (?,?)", "José Joaquim", "123");
		jdbcTemplate.update("INSERT INTO contatos(nome,telefone) VALUES (?,?)", "Maria Carolina", "123");
		jdbcTemplate.update("INSERT INTO contatos(nome,telefone) VALUES (?,?)", "Marcos Vinício", "34991286595");

		List<Contato> contatos = jdbcTemplate.query("SELECT id, nome, telefone FROM contatos", (rs, rowNum) -> {
			return new Contato(rs.getLong("id"), rs.getString("nome"), rs.getString("telefone"));
		});
		System.out.println("------------------------------------------------------------");
		System.out.println("Listando contatos");
		for (Contato contato : contatos) {
			System.out.println(contato.getNome() + " - " + contato.getTelefone());
		}
		System.out.println("------------------------------------------------------------");

		//Contar o número de registros na tabela
		int contarNumerosDeResgistros = this.jdbcTemplate.queryForObject("select count(*) from contatos", Integer.class);
		System.out.println("------------------------------------------------------------");
		System.out.println("Números de registros na base de dados");
		System.out.println("O número de registros na base de dados é " + contarNumerosDeResgistros);
		System.out.println("------------------------------------------------------------");

		String telefone = this.jdbcTemplate.queryForObject(
				"select telefone from contatos where nome = ?",
				String.class, "Edson Angoti Júnior");
		System.out.println("-------------------------------------------------------------");
		System.out.println("O telefone do contato Edson Angoti Júnior é " + telefone );
		System.out.println("-------------------------------------------------------------");


	}

}
