package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount{

    private BigDecimal cashBalance;

    public BigDecimal getCashBalance() {
        return this.cashBalance;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    // CONSTRUCTOR
    
    public CashAccount(String id, BigDecimal cashBalance) {
        super(id);
        this.setCashBalance(cashBalance);
    }

    @Override
    public TradeAccount clone() {
        return new CashAccount(super.getId(), this.cashBalance);
    }



}
