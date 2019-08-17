package start.spring.bootrest.service;

import org.springframework.web.bind.annotation.GetMapping;

import start.spring.bootrest.entity.WorldBean;

public interface IWorldService {

	String getMessage();

	WorldBean getBean();

}