package edu.cnm.deepdive;   // Matthew Jones, Brian Alexander, Dylon Vance

public class Summing {

  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++){

      sum = sum + i;
    }

    System.out.printf("The sum of 1 to 100 is " + sum);
  }


}
