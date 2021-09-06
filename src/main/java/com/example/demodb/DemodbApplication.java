package com.example.demodb;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.page.Viewport;
import de.mekaso.vaadin.addon.compani.ResourceLoaderServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;


//@Configuration
//@EntityScan(basePackages = {"model"})

//@ComponentScan(basePackages = {"com.example.demodb.demodb"})
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@Push
@SpringBootApplication
public class DemodbApplication extends SpringBootServletInitializer implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(DemodbApplication.class, args);
	}


	@Bean
	public ServletRegistrationBean registerComponentAnimations() {
		return new ServletRegistrationBean(new ResourceLoaderServlet(), "/compani/compani.js");
	}

}
