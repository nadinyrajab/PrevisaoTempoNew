package br.usjt.hellospringboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table (name="dias")
@ToString @Getter @Setter
public class Dia {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	
	private String semana;

	
	@OneToOne(optional=true, cascade = {CascadeType.ALL})
	@JoinColumn (name="previsao")
	private Tempo tempo;

}
