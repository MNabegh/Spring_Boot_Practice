package com.tutorialspoint;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
@PropertySource(value = { "classpath:application.properties" })
public class AspectsConfig 
{
	@Autowired
    private Environment env;
	
	@Bean(name = "student")
	public Student student()
	{
		Student student = new Student();
		student.setName("Zara");
		student.setAge(11);
		return student;
	}
	
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
        return dataSource;
    }
	
	@Bean(name = "studentJDBCTemplate")
    public StudentJDBCTemplate studentJDBCTemplate(DataSource dataSource) {
        StudentJDBCTemplate studentJDBCTemplate = new StudentJDBCTemplate();
        try {
			System.out.println(dataSource.getLoginTimeout());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        studentJDBCTemplate.setDataSource(dataSource);
        return studentJDBCTemplate;
    }
}
