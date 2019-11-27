package br.usjt.hellospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.Tempo;
// import br.usjt.hellospringboot.model.Calculadora;
import br.usjt.hellospringboot.repository.TempoRepository;


@Service
public class TempoService {
	@Autowired
	private TempoRepository prevtemp;
	

	
	public void salvar(Tempo tempo) {
		prevtemp.save(tempo);
	}
	
	public List<Tempo> listarTodos() {
		List<Tempo> Temporal = prevtemp.findAll();

		return Temporal;
	}
}