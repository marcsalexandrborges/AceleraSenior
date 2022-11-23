
package br.atos.api_crud_analista.data;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


public class DataConfiguration {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driveBanco = new DriverManagerDataSource();
		driveBanco.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driveBanco.setUrl("jdbc:mysql://bml8wyhdlfjqowt3gukd-mysql.services.clever-cloud.com/bml8wyhdlfjqowt3gukd");
		driveBanco.setUsername("uviftz1zyipjtuap");
		driveBanco.setPassword("1jXz6C9FBRKQo2HGi8Vx");
		return driveBanco;
		
	}
	@Bean // Parametros do Hibernate
	public JpaVendorAdapter jpaVendorAdapter() {
		
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.POSTGRESQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
		adapter.setPrepareConnection(true);
	
		
		return adapter;
	}

}
