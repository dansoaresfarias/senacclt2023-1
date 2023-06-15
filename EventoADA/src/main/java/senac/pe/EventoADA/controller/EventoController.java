package senac.pe.EventoADA.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@GetMapping("/listarEventos")
	public ModelAndView listarEventos() {
		ModelAndView mv = new ModelAndView("evento/listarEventos");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}

	@GetMapping(value = "/{idEvento}")
	public ModelAndView detalharEvento(@PathVariable("idEvento") long idEvento) {
		Evento evento = er.findByIdEvento(idEvento);
		ModelAndView mv = new ModelAndView("evento/detalharEvento");
		mv.addObject("evento", evento);
		return mv;
	}

}
