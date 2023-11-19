package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String name2 = br.readLine();
        String name3 = br.readLine();
        String name4 = br.readLine();
        String name5 = br.readLine();  // Reading input from STDIN
        for(int i=name.length()-1; i>=0; i-- ){
            System.out.println(name);    // Writing output to STDOUT
        }
    }
    
}
