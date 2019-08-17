/**
 * 
 */
package start.spring.bootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import start.spring.bootrest.entity.WorldBean;

/**
 * @author Admin
 *
 */
@Service
public class WorldService implements IWorldService {

	//@Autowired
	//private WorldBean wBean;
	/*
	 * Action:
	 * Consider defining a bean of type 'start.spring.bootrest.entity.WorldBean' in your configuration.
	 * 
	 */
	
	//Change Test Change 2
	private WorldBean wBean = new WorldBean("World Bean");
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return wBean.getMessage();
	}

	@Override
	public WorldBean getBean() {
		// TODO Auto-generated method stub
		return new WorldBean("This is a Bean Service");
	}

}
