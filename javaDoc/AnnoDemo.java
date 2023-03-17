package javaDoc;

@interface MyAnno
{ //user defined documentation you know
    String name(); //This are called as elements
    String project();
    String date() default "today";  //for setting defualt values
    String version() default "13";
            }

//annotation
@MyAnno(name="Ajay",project="Bank")
public class AnnoDemo 
{
    @SuppressWarnings(value = { "" })
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
}
