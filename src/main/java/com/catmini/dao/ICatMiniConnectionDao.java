package com.catmini.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public interface ICatMiniConnectionDao {
	
	//contains all triparty funds count
	public void doGetTripartyFundsCount();
	
	//contains all funds count incluing triparty
	public void doGetAllFundsTransactionCount();
	
	//contains funds count excluding all funds count
	public void doGetFundsTransactionExcludingTriparty();
	
	public void doGetContraCount();
	
	public void doGetAccountCount(JdbcTemplate jdbcTemplate);
	
	public void doGetAccountCountGroupByAccountType(JdbcTemplate jdbcTemplate);
	
	public void doGetClrInstIdCount();
}
