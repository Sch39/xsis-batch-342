package logicphase.exercises.day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FoodPortion {
  public static Double getTotalPortion(Map<String, Integer> persons) {
    Double totalFood = 0.0;
    for (Map.Entry<String, Integer> entry : persons.entrySet()) {
      totalFood += getPortions(entry.getKey(), entry.getValue());
    }
    Integer totalPerson = countTotalPerson(persons);
    if (totalPerson % 2 == 1
        && totalPerson > 5) {
      totalFood += countAdultFemale(persons);
    }
    return totalFood;
  }

  private static Integer countTotalPerson(Map<String, Integer> portions) {
    Integer totalPerson = 0;
    for (Map.Entry<String, Integer> entry : portions.entrySet()) {
      totalPerson += entry.getValue();
    }
    return totalPerson;
  }

  private static Integer countAdultFemale(Map<String, Integer> portions) {
    Integer totalPerson = 0;
    for (Map.Entry<String, Integer> entry : portions.entrySet()) {
      if (entry.getKey().equals("adult_female")) {
        totalPerson += entry.getValue();
      }
    }
    return totalPerson;
  }

  public static Double getPortions(String person, Integer portion) {
    Map<String, Double> portionRatio = new HashMap<>() {
      {
        put("adult_man", 2.0);
        put("adult_female", 1.0);
        put("teenager", 1.5);
        put("children", 0.5);
        put("toddler", 1.0);
      }
    };
    if (!portionRatio.containsKey(person)) {
      return 0.0;
    }
    return portionRatio.get(person) * portion;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> persons = new HashMap<>();
    List<String> portionRation = new ArrayList<>(
        List.of("adult_man", "adult_female", "teenager", "children", "toddler"));
    List<String> choiceList = new ArrayList<>() {
      {
        add("y");
        add("c");
        add("x");
      }
    };

    while (true) {
      Integer personType;
      while (true) {
        System.out.println("==== Pilih orang ====");
        System.out.println("[0:adult_man, 1:adult_female, 2:teenager, 3:children, 4:toddler]=> ");
        try {
          personType = scanner.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Input tidak valid");
          scanner.nextLine();
          continue;
        }
      }

      if (personType >= portionRation.size()) {
        System.out.println("Pilihan tidak tersedia");
        continue;
      }
      Integer personCount;
      while (true) {
        System.out.println("Masukan jumlah orang: ");
        try {
          personCount = scanner.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Input tidak valid");
          scanner.nextLine();
          continue;
        }
      }

      String selectedChoice;

      while (true) {
        System.out.println("Lanjutkan menginput data? [y: lanjut, c: hitung porsi, x: keluar program]");
        selectedChoice = scanner.next().toLowerCase();
        if (choiceList.contains(selectedChoice)) {
          break;
        }
        System.out.println("Input tidak valid");
        scanner.nextLine();
      }

      if (persons.containsKey(portionRation.get(personType))) {
        persons.put(portionRation.get(personType), persons.get(portionRation.get(personType)) + personCount);
      } else {
        persons.put(portionRation.get(personType), personCount);
      }

      if (selectedChoice.equals("y")) {
        continue;
      } else if (selectedChoice.equals("c")) {
        System.out.println("########## Hasil ##########");
        System.out.println("Jumlah porsi: " + getTotalPortion(persons) + "\n");
        persons.clear();
        continue;
      } else if (selectedChoice.equals("x")) {
        System.out.println("Keluar program");
        break;
      } else {
        System.out.println("Pilihan tidak tersedia");
      }
    }
    scanner.close();
  }
}
