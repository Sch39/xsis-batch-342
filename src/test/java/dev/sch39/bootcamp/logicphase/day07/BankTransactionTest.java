package dev.sch39.bootcamp.logicphase.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import dev.sch39.bootcamp.logicphase.day07.exceptions.BankTransactionException;
import java.util.HashMap;

@Tag("day07")
public class BankTransactionTest {
  private BankTransaction bankTransaction;

  @BeforeEach
  void setUp() {
    // Inisialisasi BankTransaction dengan PIN 123456
    bankTransaction = new BankTransaction(123456);
  }

  @Test
  void testGetBalance() {
    // Default balance harus 0.0
    assertEquals(0.0, bankTransaction.getBalance());
  }

  @Test
  void testAddBalance() {
    bankTransaction.addBalance(100.0);
    assertEquals(100.0, bankTransaction.getBalance());

    bankTransaction.addBalance(50.0);
    assertEquals(150.0, bankTransaction.getBalance());
  }

  @Test
  void testCheckPinValid() throws BankTransactionException {
    // Memeriksa apakah PIN valid
    assertTrue(bankTransaction.checkPin(123456));
  }

  @Test
  void testCheckPinInvalid() throws BankTransactionException {
    // Memeriksa apakah PIN invalid
    assertFalse(bankTransaction.checkPin(654321));
    assertEquals(1, bankTransaction.getWrongPinCounter());

    // Mencoba 4 kali lagi hingga mencapai batas maksimal kesalahan
    bankTransaction.checkPin(654321);
    bankTransaction.checkPin(654321);
    bankTransaction.checkPin(654321);
    bankTransaction.checkPin(654321);
    assertEquals(5, bankTransaction.getWrongPinCounter());
  }

  @Test
  void testCheckPinLengthException() {
    // Memeriksa pengecualian jika panjang PIN tidak valid
    BankTransactionException exception = assertThrows(BankTransactionException.class,
        () -> bankTransaction.checkPin(12345));
    assertEquals("Pin length should 6 digits", exception.getMessage());
  }

  @Test
  void testAddBankDbAndGetCharge() throws BankTransactionException {
    // Menambahkan data bank
    HashMap<String, Object> bankData = new HashMap<>();
    bankData.put("bank_code", 123);
    bankData.put("charge", 5000);
    bankTransaction.addBankDb(bankData);

    // Memeriksa biaya berdasarkan kode bank
    assertEquals(5000, bankTransaction.getCharge(123));
  }

  @Test
  void testGetChargeBankNotFound() {
    // Memeriksa pengecualian jika kode bank tidak ditemukan
    BankTransactionException exception = assertThrows(BankTransactionException.class,
        () -> bankTransaction.getCharge(999));
    assertEquals("Bank code not found!", exception.getMessage());
  }

  @Test
  void testAddUserAndGetUserData() throws BankTransactionException {
    // Menambahkan data pengguna
    HashMap<String, Object> user = new HashMap<>();
    user.put("no_rekening", "123456789");
    user.put("bank_code", 123);
    user.put("name", "John Doe");
    bankTransaction.addUser(user);

    // Memeriksa data pengguna berdasarkan nomor rekening dan kode bank
    HashMap<String, Object> userData = bankTransaction.getUserData("123456789", 123);
    assertEquals("John Doe", userData.get("name"));
  }

  @Test
  void testGetUserDataRekeningNotFound() {
    // Memeriksa pengecualian jika rekening tidak ditemukan
    BankTransactionException exception = assertThrows(BankTransactionException.class,
        () -> bankTransaction.getUserData("987654321", 123));
    assertEquals("Rekening tujuan tidak ditemukan!", exception.getMessage());
  }

}
