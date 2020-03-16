package by.htp.account.model;

import java.util.Collections;
import java.util.List;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Bank {
	
	private int lastIdOfAccount;
	
	private int lastIdOfClient;
	
	private List<Client> clients;
	
	private List<Account> accounts;
	
	public Bank(int lastIdOfClient, int lastIdOfAccount,  List<Client> clients, List<Account> accounts) {
		this.lastIdOfClient = lastIdOfClient;
		this.lastIdOfAccount = lastIdOfAccount;
		this.clients = clients;
		this.accounts = accounts;
	}

	public int getLastIdOfAccount() {
		return lastIdOfAccount;
	}

	public void setLastIdOfAccount(int lastIdOfAccount) {
		this.lastIdOfAccount = lastIdOfAccount;
	}

	public int getLastIdOfClient() {
		return lastIdOfClient;
	}

	public void setLastIdOfClient(int lastIdOfClient) {
		this.lastIdOfClient = lastIdOfClient;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addClient(Client client) {
		client.setId(lastIdOfClient++);
		getClients().add(client);
	}
	
	public void addAccount(int idClient, Account account) {
		for (Client c : clients) {
			if(c.getId() == idClient) {
				account.setId(lastIdOfAccount++);
				c.getAccounts().add(account);
				this.accounts.add(account);
				return;
			}
		}
		System.out.println("Неверные данные");
	}
	
	public Account findAccount(int id) {
		for (Account a : accounts) {
			if (a.getId() == id) {
				return a;
			}
		}
		return null;
	}
	
	public void sortAccountById() {
		Collections.sort(accounts);
	}
	
	public int sumAccount() {
		int sum = 0;
		
		for(Account a : accounts) {
			sum = sum + a.getBalance();
		}
		return sum;
	}
	
	public int sumAccountPlus() {
		int sum = 0;
		
		for(Account a : accounts) {
			if(a.getBalance() > 0) {
				sum = sum + a.getBalance();
			}
		}
		return sum;
	}
	
	public int sumAccountMinus() {
		int sum = 0;
		
		for(Account a : accounts) {
			if(a.getBalance() < 0) {
				sum = sum + a.getBalance();
			}
		}
		return sum;
	}
	
	public void depositToAccount(int idAccount, int sum) {
		for (Account a : accounts) {
			if (a.getId() == idAccount) {
				if(!a.isBlocked()) {
					a.setBalance(a.getBalance() + sum);
				} else {
					System.out.println("Счет заблокирован");
				}
				return;
			}
		}
		System.out.println("Счета с таким id нет");
	}
	
	public void withdrawFromAccount(int idAccount, int sum) {
		for (Account a : accounts) {
			if (a.getId() == idAccount) {
				if(!a.isBlocked()) {
					a.setBalance(a.getBalance() - sum);
				} else {
					System.out.println("Счет заблокирован");
				}
				return;
			}
		}
		System.out.println("Счета с таким id нет");
	}
	
	public void block(int idAccount) {
		for (Account a : accounts) {
			if (a.getId() == idAccount) {
				a.setBlocked(true);
				return;
			}
		}
		System.out.println("Счета с таким id нет");
	}
	
	public void unblock(int idAccount) {
		for (Account a : accounts) {
			if (a.getId() == idAccount) {
				a.setBlocked(false);
				return;
			}
		}
		System.out.println("Счета с таким id нет");
	}

}
