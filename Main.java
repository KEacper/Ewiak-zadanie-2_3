import java.util.Scanner;
import java.lang.*;
import java.util.*;


class Main {

 
  public static void main(String[] args) {
  
 Scanner scan = new Scanner(System.in);
 System.out.println("Średnia losowyh liczb");
    int tablica[]= new int[10];
    for(int i=0;i<10;i++){
      int min=0;
        int max=100;
    int element= (int)Math.floor(Math.random()*(max-min+1)+min);
      tablica[i]= element;
      }
    int suma = 0;
          for(int i=0; i<10; i++){
          
       suma = suma+tablica[i];
            }
    int srednia = suma/10;
    System.out.println("średnia to"+srednia);
     
  }
}