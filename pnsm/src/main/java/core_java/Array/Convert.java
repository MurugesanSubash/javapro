package core_java.Array;

import java.util.Arrays;

public class Convert {   
public static void main(String[] args) {
 int S [] [] = {{0,1,2},{2,4,6}};
// [ 1 2 6 4 0 2 ]
int A[] = new int [6];
int row = 0;
int col = 1;
int in = 0;
 for(;col<=2;col++){
    A[in]=S[row][col];
    in++;
 }
col--;
row++;
for(;col>=1;col--){
    A[in]=S[row][col];
    in++;
}
row--;
for(;row<2;row++){
    A[in]=S[row][col];
    in++;
}
 System.out.println(Arrays.toString(A));
} 
}