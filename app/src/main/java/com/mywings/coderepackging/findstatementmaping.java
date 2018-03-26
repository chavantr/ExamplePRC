/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mywings.coderepackging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class findstatementmaping {
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
    public static void  main(String[] args)
    {
   for(int k=0; k< A1.size();k++)
        {
         
        d1=A1.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data1=datafinal.toString().replace("public double","");
         String str1=A1.get(k).toString();

          if(data1.contains("(") || data1.contains(")"))
          {
              if(data1.contains(".add")||data1.contains(".out")){}
              else
              {
                    Dependtantclones.add(str1);
                   if(data1.contains("."))
                  {
                      d3=data1.split("\\.");
                      data.add(d3[1].toString());
                      
                  }
                  else{
                    funcationname.add(data1);
                   
                  }
              }
              
           }
      
        }
         for(int k=0; k< A2.size();k++)
        {
         d1=A2.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data2=datafinal.toString().replace("public double","");
          String str2=A2.get(k).toString();
          if(data2.contains("(") || data2.contains(")"))
          {
          if(data2.contains(".add")||data2.contains(".out")){}
              else
              {Dependtantclones.add(str2);
                  if(data2.contains("."))
                  {
                      d3=data2.split("\\.");
                      data.add(d3[1].toString());
                      
                  }
                  else{
                    funcationname.add(data2);
                   
                  }
              }
           }
       
        }
 for(int k=0; k< A3.size();k++)
        {
         
          d1=A3.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data3=datafinal.toString().replace("public double","");
          String str3=A3.get(k).toString();
          if(data3.contains("(") || data3.contains(")"))
          {
           if(data3.contains(".add")||data3.contains(".out")){}
              else
              {
                  if(data3.contains("."))
                  {
                       Dependtantclones.add(str3);
                      d3=data3.split("\\.");
                      data.add(d3[1].toString());
                     
                  }
                  else{
                   funcationname.add(data3);
                  
                  }
              }
           }
       
        }
  for(int k=0; k< A4.size();k++)
        {
         
         d1=A4.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data4=datafinal.toString().replace("public double","");
          String str4=A4.get(k).toString();
          if(data4.contains("(") || data4.contains(")"))
          {
           if(data4.contains(".add")||data4.contains(".out")){}
              else
              {
                  if(data4.contains("."))
                  {
                       Dependtantclones.add(str4);
                      d3=data4.split("\\.");
                      data.add(d3[1].toString());
                   
                  }
                  else{
                   funcationname.add(data4);
                 
                  }
              }
           }
       
        }
   for(int k=0; k< A5.size();k++)
        {
         
         d1=A5.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data5=datafinal.toString().replace("public double","");
          String str5=A5.get(k).toString();
          if(data5.contains("(") || data5.contains(")"))
          {
            if(data5.contains(".add")||data5.contains(".out")){}
              else
              {
                  Dependtantclones.add(str5);
                  if(data5.contains("."))
                  {
                        
                      d3=data5.split("\\.");
                      data.add(d3[1].toString());
                     
                  }
                  else{
                  funcationname.add(data5);
                    
                  }
              }
           }
       
        }
    for(int k=0; k< A6.size();k++)
        {
         
          d1=A6.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data6=datafinal.toString().replace("public double","");
          String str6=A6.get(k).toString();
          if(data6.contains("(") || data6.contains(")"))
          {
            if(data6.contains(".add")||data6.contains(".out")){}
              else
              {
                   Dependtantclones.add(str6);
                  if(data6.contains("."))
                  {
                      
                      d3=data6.split("\\.");
                      data.add(d3[1].toString());
                     
                  }
                  else{
                    funcationname.add(data6);
                   
                  }
              }
           }
       
        }
    for(int k=0; k< A7.size();k++)
        {
         
          d1=A7.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data7=datafinal.toString().replace("public double","");
          String str7=A7.get(k).toString();
          if(data7.contains("(") || data7.contains(")"))
          {
           if(data7.contains(".add")||data7.contains(".out")){}
              else
              {
                   Dependtantclones.add(str7);
                  if(data7.contains("."))
                  {
                      d3=data7.split("\\.");
                      data.add(d3[1].toString());
                      
                  }
                  else{
                    funcationname.add(data7);
                   
                  }
              }
           }
       
        }
  for(int k=0; k< A8.size();k++)
        {
         
          d1=A8.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data8=datafinal.toString().replace("public double","");
          String str8=A8.get(k).toString();
          if(data8.contains("(") || data8.contains(")"))
          {
            if(data8.contains(".add")||data8.contains(".out")){}
              else
              {
                  Dependtantclones.add(str8);
                  if(data8.contains("."))
                  {
                      d3=data8.split("\\.");
                      data.add(d3[1].toString());
                      
                  }
                  else{
                    funcationname.add(data8);
                 
                  }
              }
           }
       
        }
    for(int k=0; k< A9.size();k++)
        {
         
         d1=A9.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data9=datafinal.toString().replace("public double","");
          String str9=A9.get(k).toString();
          if(data9.contains("(") || data9.contains(")"))
          {
           if(data9.contains(".add")||data9.contains(".out")){}
              else
              {
                    Dependtantclones.add(str9);
                  if(data9.contains("."))
                  {
                      d3=data9.split("\\.");
                      data.add(d3[1].toString());
                     
                  }
                  else{
                  funcationname.add(data9);
                  
                  }
              }
           }
       
        }
        for(int k=0; k< A10.size();k++)
        {
         
          d1=A10.get(k).toString().replace("public String", "");
       d2=d1.toString().replace("public int","");
       datafinal= d2.toString().replace("public void","");
         String data10=datafinal.toString().replace("public double","");
          String str10=A10.get(k).toString();
          if(data10.contains("(") || data10.contains(")"))
          {
           if(data10.contains(".add")||data10.contains(".out")){}
              else
              {
                  
                       Dependtantclones.add(str10);
                  if(data10.contains("."))
                  {
                      d3=data10.split("\\.");
                      data.add(d3[1].toString());
                      
                  }
                  else{
                    funcationname.add(data10);
                   
                  }
              }
           }
       
        }
     
              
    }
            }
