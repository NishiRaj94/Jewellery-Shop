package com.net.ShoppingBackend.config;

import java.util.Properties;


import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.net.ShoppingBackend.model.BillingAddress;
import com.net.ShoppingBackend.model.Category;
import com.net.ShoppingBackend.model.Product;
import com.net.ShoppingBackend.model.ShippingAddress;
import com.net.ShoppingBackend.model.Supplier;
import com.net.ShoppingBackend.model.User;



@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.net.ShoppingBackend")
public class HibernateConfig {
	@Bean("dataSource")
	public DataSource getDataBase(){

		BasicDataSource driverMgr=new BasicDataSource();
		driverMgr.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		driverMgr.setPassword("kh");
		driverMgr.setUsername("kh");
		driverMgr.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		/*driverMgr.setDriverClassName("org.h2.Driver");
		driverMgr.setPassword("sa");
		driverMgr.setUsername("sa");
		driverMgr.setUrl("jdbc:h2:tcp://localhost/~/shop");
		*/
		return driverMgr;
	}
		public Properties getHibernateProperties(){
	Properties properties=new Properties();
	properties.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
	//properties.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	properties.setProperty("hibernate.show_sql","true");
	properties.setProperty("hibernate.hbm2ddl.auto","update");
	return properties;
}
		
@Autowired
@Bean("sessionFactory")
public SessionFactory getSessionFactory(DataSource dataSource)
{
	LocalSessionFactoryBuilder sessionFactory=new 
			LocalSessionFactoryBuilder(dataSource);
	sessionFactory.addAnnotatedClass(Category.class);
	sessionFactory.addAnnotatedClass(Supplier.class);
	sessionFactory.addAnnotatedClass(User.class);
	sessionFactory.addAnnotatedClass(Product.class);
	sessionFactory.addAnnotatedClass(ShippingAddress.class);
	sessionFactory.addAnnotatedClass(BillingAddress.class);
	sessionFactory.addProperties(getHibernateProperties());
	
	return sessionFactory.buildSessionFactory();
}
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
 		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

		return transactionManager;
	}

}

