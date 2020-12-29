/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanya.and.fence;

import java.util.Scanner;

/**
 *
 * @author tarek
 */
public class VanyaAndFence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        float fence_hight;
        int number;
        int wedith = 0;
      
        Scanner y = new Scanner(System.in); // to take a line to hight and numbers
        Scanner x = new Scanner(System.in); // to take a line to array of hights
        number = y.nextInt();
        fence_hight = y.nextFloat();
        String line = x.nextLine();
        String tempLine[] = line.split(" "); // to convert the line to array
        float[] persons_hight = new float[number]; // array of int hights
        for (int i = 0 ; number > i ; i++ )
        {
           persons_hight[i] = Integer.parseInt(tempLine[i]); // casting to int
        }
      for (int i = 0 ; number > i ; i++ )
          if(persons_hight[i] <= fence_hight)
          {
              wedith ++;
          }
          else {
              wedith += 2;
          }
      
       System.out.println(wedith);
    }
    
}
