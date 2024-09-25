package logicphase.exercises.day08.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import logicphase.exercises.day08.BankTransaction;
import logicphase.exercises.day08.exceptions.BankTransactionException;

public class BankTransactionTest {
  @Test
  public void it_should_set_and_return_correct_balance() {
    BankTransaction myAccount = new BankTransaction(123456);
    assertEquals((Double) 0.0, myAccount.getBalance());
    myAccount.addBalance(2500.0);
    assertEquals((Double) 2500.0, myAccount.getBalance());
  }

  @Test
  public void it_should_check_pin_when_pin_length_6() throws BankTransactionException {
    BankTransaction myAccount = new BankTransaction(123456);
    assertTrue(myAccount.checkPin(123456));
    assertFalse(myAccount.checkPin(123455));
  }

  @Test
  public void it_should_throw_error_when_pin_length_not_6() throws BankTransactionException {
    BankTransaction myAccount = new BankTransaction(123456);
    assertThrows(BankTransactionException.class, () -> {
      myAccount.checkPin(12345);
    });
    assertThrows(BankTransactionException.class, () -> {
      myAccount.checkPin(1234567);
    });
  }

  @Test
  public void it_should_get_correct_charge_when_code_bank_input() throws BankTransactionException {
    BankTransaction myAccount = new BankTransaction(123456);
    myAccount.addBankDb(new HashMap<>() {
      {
        put("bank_code", 001);
        put("charge", 7500);
      }
    });
    myAccount.addBankDb(new HashMap<>() {
      {
        put("bank_code", 002);
        put("charge", 5500);
      }
    });

    assertEquals(7500, myAccount.getCharge(001));
    assertEquals(5500, myAccount.getCharge(002));
  }

  @Test
  public void it_should_throw_error_when_bank_code_not_found() {
    BankTransaction myAccount = new BankTransaction(123456);
    myAccount.addBankDb(new HashMap<>() {
      {
        put("bank_code", 001);
        put("charge", 7500);
      }
    });

    assertThrows(BankTransactionException.class, () -> {
      myAccount.getCharge(002);
    });
  }
}
