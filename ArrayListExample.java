import java.util.ArrayList;

public class ArrayListExample {
    public static void main (String[] args) {
    
        String[] firstNames = new String[5];
        
        firstNames[0] = "Dave";
        firstNames[1] = "Katie";
        firstNames[2] = "John";
        firstNames[3] = "Jennifer";
        firstNames[4] = "Mickey Mouse";
        
        // System.out.println("The length of 'firstNames' is " + firstNames.length);
        
        // ---------------------------
        
        ArrayList<String> lastNames = new ArrayList<String>();
        lastNames.add("Ghidiu");
        lastNames.add("Smith");
        lastNames.add("Jobs");
        lastNames.add("Law");
        lastNames.add("Disney");
        
        // System.out.println("The length of 'lastNames' is " + lastNames.size());
        
        outputArrayListItems(lastNames);
        
        lastNames.add(2, "DeRusso");
        
        outputArrayListItems(lastNames);
        
        //lastNames.clear();
        
        //outputArrayListItems(lastNames);
        
        System.out.println("The value in position 4 is: " + lastNames.get(4));
        
    
    }
    
    public static void outputArrayListItems(ArrayList tempList) {
    
        for (int i = 0; i < tempList.size(); i++) {
          System.out.print(tempList.get(i) + "-");
        }
        System.out.println();
    
    }
}



/*
lastNames.add("Jones");
lastNames.add(3, "Smith");
lastNames.clear();
lastNames.get(4);   //firstNames[4];
lastNames.getIndexOf("Smith");  // 1
lastNames.isEmpty(); // false
lastNames.remove(2);
lastNames.set(2, "Keys");
lastNames.size();
*/

