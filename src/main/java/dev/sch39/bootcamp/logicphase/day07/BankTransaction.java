package dev.sch39.bootcamp.logicphase.day07;

import dev.sch39.bootcamp.logicphase.day07.exceptions.BankTransactionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BankTransaction {
  private Double balance = 0.0;
  private Integer pin;
  private int wrongPinCounter = 0;
  private List<HashMap<String, Object>> bankDb = new ArrayList<>();
  private List<HashMap<String, Object>> users = new ArrayList<>();

  public BankTransaction(Integer pin) {
    this.pin = pin;
  }

  public Double getBalance() {
    return this.balance;
  }

  public void addBalance(Double nominal) {
    this.balance += nominal;
  }

  public Boolean checkPin(Integer pin) throws BankTransactionException {
    if (pin.toString().length() != 6) {
      throw new BankTransactionException("Pin length should 6 digits");
    }

    if (!this.pin.equals(pin)) {
      if (this.wrongPinCounter <= 4) {
        this.wrongPinCounter++;
      }
      return false;
    }
    return true;
  }

  public Integer getWrongPinCounter() {
    return this.wrongPinCounter;
  }

  public void addBankDb(HashMap<String, Object> data) {
    this.bankDb.add(data);
  }

  public Object getCharge(Integer bankCode) throws BankTransactionException {
    for (HashMap<String, Object> hashMap : bankDb) {
      if (hashMap.get("bank_code").equals(bankCode)) {
        return hashMap.get("charge");
      }
    }
    throw new BankTransactionException("Bank code not found!");
  }

  public void addUser(HashMap<String, Object> user) {
    this.users.add(user);
  }

  public HashMap<String, Object> getUserData(String norek, int bankCode) throws BankTransactionException {
    for (HashMap<String, Object> hashMap : users) {
      if (hashMap.get("no_rekening").equals(norek) && hashMap.get("bank_code").equals(bankCode)) {
        return hashMap;
      }
    }
    throw new BankTransactionException("Rekening tujuan tidak ditemukan!");
  }

}
