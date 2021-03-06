package de.flatspection.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import de.flatspection.dao.UserDAO;
import de.flatspection.dao.impl.UserDAOImpl;

@Configuration
@ComponentScan( {"de.flatspection.service" })
public class RootConfig {

	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		//ds.setUrl("jdbc:mysql://localhost:3306/FlatSpection?user=root&password=password");
		ds.setUrl("jdbc:mysql://flatspecs.noip.me:3306/flatspecs?user=flatspecs&password=Fl4tSp3cs");
		return ds;
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Bean
	public UserDAO userDao() {
		return new UserDAOImpl();
	}
	
}
