package com.catmini.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class CatMiniDataConnectionImpl implements ICatMiniConnectionDao {
	
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void doGetTripartyFundsCount() {
		
	}

	@Override
	public void doGetAllFundsTransactionCount() {
		
	}

	@Override
	public void doGetFundsTransactionExcludingTriparty() {
		
	}

	@Override
	public void doGetContraCount() {
		
	}

	@Override
	public void doGetAccountCount(JdbcTemplate jdbcTemplate) {
		String allAccountQueries = CatMiniSqlQueries.totalCountOfAcounts;
		int countAccount = jdbcTemplate.queryForObject(allAccountQueries,null,Integer.class);
		System.out.println(countAccount);
	}

	@Override
	public void doGetClrInstIdCount() {
		
	}

	@Override
	public void doGetAccountCountGroupByAccountType(JdbcTemplate jdbcTemplate) {
		String accountCountQueryGroupByAcctType = CatMiniSqlQueries.totalCountOfAccountsBasedOnAcctType;
		List<Map<String, Object>> values = jdbcTemplate.queryForList(accountCountQueryGroupByAcctType);
		System.out.println(values);
	}
	
	
}
