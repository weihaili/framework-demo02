package cn.kkl.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.kkl.pojo.User;
@Repository
public class UserDao {
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	/**
	 * 新增
	 * @param user
	 */
	public void add(User user) {
		System.out.println("******UserDao.add()******");
		hibernateTemplate.save(user);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
