package com.company;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class cipher {
    private Map <String, String> alp;
    public cipher(String filename) throws Exception{
        FileReader fin = new FileReader(filename);
        int count  = 0;
        String skey = "";
        String sValue = "";
        alp = new HashMap<String, String>();
        int i;
        while((i=fin.read())!=-1) {
            if (i == '\n') {
                count = 0;
                alp.put(skey, sValue);
                sValue = "";
                skey = "";
                continue;
            }
            if (i == ' ') {
                count = 1;
                continue;
            }
            if (count == 0) {
                skey = skey + (char)i;
               // System.out.println(skey);
                continue;
            }
            if (count == 1) {
                sValue = sValue + (char)i;
               // System.out.println(sValue);
            }
        }
//        for(String a : alp.keySet()){
//        System.out.print(a);
//        String b = alp.get(a);
//            System.out.println(b);}
    }
 public void exchange(char[] a){
    ArrayList<String> cipStr = new ArrayList<String>();
    String Sval = "";
    String fff = "";
    char val = ' ';
     for (int k = 0; a[k] != '*'; k++) {
         if (a[k] == ' '){
             cipStr.add(" ");
             continue;
         }
         val = a[k];
         Sval = Sval + val;
         //System.out.print(alp.get(Sval)+"");
       //  fff += alp.get(Sval);
        cipStr.add(alp.get(Sval));
         Sval = "";
     }
//String list = cipStr.toString();
//     System.out.println(list);
//     for (int j = 0; j < cipStr.size(); j++ ) {
//         System.out.print(cipStr.get(j));
//     }
    for (String nool : cipStr){

        System.out.print(nool);
   }
   // System.out.println(fff);
}
}
