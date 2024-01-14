package exceptionhandling.runtimeexception;

public class example1 {

    /**
     * run time exception is also called unchecked exception because it is not caught at compile time.
     * run time exception occur due to logical error in the code. hence need to be fixed by Programmer
     *
     * here is an example for run time exception. [ArrayoutOfboundException]
     */
    public static  void main(String[] args) {
        //**************ArrayOutOfBounds*************//
        int[] marks = new int[] {59, 45, 80, 65};
        System.out.println(marks[4]); // Exception occured here. need to be fixed by programmer.
        /* Fix
        System.out.println(marks[3]);
        */

        //*************NullPointerException*****//
        String[] names = new String[7];
        names[0] = "Peter";
        names[1] = "John";
        names[2] = "Janardhan";

        for(String name : names) {
            /* Fix
                if(name != null)
             */
            System.out.println(name); // Exception occured here. Need to be fixed by programmer
        }
    }
}
