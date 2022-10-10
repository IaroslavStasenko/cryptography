package com.company;

public class Main {

    public static void main(String[] args) throws Exception{
        String str ="abivateli oboshaiut maniakov*";
        // String str ="abcd ";
        char[] strToArray = str.toCharArray();
        cipher a = new cipher("tabl.txt");
//        String str ="abivateli oboshaiut maniakov*";
//       // String str ="abcd ";
//        char[] strToArray = str.toCharArray();
        a.exchange(strToArray);
    }
}
