/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mywings.coderepackging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShowStatement {
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
    
    for(int j=0;j<data.size();j++)
        {
            String df=data.get(j).toString().replace(";","");
        funcationfinal.add(df);
        }
        for(i=0;i<funcationfinal.size();i++)
        {
          String[] parts=funcationfinal.get(i).toString().split(",");
          if(parts.length==1) 
          {  
              firstlist.add(funcationfinal.get(i));
          }
           if(parts.length==2) 
           {
              secondlist.add(funcationfinal.get(i));
           }
            if(parts.length==3) 
            {
                thirdlist.add(funcationfinal.get(i));
            }
        }	
       	for (String temp : firstlist)
        {
		Integer countt = map.get(temp);
		map.put(temp, (countt == null) ? 1 : countt + 1);
	}
        for (String temp : secondlist) 
        {
		Integer countt = map2.get(temp);
		map2.put(temp, (countt == null) ? 1 : countt + 1);
	}
       	for (String temp : thirdlist)
        {
		Integer countt = map3.get(temp);
		map3.put(temp, (countt == null) ? 1 : countt + 1);
	}
                
        for(int i=0;i<Dependtantclones.size();i++)
        {
          String[] parts=Dependtantclones.get(i).toString().split(",");
          if(parts.length==1) 
          {  
              sngl.add(Dependtantclones.get(i));
          }
           if(parts.length==2) 
           {
               dbl.add(Dependtantclones.get(i));
           }
            if(parts.length==3) 
            {
                trpl.add(Dependtantclones.get(i));
            }
        }
    
    }
}
