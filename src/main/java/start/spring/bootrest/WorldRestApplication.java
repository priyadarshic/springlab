package start.spring.bootrest;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class WorldRestApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(WorldRestApplication.class);
		ConfigurableEnvironment environment = new StandardEnvironment();
		MutablePropertySources props = environment.getPropertySources();
		Iterator<PropertySource<?>> itr = props.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		app.setEnvironment(environment);
		SpringApplication.run(WorldRestApplication.class, args);
		// SpringApplication.run(BootRestApplication.class, args);
	}

}
