/**
 *
 * @author 55heyerjt01
 */
package ui;

import java.util.Scanner;
import linkedlist2.Friend;
import linkedlist2.LinkedList;
import utility.Validator;


public class BBApp {
    LinkedList list;
    
    public BBApp(){
       this.list = new LinkedList();
       start();
    }
    
    public void start(){
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while(true){
            menu();
            String regex = "^quit|add|remove|list$";
            choice = Validator.getLine(sc, choice, regex);
            if(choice.equalsIgnoreCase("quit")){
                break;
            }else if (choice.equalsIgnoreCase("add")){
                String name = Validator.getLine(sc, "Enter Angler's name: ");
                int rating = Validator.getInt(sc, "Enter rating(1-10): ");
                list.push(new Friend(name, rating));
            }else if(choice.equalsIgnoreCase("list")){
                System.out.println(list);
            }
        }
    }
    
    public void menu(){
        String choice = "";
        while(true){
            System.out.println("\nJason's Bass Team Tracker");
            System.out.println("Add - a new Angler");
            System.out.println("Remove - an existing Angler");
            System.out.println("List - all Anglers");
            System.out.println("Name - all Anglers ordered by Name"); 
            System.out.println("Reverse - all Anglers in descending order"); 
            System.out.println("Rating - all Anglers ordered by rating");
            System.out.println("Search - for an angler");
            System.out.println("Range - list Anglers by a specified range of rating");
            System.out.println("Quit");
            System.out.println("Type selection here: ");
        }
    }
    
    public static void main(String[] args){
        BBApp app = new BBApp();
    }
}
