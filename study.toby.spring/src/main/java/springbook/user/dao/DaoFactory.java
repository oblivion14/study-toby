package springbook.user.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

// 팩토리의 메소드는 UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지를 결정한다. 
@Configuration
public class DaoFactory {
	
	@Bean
	public UserDao userDao() {
		//
		UserDao userDao = new UserDao();
		userDao.setDataSource(dataSource());
		return userDao();
	}
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost/toby_spring");
		dataSource.setUsername("study");
		dataSource.setPassword("study");
		
		return dataSource();
	}
}
