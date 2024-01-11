package org.iesvdm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader fr = null;
        BufferedReader br = null;//quita los saltos de linea, por eso hay que usar un sout

        try {
            fr = new FileReader("src/recursos/fichero1.txt");
            br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
        }


    }//fin main
}