package Projects;

import java.util.Deque;
import java.util.LinkedList;




public class RPNCalculator
{
  double x = 0.0;
  public static final int NUMBER_OF_REGISTERS = 26;
  public Deque<Double> theStack = new LinkedList<Double>();// the EnterFace Deque will work like the stack or linked list
  //public LinkedList<String> Instructions = new LinkedList<String>();
  public Register[] register = new Register[NUMBER_OF_REGISTERS];

    public RPNCalculator() {
        for(int i=0;i<register.length;++i){
            register[i]= new Register(x,"no lable",""+(char)('A'+i));
}
    }

    
}
