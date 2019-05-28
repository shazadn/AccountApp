package com.qa.accountApp;

import java.util.HashMap;

public class AccountRepositorymap {
	public HashMap<Integer, Account> map = new HashMap<Integer, Account>();
	
	public void add(Account account) {
			map.put(account.getId(), account);
		}
	
	public Account retrieve(Integer id) {
		return map.get(id);
	}
	
}
