package senac.pe.EventoADA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
		
	@RequestMapping("/EventoADA")
	public String index() {
		return "index";
	}

}
