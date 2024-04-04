package core_java.Array;

import java.util.Arrays;

public class Jagged {

    public static void main(String[] args) {
        int box [][] = {{55,45,35,25,15},{14,24,34,44,54},{51,41,31,21,11},{12,22,32,42,52}};
        int box1[] = new int[20];
        int index = 0,row=0,col=3;
        System.out.println("<< Two Dimension Array >>");
        for(int [] single:box){
            for(int normal:single){
                System.out.print(normal+" ");
            }System.out.println(" ");}
        for(;col<=4;col++){
            box1[index] = box[row][col];
            index++;}
        col--;row++;
        for(;row<4;row++){
            box1[index] = box[row][col];
            index++;}
        col--; row--;
        for(;row>=1;row--){
            box1[index] = box[row][col];
            index++;}
        row++;col--;
        for(;row<4;row++){
            box1[index] = box[row][col];
            index++;}
        row--;col--;
        for(;col>=0;col--){
            box1[index] = box[row][col];
            index++;}
        row--;col++;
        for(;col<2;col++){
            box1[index] = box[row][col];
            index++;}
        row--;col--;
        for(;col>=0;col--){
            box1[index] = box[row][col];
            index++;}
        col++;row--;
        for(;col<3;col++){
            box1[index] = box[row][col];
            index++;}
        System.out.println("<<< After changed into given order Single dimen Array \n"+Arrays.toString(box1));
    }
    
}
