package com.qa.accountApp;

public interface AccountRepository {
	
public void add(Account account);

public Account retrieve(int id);

public Account updateFirstName(int id, String firstName);

public void remove(int id);


}
