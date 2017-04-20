package com.ttb.service.taxburden.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TaxPayerProfile {

	private String taxPayerProfileKey;
	private Date timestamp;
	private String postalCode;
	private List<String> politicalDivisionKeys;
	private MonetaryAmount annualIncome;
	private MonetaryAmount mortgageInterest;

	/**
	 * 
	 */
	public TaxPayerProfile() {
		super();
		this.timestamp = new Date();
		this.taxPayerProfileKey = UUID.randomUUID().toString();
	}

	/**
	 * @param taxPayerProfileKey
	 * @param timestamp
	 * @param postalCode
	 * @param politicalDivisionKeys
	 * @param annualIncome
	 * @param mortgageInterest
	 */
	public TaxPayerProfile(String postalCode, List<String> politicalDivisionKeys, MonetaryAmount annualIncome, MonetaryAmount mortgageInterest) {
		super();
		this.timestamp = new Date();
		this.taxPayerProfileKey = UUID.randomUUID().toString();
		this.postalCode = postalCode;
		this.politicalDivisionKeys = politicalDivisionKeys;
		this.annualIncome = annualIncome;
		this.mortgageInterest = mortgageInterest;
	}

	/**
	 * @param taxPayerProfileKey
	 * @param timestamp
	 * @param postalCode
	 * @param politicalDivisionKeys
	 * @param annualIncome
	 * @param mortgageInterest
	 */
	public TaxPayerProfile(String taxPayerProfileKey, Date timestamp, String postalCode,
			List<String> politicalDivisionKeys, MonetaryAmount annualIncome, MonetaryAmount mortgageInterest) {
		super();
		if (taxPayerProfileKey == null) {
			this.taxPayerProfileKey = UUID.randomUUID().toString();
		} else {
			this.taxPayerProfileKey = taxPayerProfileKey;
		}
		if (timestamp == null) {
			this.timestamp = new Date();
		} else {
			this.timestamp = timestamp;
		}
		this.postalCode = postalCode;
		this.politicalDivisionKeys = politicalDivisionKeys;
		this.annualIncome = annualIncome;
		this.mortgageInterest = mortgageInterest;
	}

	/**
	 * @return the taxPayerProfileKey
	 */
	public String getTaxPayerProfileKey() {
		return taxPayerProfileKey;
	}

	/**
	 * @param taxPayerProfileKey the taxPayerProfileKey to set
	 */
	public void setTaxPayerProfileKey(String taxPayerProfileKey) {
		this.taxPayerProfileKey = taxPayerProfileKey;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the politicalDivisionKeys
	 */
	public List<String> getPoliticalDivisionKeys() {
		return politicalDivisionKeys;
	}

	/**
	 * @param politicalDivisionKeys the politicalDivisionKeys to set
	 */
	public void setPoliticalDivisionKeys(List<String> politicalDivisionKeys) {
		this.politicalDivisionKeys = politicalDivisionKeys;
	}

	/**
	 * @return the annualIncome
	 */
	public MonetaryAmount getAnnualIncome() {
		return annualIncome;
	}

	/**
	 * @param annualIncome the annualIncome to set
	 */
	public void setAnnualIncome(MonetaryAmount annualIncome) {
		this.annualIncome = annualIncome;
	}

	/**
	 * @return the mortgageInterest
	 */
	public MonetaryAmount getMortgageInterest() {
		return mortgageInterest;
	}

	/**
	 * @param mortgageInterest the mortgageInterest to set
	 */
	public void setMortgageInterest(MonetaryAmount mortgageInterest) {
		this.mortgageInterest = mortgageInterest;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annualIncome == null) ? 0 : annualIncome.hashCode());
		result = prime * result + ((mortgageInterest == null) ? 0 : mortgageInterest.hashCode());
		result = prime * result + ((politicalDivisionKeys == null) ? 0 : politicalDivisionKeys.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((taxPayerProfileKey == null) ? 0 : taxPayerProfileKey.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxPayerProfile other = (TaxPayerProfile) obj;
		if (annualIncome == null) {
			if (other.annualIncome != null)
				return false;
		} else if (!annualIncome.equals(other.annualIncome))
			return false;
		if (mortgageInterest == null) {
			if (other.mortgageInterest != null)
				return false;
		} else if (!mortgageInterest.equals(other.mortgageInterest))
			return false;
		if (politicalDivisionKeys == null) {
			if (other.politicalDivisionKeys != null)
				return false;
		} else if (!politicalDivisionKeys.equals(other.politicalDivisionKeys))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (taxPayerProfileKey == null) {
			if (other.taxPayerProfileKey != null)
				return false;
		} else if (!taxPayerProfileKey.equals(other.taxPayerProfileKey))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TaxPayerProfile [taxPayerProfileKey=" + taxPayerProfileKey + ", timestamp=" + timestamp
				+ ", postalCode=" + postalCode + ", politicalDivisionKeys=" + politicalDivisionKeys + ", annualIncome="
				+ annualIncome + ", mortgageInterest=" + mortgageInterest + "]";
	}

}
