package com.qa.accountApp;

public interface AccountRepository {

	public void add(Account account);

	public Account retrieve(Integer id);

}
