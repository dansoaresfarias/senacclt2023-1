package senac.pe.EventoADA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import senac.pe.EventoADA.Repository.EventoRepository;
import senac.pe.EventoADA.model.Evento;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@GetMapping("/cadastrarEvento")
	public String formCadstroEvento() {
		return "evento/formEvento";
	}
	
	@PostMapping("/cadastrarEvento")
	public String formCadstroEvento(Evento evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}

}
