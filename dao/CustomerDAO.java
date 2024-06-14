package dao;

import java.util.List;

//import java.util.List;

import dao.bean.CustomerBean;
import dao.bean.TransactionBean;
import exception.CustomerException;

public interface CustomerDAO {
	
	public CustomerBean LoginCustomer(String username, String password, int accountno)throws CustomerException; 
	
	public int viewBalance(int cACno) throws CustomerException;
	
	public int Deposit(int cACno, int amount) throws CustomerException; 
	
	public int Withdraw(int cACno, int amount) throws CustomerException;
	
	public int Transfer(int cACno, int amount, int cACno2) throws CustomerException; 
	
	public List<TransactionBean> viewTransaction(int cACno) throws CustomerException;
	
}