package com.catmini.dao;

public final class CatMiniSqlQueries {
	//Here all are active because the result of these queries will never fetch inactive members from DB
	
	public final static String totalCountOfAcounts = "select count(*) as count from t_pkr_acct";
	
	public final static String totalCountOfAccountsBasedOnAcctType = "select count(*) as count,ACCT_TYPE from t_pkr_acct group by ACCT_TYPE";
	
	public final static String totalCountOfAccountsBasedOnEngines = "select count(*) as count,ENGN_NO from T_PKR_ACCT group by ENGN_NO";
	
	public final static String totalCountOfAccountsBasedOnHolders = "";
	
	public final static String totalCountOfContrasBasedOnCtraType = "select count(*) as count,CTRA_TYPE from T_PKR_CTRA group by CTRA_TYPE";
	
	public final static String totalFundsTransactionsIncludingTriparty = "";
	
	public final static String totalFundsTransactionsExcludingTriparty = "";
	
	public final static String totalTripartyFundsTransactionCount = "";
}