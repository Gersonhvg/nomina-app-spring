package com.donlucho.nomina.business;

import java.util.Properties;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.donlucho.nomina.business.entities.Bonificacion;
import com.donlucho.nomina.business.entities.Deduccion;
import com.donlucho.nomina.business.entities.Empleado;
import com.donlucho.nomina.business.entities.Ocupacion;
import com.donlucho.nomina.business.entities.Planilla;
import com.donlucho.nomina.business.entities.Usuario;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@EnableJpaRepositories(basePackages = "com.donlucho.nomina.business.repositories")
@ComponentScan(basePackages = "com.donlucho.nomina.services")

public class NominaBusinessConfig {
	@Autowired
	Environment env;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("db.driver"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.username"));
		ds.setPassword(env.getProperty("db.password"));		
		return ds;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		
		emf.setPackagesToScan(Usuario.class.getPackage().getName());
		emf.setPackagesToScan(Ocupacion.class.getPackage().getName());
		emf.setPackagesToScan(Empleado.class.getPackage().getName());
		emf.setPackagesToScan(Planilla.class.getPackage().getName());
		emf.setPackagesToScan(Deduccion.class.getPackage().getName());
		emf.setPackagesToScan(Bonificacion.class.getPackage().getName());
		
		HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
        hibernateJpa.setDatabase(Database.POSTGRESQL);
        hibernateJpa.setDatabasePlatform(env.getProperty("hibernate.dialect"));
        hibernateJpa.setGenerateDdl(env.getProperty("hibernate.generateDdl", Boolean.class));
        hibernateJpa.setShowSql(env.getProperty("hibernate.show_sql", Boolean.class));       
        emf.setJpaVendorAdapter(hibernateJpa);
        
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        jpaProperties.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
        emf.setJpaProperties(jpaProperties);	        
        return emf;
	}
	
	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager txnMgr = new JpaTransactionManager();
        txnMgr.setEntityManagerFactory(entityManagerFactory().getObject());
        return txnMgr;
	}
}