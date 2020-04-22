package br.gov.pbh.copbh.concius.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.pbh.copbh.concius.model.Eixo;
import br.gov.pbh.copbh.concius.repository.Eixos;

@RestController
@RequestMapping("/eixos")
public class EixoResource{

	@Autowired
	private Eixos eixos;
	
	@GetMapping
	public List<Eixo> listar(){
		return eixos.findAll();
	}
}
