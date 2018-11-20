/**
 * 
 */
package org.snowolf.smart.finance.controller;

import org.snowolf.smart.finance.domain.Account;
import org.snowolf.smart.finance.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author snowolf
 *
 */
@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@GetMapping("getAccount")
	public Account getAccountById(@RequestParam("id") long id) {
		return accountService.readById(id);
	}
}
