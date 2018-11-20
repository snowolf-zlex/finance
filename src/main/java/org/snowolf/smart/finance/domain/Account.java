/**
 * 
 */
package org.snowolf.smart.finance.domain;

import java.io.Serializable;

/**
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -533698031946372178L;

	private long id;
	private String username;
	private String password;

	public long getId() {
		return id;
	}

	public void set(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
