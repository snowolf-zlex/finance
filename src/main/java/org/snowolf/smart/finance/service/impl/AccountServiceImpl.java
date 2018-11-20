/**
 * 
 */
package org.snowolf.smart.finance.service.impl;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.snowolf.smart.finance.dao.AccountDao;
import org.snowolf.smart.finance.domain.Account;
import org.snowolf.smart.finance.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author snowolf
 *
 */
@Service
//(value = "accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

	@Resource // (name = "accountDao")
	private AccountDao accountDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.snowolf.smart.finance.service.AccountService#readById(long)
	 */
	@Override
	public Account readById(long id) {
		return accountDao.read(id);
	}

	@Override
	public void changePassword(long id, String password) {
		Account account = accountDao.read(id);
		account.setPassword(DigestUtils.md5Hex(password));
	}

}
