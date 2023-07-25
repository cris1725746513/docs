/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Cristian Leones Cian
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        String filePath = "D:\\Downloads\\xml.xml"; // Replace with the actual file path
        File a = new File(filePath);
          System.out.println(a.getPath());
        try {
            String xmlString = convertXMLToString(a.getPath());
            System.out.println(xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String convertXMLToString(String filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }

        return stringBuilder.toString();
    }
    
}
