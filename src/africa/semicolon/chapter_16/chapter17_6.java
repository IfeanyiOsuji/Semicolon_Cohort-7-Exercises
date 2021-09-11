package africa.semicolon.chapter_16;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class chapter17_6 {
    // Bound and Unbound
    // ClassName : InstanceMethod -> Unbound
    // ClassName : Static/Class Method -> Unbound
    // InstanceObject : InstanceMethod -> Bound
    public static void main(String[] args) {
        IntUnaryOperator unaryOperator = x -> x*2;
        // a
        DoubleBinaryOperator binaryOperator =( a,  b) -> a  * b;
        //b
        //( a,b) ->{ return a  * b;}
        //c
       // (a,b) ->a  * b;
        //d
      //  () -> System.out.println("Welcome to lambda");
        //e
        //ArrayList::new;
        //f
      /*  button.addActionListener(event) ->JOptionPane.showMessageDialog(ParentFrame.this,
                "JButton event handler"); */
        int [] numbers = {3, 4,8, 5, 9, 10};
        //int [] arr = Arrays.stream(numbers).filter((x, y) -> (x+y) ==8).toArray();
    }

}
