/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mywings.coderepackging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class findallclass {
  public static  String exe="()";
public static int i=0;
public static int classtotal=0;
public static ArrayList<String> stringList = new ArrayList<String>() ;
public static ArrayList<String> data = new ArrayList<String>();
public static String d1,d2,datafinal;
public static String[] d3=null;
     public static   ArrayList A =new ArrayList();
     public static   ArrayList A1 =new ArrayList();
     public static   ArrayList A2 =new ArrayList();
     public static   ArrayList A3 =new ArrayList();
      public static  ArrayList A4 =new ArrayList();
      public static  ArrayList A5 =new ArrayList();
      public static  ArrayList A6 =new ArrayList();
      public static  ArrayList A7 =new ArrayList();
      public static  ArrayList A8 =new ArrayList();
      public static  ArrayList A9 =new ArrayList();
      public static  ArrayList A10 =new ArrayList();
      public static  ArrayList A11 =new ArrayList();
      public static  ArrayList A12 =new ArrayList();
        public static String Fpath;
        public static ArrayList Dependtantclones=new ArrayList();
        public static Map<String, Integer> map = new HashMap<String, Integer>();
        public static Map<String, Integer> map2 = new HashMap<String, Integer>();
        public static Map<String, Integer> map3 = new HashMap<String, Integer>();
        public static ArrayList<String> funcationname=new ArrayList<String>();
        public static ArrayList<String> funcationfinal=new ArrayList<String>();
        public static ArrayList sngl =new ArrayList();
        public static ArrayList dbl =new ArrayList();
        public static ArrayList trpl =new ArrayList();
        public static ArrayList<String> firstlist =new ArrayList<String>();
        public static ArrayList<String> secondlist =new ArrayList<String>();
        public static ArrayList<String> thirdlist =new ArrayList<String>();
    public static void main(String[] args)
    {
    
    for(int k=0; k<stringList.size();k++)//first for loop
                  {
              if(stringList.get(k).contains("//"))
                           {
                           }
                           else
                           {
                       if(stringList.get(k).contains("class"))
                       {
                           if(stringList.get(k).contains(";")||stringList.get(k).contains("public")||stringList.get(k).contains("//"))
                           {
                           }
                           else
                           {
                               classtotal++;
                           }
                          i++;
                           if(i==1)
                          {
                              A.add(stringList.get(k).toString());
                          }
                          if(i==2)
                          {
                              A1.add(stringList.get(k).toString());
                          }
                           if(i==3)
                          {
                              A2.add(stringList.get(k).toString());
                          }
                           if(i==4)
                          {
                              A3.add(stringList.get(k).toString());
                          }
                           if(i==5)
                          {
                              A4.add(stringList.get(k).toString());
                          }
                           if(i==6)
                          {
                              A5.add(stringList.get(k).toString());
                          }
                           if(i==7)
                          {
                              A6.add(stringList.get(k).toString());
                          }
                           if(i==8)
                          {
                              A7.add(stringList.get(k).toString());
                          }
                           if(i==9)
                          {
                             A8.add(stringList.get(k).toString());
                          }
                           if(i==10)
                          {
                              A9.add(stringList.get(k).toString());
                          }
                           if(i==11)
                          {
                              A10.add(stringList.get(k).toString());
                          }
                      }
                      else
                      {
                         if(i==2)
                          {
                                A1.add(stringList.get(k).toString());
                          }
                           if(i==3)
                          {
                               A2.add(stringList.get(k).toString());
                          }
                           if(i==4)
                          {
                              A3.add(stringList.get(k).toString());
                          }
                           if(i==5)
                          {
                              A4.add(stringList.get(k).toString());
                          }
                           if(i==6)
                          {
                              A5.add(stringList.get(k).toString());
                          }
                           if(i==7)
                          {
                              A6.add(stringList.get(k).toString());
                          }
                           if(i==8)
                          {
                              A7.add(stringList.get(k).toString());
                          }
                           if(i==9)
                          {
                              A8.add(stringList.get(k).toString());
                          }
                           if(i==10)
                          {
                              A9.add(stringList.get(k).toString());
                          }
                           if(i==11)
                          {
                              A10.add(stringList.get(k).toString());
                          }           
                      }
                     }
                  }    
    }
}
