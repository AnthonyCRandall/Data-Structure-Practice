import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Iterator;

/**
 * You are to write Java code which performs and completes the following operations.
 * Your code is to be commented and formatted as appropriate.
 * Your code must be operational, functional, and produce the correct response(if you wish to get credit).
 * A single main method should call any/all appropriate support methods.
 * Be sure to label and use appropriate method/variable references.
 * A hard copy of the solution is required.
 *
 * @author Randall
 * @version 0.1
 */
public class Main
{
    //In a main() method:
    public static void main(String[] args){
        
    //  1. Create an array with capacity 32 integers. Use the reference variable -myNums-
    //     to address this array
           int[] myNums = new int[32];
            
    //      a. Populate the array with random integers ranging from 18 to 536, inclusive.
            for (int i = 0; i < myNums.length; i++){
                myNums[i] = (int)(Math.random() * 519) + 18; // (536 - 18 + 1) + 18
            }                                                 // (int)(Math.random() * (max - min + 1)) + min
                
    //      b. Print a message indicating the following line are the integers from the array
            System.out.println("The following line contains the integers from the myNums array: ");
            
    //      c. Then print the integers - all on one line, separated by a space.
    //       - Lets use an enhanced for loop to itterate through the entire array and print the elements
            for(int i: myNums){
                System.out.print(i + " ");
            }
            
            System.out.println();   // For line break purposes
            
    //          i. We wish to verify the range and initial order of the integers.
                boolean inRange = true; // Lets create a boolean to check if all integers are between 18 and 356
                
                for(int i = 0; i < myNums.length; i++){ // Again we want to make a for loop to go through each and every element in the array
                    if(myNums[i] < 18 || myNums[i] > 536){  // This time we are creating a if statement to check if all numbers are between 18 and 536
                        inRange = false; // If we get to an element that is not between these number we are gonna set inRange equal to false
                        System.out.println("The integer " + myNums[i] + " at index " + i + " is not within the target range");
                        break;  // Stop looping, I dont care about the integers that follow
                    }  
                }   
                // I had to use a boolean because originally I was putting a print statement in the conditional statament and it would print 
                // out EVERY single element and whether it was in or out of range. This approach only prints out one line.
                
                if(inRange){
                    System.out.println("All the integers in myNums are within the target range!"); 
                }
                
                System.out.println();   // For line break purposes
                    
    //  2. Using a LinkedList - referenced by myList - 
    //      a. Populate the list with integers from the array(in step 1)
    //            i. You must use these original values - and place them in the ArrayList in the same order as they appear in the array
            LinkedList<Integer> transferredArray = new LinkedList<>(); // Lets start by creating the ArrayList that we will use to store myNums elements
            
            for(int i: myNums){
                transferredArray.add(i);
            }
            
    //      b. Print the values - all on one line - separated by a single space
            System.out.print(transferredArray);
            
            System.out.println(); // For line break purposes
            
    //      c. Sort the values
            Collections.sort(transferredArray);
            
    //      d. Print the values now
    //          i. Print a message indicating the following line are sorted values
                System.out.println("The following line are sorted values");
    //          ii. Print the values all on one line, separated by a single space
                for(int i: transferredArray){
                    System.out.print(i + " ");
                }
    
                System.out.println();   // For line break purposes
                
    //      e. Now print the value in reversed order
    //          i. You must use an iterator for this operation
    //          ii. Print a message indicating the reversed order, then on the following line, print all the values, with a space between them
                System.out.println("The following line are in reverse order");
                for(int i = transferredArray.size() - 1; i >= 0; i--){
                    System.out.print(transferredArray.get(i) + " ");
                }
                
                System.out.println(); // For line break purposes
                
    //      f. Finally print just the evens
    //          i. An iterator must be used for this step
    //          ii. Print a message, then on the following line, print all the even values; all on one line, separated by a single space
                System.out.println("The following line are ONLY the EVEN numbers in the linked list");
                for(int i = 0; i < transferredArray.size(); i++){
                    if(transferredArray.get(i) % 2 == 0){
                        System.out.print(transferredArray.get(i) + " ");
                    }
                }
                
                System.out.println(); // For line break purposes
                
    //  3. Using a TreeSet - referenced by myTree
    //      a. Populate the TreeSet with the original values from the array created in step (1)
            TreeSet<Integer> myTree = new TreeSet<>();
            for(int i : myNums){
                myTree.add(i);
            }
            
    //      b. Print these values, the values from the TreeSet - using an iterator
    //          i. Verify that the values in the TreeSet match those- in value and order- as those from the array
    //          // These are a little different when it comes to traversing through a data structure
    //          // Lets first start by creating an iterator
    //          ii. When printing these values, they should be on one line, separated by a space
    //          iii. Place a message above the values, indicating the order for the subsequent output line
                Iterator<Integer> iterator = myTree.iterator();
                
                System.out.println("The following elements are in myTree in ascending order");
                
                while (iterator.hasNext()) { // If there is another Integer in the data structure (TreeSet), then print it
                    System.out.print(iterator.next() + " ");
                }
                
                System.out.println(); // For line break purposes
                
                // Now lets do it using an enhanced for loop
                System.out.println("Or...");
                for(Integer i : myTree){
                    System.out.print(i + " ");
                }
                
                System.out.println(); // For line break purposes
                
    //      c. Print only the odd values, on one line, using a single space separator, and having an appropriate message displayed above the output
            System.out.println("The following Integers are ONLY the ODD values");
            for(Integer i : myTree){
                if(i % 2 != 0){
                    System.out.print(i + " ");
                }
            }
            
                System.out.println(); // For line break purposes        
            
    //      d. Can we find a way to print the values in the TreeSet in reverse order?
    //          i. Please, do print them - in reversed order
                Iterator<Integer> descendingIterator = myTree.descendingIterator();
                
                System.out.println("The following elements are in reversed order: ");
                while(descendingIterator.hasNext()){
                    System.out.print(descendingIterator.next() + " ");
                }
                
    }
}
