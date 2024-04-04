package core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Methods{
static Scanner scan = new Scanner(System.in);

public static void insert(String Location []){
    System.out.println("You need to enter 3 places names here...!");
    int c=1;
    for(int i = 0;i<3;i++){
        System.out.println("<< Enter the "+c+" place name >>");
        String input = scan.next();
        Location[i] = input;
        c++;} 
}
public static void List(String Listing[]){
    System.out.println("<<< List of the place >>>");
    for(int i = 0;i<3;i++){
      System.out.println(Listing[i]);
    }
}
public static void Update (String Updates[]){

    System.out.println("<< Which name you need to upadate (1,2,3) >>");
    int u = scan.nextInt()-1;
    System.out.println("<< Enter the new name >>");
    String b = scan.next();
    Updates[u]=b;
    System.out.println("<< The update list is "+Arrays.toString(Updates));
}
public void Reading (String Read[]){
System.out.println("<< PLEASE THE NUMBER IN BETWEEN 1-3 >>");
int o = scan.nextInt()-1;
System.out.println("The place name is "+Read[o]);
}
public static void main(String[] args) {
    Array_Methods obj = new Array_Methods();
    String Place[] = new String[3];
for(;;){
    System.out.println("<< Choose the below option \n 1.Insert \n 2.List \n 3.Update \n 4.Read");
    int option = scan.nextInt();
    switch (option) {
        case 1:
            insert(Place);
            System.out.println("<< Name of the Add place "+Arrays.toString(Place));
            break;
        case 2:
           List(Place);
            break;
        case 3:
            Update(Place);
            List(Place);
             break;  
        case 4:
           obj.Reading(Place); 
           break;
        default:System.out.println("Sorry....! Time waste");       
    }
} } }
