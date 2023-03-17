package javaDoc;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.Class)
@Documented
@Target(value=ElementType.LOCAL_VARIABLE);
//@Repeatable(MyAnndo.class) if you are using the interface then it must be publi

@interface nes{
	String name() default "santhoshsivan";
	String project() default "fuck";
}


public class AnnoDemo1
{
  int data; //instance variable
  //@MyAnno(name="Ajay",project="Bank")
  
  
  //@MyAnno(name="Ajay")
  public static void main(String[] args) 
  {
	  @nes(name="Ajay",project="Bank")
      //@MyAnno(name="Ajay")
      int x;
  }
  
}
