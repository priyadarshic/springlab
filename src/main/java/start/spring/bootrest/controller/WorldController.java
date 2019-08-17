package start.spring.bootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import start.spring.bootrest.entity.WorldBean;
import start.spring.bootrest.service.IWorldService;
import start.spring.bootrest.service.WorldService;

@RestController
@RequestMapping("/employee")
public class WorldController implements IWorldService {

	@Autowired
	private WorldService service;
	
	@Override
	@GetMapping(path = "/get")
	public String getMessage() {

		return this.service.getMessage();
	}
	
	@Override
	@GetMapping(path="/getbean")
	public WorldBean getBean() {
		return this.service.getBean();
	}
}
