package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.IEvenementService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/event")
public class EventController {

	
	@Autowired
	public IEvenementService es;
	
	
}
