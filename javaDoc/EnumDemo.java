package javaDoc;

enum Dept
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
    
    //Here The CS,IT,CIVIL,ECE are called as indetifier

    String head;
    String location;
    
    private Dept(String head,String loc)
    {
    	System.out.println("Hi");
        this.head=head;
        this.location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}

//ENUM is also present in the c++ which is the collection of ordered constants 
//Whereas java enum are simply static final objects
//inside the enum you can declare the constructor That constructor is common for all the enum constants you know what fuck

//below Dept d = Dept.Cs 
//Here you could understand something that the object call the constructor and initialize it roughly
//In enum you can also store the values ....
//

public class EnumDemo 
{
    public static void main(String[] args) 
    {
       Dept d = Dept.CIVIL;   
       System.out.println(d.ordinal()); 
       System.out.println(d.getHeadName());
       System.out.println(d.getLocation());
       //ordinal give the exact location of identifier inside the enum
        
    }   
}