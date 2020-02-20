/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linear;

import java.util.Scanner;

/**
 *
 * @author USER
 */
class search {
    int i,n,arr[],search;
    Scanner sc=new Scanner(System.in);
  void cal()
  {
    System.out.println("enter number of elements");
    n=sc.nextInt();
    arr=new int[n];
    System.out.println("enter "+n+" elements");
    for( i=0;i<n;i++) 
    {
        arr[i]=sc.nextInt();
        
    }
 System.out.println("enter number to search");
   search=sc.nextInt();
 for( i=0;i<n;i++) 
    {
        if(arr[i]==search)
        {
            System.out.println(search+ "present at position "+(i+1));
            break;
        }
    }
 if(i==n)
 {
      System.out.println(search+ "is not present ");
           
 }
  }
        }
    

