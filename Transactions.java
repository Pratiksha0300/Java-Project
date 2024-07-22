package com.transactions;

public class Transactions {
	public static void main(String[] args) {
		AccountDao objAccountDao = new AccountDao();
		System.out.println("Choose from below options:");

		for (;;) {
			System.out.println(
					"1.Create Account 2.Add Amount 3.Search Account 4.Withdraw Amount 5.Balance Enquiry 6.Edit Account 7.Exit");
			int choice = objAccountDao.scanner.nextInt();

			switch (choice) {
			case 1: {
				objAccountDao.createAccount();
				break;
			}
			case 2: {
				objAccountDao.addAmount();
				break;
			}

			case 3: {
				objAccountDao.searchAccount();
				break;
			}

			case 4: {
				objAccountDao.withdrawAmount();
				break;
			}

			case 5: {
				objAccountDao.balanceEnquiry();
				break;
			}
			case 6: {
				objAccountDao.editAccount();
				break;
			}

			case 7: {
                System.exit(choice);
			}

			}
		}
	}
}
