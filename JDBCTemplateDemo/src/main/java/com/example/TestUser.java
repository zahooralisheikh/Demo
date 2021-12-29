package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestUser {
	public static void main(String[] args) {

	Resource rs=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(rs);
	UserDAO userDAO=(UserDAO) factory.getBean("userDAO");
	int status = userDAO.saveUser(new User(10,"reyan@gmail.com","12345"));
	System.out.println(status);
}
}
