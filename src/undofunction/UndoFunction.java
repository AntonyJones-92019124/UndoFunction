/*
 * This program obtains list of directions from the user,
 * allow the last element/item from user to be removed
 * 
 */

package undofunction;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author CPP_Curriculum and Antony Jones 92019124
 */

public class UndoFunction {

    private static Scanner in = new Scanner(System.in);
    private static String usersInput;//set variable usersIput to String.
    //Set Stack to listOfDirections Variable.
    private static Stack<String> listOfDirections = new Stack();//New Stack. 
    

    public static void main(String[] args) {

        //use of while statement for obtaining user input.
        //While true print out following.
        while (true){
            System.out.println("Press D to enter new direction, U to cancel "
                    + "last entry and E to quit the program");
            //Scanner input set to next line set to variable usersInput.
            usersInput = in.nextLine();
            
            /*if statement usersInput set to D then run getUsersDirection 
            method.*/
            if (usersInput.equals("D")){              
                getUsersDirections();//getUsersDirection Method.
            }
            
            //else if usersInput set to U run undoUsersDirection Method.
            else if (usersInput.equals("U")){              
                undoUsersDirection();//undoUserDirection Method.

            }
            
            //else if usersIput set to E print out You have quit program.
            else if (usersInput.equals("E")){                   
                System.out.println("You have quit program!");//print out.
                System.exit(0);//exit program.

            }
            
            //else input from user print out the commend is not recognised.
            else{
                System.out.println("The command is not recognised");

            }            

        }//end of while

    }//End of public main

    

    //undoUsersDirection removes last element in stack.
    //as long as the stack is not empty.
    public static void undoUsersDirection(){
        
        //if stack variable listOfDirections set to empty.
        if (listOfDirections.isEmpty()){
            
            //print out to user list of directions is empty.
            System.out.println("The list of directions is empty.");

        }
        
        /*else if stack not empty output the item with listOfDirections.peek 
        method,listOfDirections and show the has been removed.. message.*/
        else{
            System.out.println(listOfDirections.peek() + " has been removed "
                    + "from the directions list");
            
            listOfDirections.pop(); //pop the listOfDirections from stack.                   
            displayUsersDirections(); //run the displayUserDirections Method.           

        }

    }

    //this method adds an element to the stack with listOfDirections.
    public static void getUsersDirections(){

        System.out.println("Type in the direction\n");

        usersInput = in.nextLine();//variable usersInput set to next line.
        listOfDirections.push(usersInput);//push usersInput into stack.  
        displayUsersDirections();//run tghe displayUsersDirections Method.

    }//end of getUsersDirection Method 

    //Method displayUsersDirections displays items in the direction list.
    public static void displayUsersDirections(){

        System.out.println("List of directions: ");//Print out to user.
        
        //for loop print out the listOfDirections stack.
        for (String s: listOfDirections){//set String s to listOfDirections stack.

            System.out.println(s);//print out the value of s.

        }

    }//end of displayUsersDirection Method  

}//end of UndoFunction class