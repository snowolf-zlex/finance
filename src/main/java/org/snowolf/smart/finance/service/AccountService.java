/**
 * 
 */
package org.snowolf.smart.finance.service;

import org.snowolf.smart.finance.domain.Account;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * @author snowolf
 *
 */
@Component
@EnableAutoConfiguration
public interface AccountService {

	public Account readById(long id);

	public void changePassword(long id, String password);
}
