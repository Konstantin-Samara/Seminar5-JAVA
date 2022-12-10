import java.util.LinkedList;
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
public class task4 {
public static boolean under_attack(int my_line, int my_col, LinkedList<Integer> Queen){
    boolean my_test = false;
    for (int i = 0; i < Queen.size(); i++) {
        if (my_col==Queen.get(i)) my_test = true;
        else {
            if (Math.abs(my_col-Queen.get(i))==(my_line-i)) my_test = true;}}
    return my_test;}
public static void my_print(LinkedList<Integer> Queen){
    char[] Let = {'A','B','C','D','E','F','G','H'};
    System.out.println();
    for (int i = 7; i >=0; i--) {
        System.out.print((i+1)+". ");
        for (int j = 0; j < 8; j++) {
            if ((Queen.size()>=(i+1))&&(Queen.get(i)==j)) System.out.print("X ");
            else {System.out.print("0 ");}}
            System.out.println("Ферзь "+(i+1)+" - "+Let[Queen.get(i)]+(i+1));}
System.out.println("   A B C D E F G H\n");}
public static void main(String[] args) {
LinkedList<Integer> Queen = new LinkedList<>();
for (int k = 0; k < 8; k++) {
    Queen.clear();       
    Queen.add(k);
    for (int i = 1; i < 8; i++) {
        int FirstPos=0;
        if (Queen.size()<i) {
            i-=2;
            FirstPos = Queen.get(i)+1;
            Queen.removeLast();}
        for (int j=FirstPos; j < 8; j++) 
            {if (!under_attack(i,j,Queen)) {Queen.add(j); break;}}}
    if (Queen.size()==8) my_print(Queen);}}}