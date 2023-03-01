package dev.uira.api.pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class Pessoa {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;

	public Pessoa(DadosPessoa dados) {
		this.nome = dados.nome();
		this.email = dados.email();
	}
		
	protected Pessoa() {}
}
