package dev.sch39.bootcamp.logicphase.day07;

import dev.sch39.bootcamp.logicphase.day07.exceptions.BankTransactionException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BankTransaction myAccount = new BankTransaction(123456);

    myAccount.addBalance(20_000.0);

    // Adding bank data
    myAccount.addBankDb(new HashMap<>() {
      {
        put("bank_name", "BCA");
        put("bank_code", 001);
        put("charge", 7500.0);
      }
    });
    myAccount.addBankDb(new HashMap<>() {
      {
        put("bank_name", "Jago");
        put("bank_code", 002);
        put("charge", 5500.0);
      }
    });
    myAccount.addBankDb(new HashMap<>() {
      {
        put("bank_name", "BRI");
        put("bank_code", 003);
        put("charge", 0.0);
      }
    });

    // Adding user data
    myAccount.addUser(new HashMap<>() {
      {
        put("bank_code", 001);
        put("name", "Gojo Saru");
        put("no_rekening", "1234567890");
      }
    });
    myAccount.addUser(new HashMap<>() {
      {
        put("bank_code", 002);
        put("name", "Itachi Uciha");
        put("no_rekening", "1122334455");
      }
    });
    myAccount.addUser(new HashMap<>() {
      {
        put("bank_code", 003);
        put("name", "Saskeh");
        put("no_rekening", "1231231234");
      }
    });

    Boolean pinChecked = false;

    outerloop: while (true) {
      Integer inputPin;
      if (!pinChecked) {
        while (true) {
          System.out.println("Masukan Pin anda: ");
          try {
            inputPin = scanner.nextInt();
            pinChecked = myAccount.checkPin(inputPin);
            if (pinChecked) {
              break;
            }
          } catch (BankTransactionException e) {
            System.out.println(e.getMessage());
          } catch (Exception e) {
            System.out.println("Pin invalid/salah");
          }
          if (myAccount.getWrongPinCounter() >= 3) {
            System.out.println("Akun anda diblokir!");
            break outerloop;
          }
          scanner.nextLine();
        }
      }

      String selectedMenu;
      while (true) {
        System.out.println("===== Menu =====");
        System.out.println("1: Cek Saldo");
        System.out.println("2: Transfer Antar Rekening");
        System.out.println("3: Transfer Antar Bank");
        System.out.println("4: Setor Tunai");
        System.out.println("x: Keluar");
        selectedMenu = scanner.next().trim().toLowerCase();

        if (selectedMenu.equals("1")
            || selectedMenu.equals("2")
            || selectedMenu.equals("3")
            || selectedMenu.equals("4")) {
          break;
        } else if (selectedMenu.equals("x")) {
          System.out.println("\n==== Terima kasih telah menggunakan layanan kami ====");
          break outerloop;
        }
        System.out.println("Pilihan tidak tersedia");
        scanner.nextLine();
      }

      if (selectedMenu.equals("1")) {
        System.out.println("Saldo anda: Rp " + myAccount.getBalance());

      } else if (selectedMenu.equals("2")) {
        String norekTarget;
        Double nominal;
        Integer bankCode = 003;
        HashMap<String, Object> userData;
        Double charge;

        try {
          charge = (Double) myAccount.getCharge(bankCode);
        } catch (BankTransactionException e) {
          System.out.println(e.getMessage());
          continue;
        }
        scanner.nextLine();

        while (true) {
          System.out.println("Masukan nomer rekening tujuan: ");
          try {
            norekTarget = scanner.nextLine();
            userData = myAccount.getUserData(norekTarget, bankCode);
            break;
          } catch (BankTransactionException e) {
            System.out.println(e.getMessage());
          } catch (Exception e) {
            System.out.println("Input tidak valid");
          }
        }

        while (true) {
          System.out.println("Masukan nominal transfer");
          try {
            nominal = scanner.nextDouble();
            break;
          } catch (Exception e) {
            System.out.println("Input tidak valid");
          }
          scanner.nextLine();
        }

        if (myAccount.getBalance() >= (nominal + charge)) {
          myAccount.addBalance(-nominal);
          myAccount.addBalance(-charge);
          System.out.println("Berhasil memindahkan saldo " + (nominal) + " ke norek. " + userData.get("no_rekening"));
          System.out.println("Atas nama: " + userData.get("name"));
          System.out.println("Biaya transfer: " + charge);
        } else {
          System.out.println("Saldo tidak cukup");
        }

      } else if (selectedMenu.equals("3")) {
        String norekTarget;
        Double nominal;
        Integer bankCode;
        HashMap<String, Object> userData;
        Double charge;

        while (true) {
          System.out.println("Masukan kode bank tujuan: ");
          try {
            bankCode = scanner.nextInt();
            charge = (Double) myAccount.getCharge(bankCode);
            break;
          } catch (BankTransactionException e) {
            System.out.println(e.getMessage());
          } catch (Exception e) {
            System.out.println("Input tidak valid");
          }
          scanner.nextLine();
        }

        scanner.nextLine(); // Clear buffer

        while (true) {
          System.out.println("Masukan nomer rekening tujuan: ");
          try {
            norekTarget = scanner.nextLine();
            userData = myAccount.getUserData(norekTarget, bankCode);
            break;
          } catch (BankTransactionException e) {
            System.out.println(e.getMessage());
          } catch (Exception e) {
            System.out.println("Input tidak valid");
          }
        }

        while (true) {
          System.out.println("Masukan nominal transfer");
          try {
            nominal = scanner.nextDouble();
            break;
          } catch (Exception e) {
            System.out.println("Input tidak valid");
          }
          scanner.nextLine();
        }

        if (myAccount.getBalance() >= (nominal + charge)) {
          myAccount.addBalance(-nominal);
          myAccount.addBalance(-charge);
          System.out.println("Berhasil memindahkan saldo " + (nominal) + " ke norek. " + userData.get("no_rekening"));
          System.out.println("Atas nama: " + userData.get("name"));
          System.out.println("Biaya transfer: " + charge);
        } else {
          System.out.println("Saldo tidak cukup");
        }
      } else if (selectedMenu.equals("4")) {
        Double nominal;
        while (true) {
          System.out.println("Masukan nominal transfer");
          try {
            nominal = scanner.nextDouble();
            break;
          } catch (Exception e) {
            System.out.println("Input tidak valid");
          }
          scanner.nextLine();
        }

        myAccount.addBalance(nominal);
        System.out.println("Berhasil menambahkan saldo: Rp " + nominal + " ke rekening anda.");
        System.out.println("Saldo anda saat ini: " + myAccount.getBalance());
      }
    }
    scanner.close();
  }
}
