package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto {
    private String clientId;
    private String id;
    private String status;
    private String accountType;
    private String currencyIsoCode;
    private BigDecimal interestRate;
    private BigDecimal actualInterestRate;
    private String openDate;
    private String closeDate;
    private BalanceDto balance;
    private BigDecimal accuredInterest;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getActualInterestRate() {
        return actualInterestRate;
    }

    public void setActualInterestRate(BigDecimal actualInterestRate) {
        this.actualInterestRate = actualInterestRate;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public BalanceDto getBalance() {
        return balance;
    }

    public void setBalance(BalanceDto balance) {
        this.balance = balance;
    }

    public BigDecimal getAccuredInterest() {
        return accuredInterest;
    }

    public void setAccuredInterest(BigDecimal accuredInterest) {
        this.accuredInterest = accuredInterest;
    }
}
