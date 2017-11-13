/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencompetentep1;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class ExamenCompetenteP1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
       int k = 13, M = 0, kfact = 1, A = 1, p, n, nr = 0;
       System.out.println("Alegeti un numar k intre 1 si 12 si numarul M:");
       while(k < 1 || k > 12)
       {
         k = s.nextInt();
         M = s.nextInt();
       }
       
       System.out.println("Numerele alese sunt " + k + " " + M + "\n");
      
       
       
       for(p = 1;p <= k; p++)
       {
           kfact = p * kfact;
       }
       n = k + 1;
       A = (kfact*n)/(n-k);
       for(n = k+2; n < M; n++)
       {
           if(A < M)
           {
               A = A * n/(n-k);
               nr = n-1;
           }
           else 
           {
               break;
           }
       
       }
       
      System.out.println("Numarul n cautat este: " + nr);
           
       }
             
    }
    

