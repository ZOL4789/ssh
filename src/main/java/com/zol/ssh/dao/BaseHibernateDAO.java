package com.zol.ssh.dao;

import com.zol.ssh.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Data access object (DAO) for domain model
 * 
 */
public class BaseHibernateDAO {	
	public Session getSession() {
		return HibernateUtil.getSession();
	}	
	public void closeSession(){
		HibernateUtil.closeSession();
	}	
}