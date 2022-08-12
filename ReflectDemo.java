package javaDoc;

import java.lang.reflect.*;

//Here this is the normal class 
//For some case if you want to know the information of the buildin methods then you simply use the 
class My
{
    private int a;
    protected int b;
    public int c;
    int d; //default
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}

public class ReflectDemo 
{
    public static void main(String[] args) 
    {
    	
    	Class hf = My.class;
    	
    	Field field[] = hf.getDeclaredFields();
//        Class c=My.class;
//      //Here field is the way of getting the variables 
    	for(Field x:field) {
    		System.out.println(x);
    	}
//        Field field[]=c.getDeclaredFields();
//        
        Method meth[]=hf.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }
        
    }   
}

