package br.usjt.hellospringboot.repository;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;


import br.usjt.hellospringboot.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	@Async
    @NamedQuery(name = "q2", query = "SELECT c FROM Cidade c WHERE c.latitude = ?1 AND c.longitude = ?1")
	public List <Cidade> findByLatitudeAndLongitude (Double latitude, Double longitude);
	
	@Async
    @NamedQuery(name = "q1", query = "SELECT c FROM Cidade c WHERE c.nome = ?1")
	public List <Cidade> findByNome (String nome);

	public static boolean ignorar (Cidade cidade) {
		findOneByNome(cidade.getNome().equalsIgnoreCase(cidade.getNome()));
		return true;
	}


}
