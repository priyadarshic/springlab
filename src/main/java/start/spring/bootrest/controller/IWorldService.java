package start.spring.bootrest.controller;

import org.springframework.web.bind.annotation.GetMapping;

import start.spring.bootrest.entity.WorldBean;

public interface IWorldService {

	String getMessage();

	WorldBean getBean();

}