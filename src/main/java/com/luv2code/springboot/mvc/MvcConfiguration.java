package com.luv2code.springboot.mvc;

import org.springframework.core.env.Environment;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
//@PropertySource("classpath:application.properties")
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	
	//@Autowired
	//private Environment env;
	
	
	//private Logger logger=Logger.getLogger(getClass().getName());
	
    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
   // @Bean
   // public DataSource securityDataSource()
  // {
    	//ComboPooledDataSource securityDataSource=new ComboPooledDataSource();
    	
    	//try {
		//	securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		//} catch (PropertyVetoException exc) {
			
		//	throw new RuntimeException(exc);
	//	}
    	
    	//securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
    	//securityDataSource.setUser(env.getProperty("jdbc.user"));
    	//securityDataSource.setPassword(env.getProperty("jdbc.password"));
    	
    	//securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
    	//securityDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
    //	securityDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
    	//securityDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
    	
    	//return securityDataSource;
   // }
    
   // private int getIntProperty(String propName) {
    //	String propVal=env.getProperty(propName);
   // 	int intPropVal=Integer.parseInt(propVal);
  //  	return intPropVal;
  //  }
    
    
}