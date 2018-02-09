package org.bibin.onlineshoppingbackend.config;

import java.util.Properties;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "org.bibin.onlineshoppingbase.dto" })
@EnableTransactionManagement
public class HiberConfig {

	private final String DB_URL = "jdbc:h2:tcp://localhost/~/onlineshopping";
	private final String DB_DRIVER = "org.h2.Driver";
	private final String DB_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final String DB_USER = "system";
	private final String DB_PASSWORD = "bibin";

	// providing data connection
	@Bean
	public DataSource getDataSources() {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(DB_DRIVER);
		datasource.setUrl(DB_URL);
		datasource.setUsername(DB_USER);
		datasource.setPassword(DB_PASSWORD);

		return datasource;
	}

	// session bean

	@Bean
	public SessionFactory getSessionFactory(DataSource datasource) {
		LocalSessionFactoryBuilder build = new LocalSessionFactoryBuilder(datasource);

		build.addProperties(getHibernateProperties());

		build.scanPackages("org.bibin.onlineshoppingbase.dto");

		return build.buildSessionFactory();
	}

	// to get hibernate properties values
	private Properties getHibernateProperties() {

		Properties prop = new Properties();
		prop.put("hibernate.dialect", DB_DIALECT);

		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.format_sql", "true");

		return null;
	}

	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory factory) {
		
		HibernateTransactionManager transm=new HibernateTransactionManager(factory);
		
		
		return transm;

	}
}
