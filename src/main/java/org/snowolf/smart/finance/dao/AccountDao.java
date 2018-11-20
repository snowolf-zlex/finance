/**
 * 
 */
package org.snowolf.smart.finance.dao;

import org.apache.ibatis.annotations.Mapper;
import org.snowolf.smart.finance.domain.Account;

/**
 * @author snowolf
 *
 */
@Mapper
public interface AccountDao {
	public Account read(long id);

	public void update(Account account);

	public void create(Account account);

	public void delete(long id);

}
