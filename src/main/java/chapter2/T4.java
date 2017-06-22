package chapter2;

import org.omg.CORBA.IntHolder;


/**
 * Created by Mike on 2017-05-30.
 */
public class T4 {

    public static void main(String[] args) {

        IntHolder x = new IntHolder(3);
        IntHolder y = new IntHolder(1);

        x=swapIntHolders(x,y);


    }

    public static IntHolder swapIntHolders(IntHolder x , IntHolder y){
        x=y;
        return x;
    }

}
