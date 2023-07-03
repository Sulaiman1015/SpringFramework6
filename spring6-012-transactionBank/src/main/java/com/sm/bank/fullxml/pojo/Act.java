package com.sm.bank.fullxml.pojo;

public class Act {
    private String actno;
    private Double balance;

    public Act() {
    }

    public Act(String actno, Double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    /**
     * get
     * @return actno
     */
    public String getActno() {
        return actno;
    }

    /**
     * set
     * @param actno
     */
    public void setActno(String actno) {
        this.actno = actno;
    }

    /**
     * get
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * set
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Act{actno = " + actno + ", balance = " + balance + "}";
    }
}
