package Inheritance.Hybrid;

import java.util.Arrays;
import java.util.Scanner;

public class Single_Inheritance {
    
    Scanner scan = new Scanner(System.in);
    public void Number_place_need(){
        System.out.println("<< Please enter how many values you need to use");
        int s = scan.nextInt();
        System.out.println("<< Enter the place name");
        String f[] = new String[s];
        int y= 0;
        for(int i=1;i<=s;i++){
            String d = scan.next();
            f[y]=d;y++;
        }
        System.out.println(Arrays.toString(f));

    }
}
