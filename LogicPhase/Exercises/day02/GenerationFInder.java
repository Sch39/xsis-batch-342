package logicphase.exercises.day02;

public class GenerationFinder {
  /**
   * @param {Integer} year
   * 
   * @return {String}
   */
  public static String getName(Integer year) {
    String name = "";

    if (year <= 1945) {
      name = "The Builders";
    } else if (year <= 1946) {
      name = "Baby Boomers";
    } else if (year <= 1965) {
      name = "Generation X";
    } else if (year <= 1980) {
      name = "Generation Y";
    } else if (year <= 1995) {
      name = "Generation Z";
    } else if (year <= 2010) {
      name = "Generation Alpha";
    } else if (year <= 2025) {
      name = "Generation Beta";
    } else {
      name = "Not defined";
    }

    return name;
  }
}
