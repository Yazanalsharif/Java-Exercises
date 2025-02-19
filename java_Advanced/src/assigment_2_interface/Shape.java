package assigment_2_interface;

public interface Shape extends DrowAble, Comparable <Shape>{
	
    public static int x = 0;// any var in class shape are public static final and must intalized and made it by defult
	public double getArea();//the methodes in class interFace are by defult abstract and public  
    public void drowAble();
    public String getColor();
    public abstract String getName();
    
    //if the interFace was Shape then i just can use any method of this 
    //becouse compile error will be happen if i use method in sub classes not here
}
