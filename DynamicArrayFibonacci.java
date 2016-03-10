public class DynamicArrayFibonacci {
    public static void main (String args[]) {

        // This is the number of terms we want
        // SWEET! A constant!
        final int NUMBER_OF_TERMS = 20;    
        
        // Create the array of size 2, and populate it with the first two terms.
        int[] fibArray = new int[2];
        fibArray[0] = 1;
        fibArray[1] = 1;
        
        // To test to see if the program does what I *think* it does, I want to
        // output the values in 'fibArray' before anything else happens. So I made
        // a method called 'outputValues' that just outputs the values... The code is below.
        outputValues(fibArray);
        
        for (int i = 0; i < NUMBER_OF_TERMS; i++) {
            // The 'nextTerm' is the sum of the last two terms in the array
            int nextTerm = fibArray[fibArray.length-1] + fibArray[fibArray.length-2];
            
            // Need to increase the size of the array by 1
            // To do this, assign 'fibArray' to equal whatever happens in
            // 'addOneMoreSpace()' - which is another method that I wrote.
            fibArray = addOneMoreSpace(fibArray);
            
            // Need to put the 'nextTerm' into the last element
            fibArray[fibArray.length-1] = nextTerm;
        }
        
        // To see if this works, I output the values again using that handy
        // method I already have written, 'outputValues()'
        outputValues(fibArray);
        
    }
    
    public static int[] addOneMoreSpace(int[] originalArray) {
        // Note that the array we passed in (on line 25) is called 'fibArray'
        // but in the method signature on line 37, we call it 'originalArray'. The
        // two names do NOT need to match up - the computer knows that whatever
        // array is passed in will now be called 'originalArray' for the scope
        // of this method.
        
        // Declare a new array that is precisely one element longer than the 
        // 'originalArray' (which is really 'fibArray')
        int[] newArray = new int[originalArray.length + 1];
        
        // Copy all the values from 'originalArray' into 'newArray'
        for (int j = 0; j < originalArray.length; j++) {
            newArray[j] = originalArray[j];
        }
        
        // This is the array that is "returned" from this method - the main program
        // can do whatever it wants with it. In this case, the main program 
        // reassigns 'fibArray' to equal what is returned, 'newArray'
        return newArray;
    }
    
    // This is a simple method that takes in one array and will output the values.
    // I wrote this so I could see what the array looked like at any time in the main
    // program.
    public static void outputValues(int[] tempArray) {
        
        for (int k = 0; k < tempArray.length; k++) {
            
            // I elected to put a dash instead of a space because you can't see how many
            // spaces are ever outputted. So if the array had 10 spots, but only 2 of them
            // had values, the output looks like this:
            // '1-1---------' as opposed to '1 1        '
            // This is just for testing, so it doesn't really matter what I output. If I
            // were making this software for a client, I'd probably not ever output the
            // values anyhow.
            System.out.print(tempArray[k] + "-");
        
        }
        
        // Output a new line so that if something else is outputted in the window, it won't
        // be on the same line as the output of this array
        System.out.println();
        
    }

    
}
