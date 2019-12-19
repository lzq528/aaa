package com.woniu.pojo;
// Generated 2019-12-19 19:49:17 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private Integer rid;
	private String rname;
	private Set<User> users = new HashSet<User>();

	public Role() {
	}

	public Role(String rname) {
		this.rname = rname;
	}

	public Role(String rname, Set<User> users) {
		this.rname = rname;
		this.users = users;
	}

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
