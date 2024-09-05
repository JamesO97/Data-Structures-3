/********************************************************************************
*
* NAME: James Oghagbon
* ID : 5733215
* LAB : COP 3530
*
* I declared this is my work and I have not copied this code from anyone.
* I am fully aware that submitting a copy of other peoples work is against
* FIU's Academic Honesty Policy.
*
*******************************************************************************/
package cop3530_project3;

import java.util.Random;
import java.util.Scanner;

public class COP3530_Project3 {

static HashTable table = new HashTable(1000);
static Random myRand = new Random();
static Timer timer = new Timer();

    public static void main(String[] args) {
        //Method1
        double runtime1 = setFront(1000);
        double runtime2 = setFront(10000);
        double runtime3 = setFront(100000);
        double runtime4 = setFront(250000);
        double runtime5 = setFront(500000);
        
        //Method2
        double runtime6 = setEnd(1000);
        double runtime7 = setEnd(10000);
        double runtime8 = setEnd(100000);
        double runtime9 = setEnd(250000);
        double runtime10 = setEnd(500000);
        
         //Method3
        double runtime11 = sortAdd(1000);
        double runtime12 = sortAdd(10000);
        double runtime13 = sortAdd(100000);
        double runtime14 = sortAdd(250000);
        double runtime15 = sortAdd(500000);
        
        System.out.printf("%-10s %-10s %-15s %-15s %-15s\n", "Run", "Randoms", "Method 1", "Method 2", "Method 3");
        System.out.printf("===================================================================\n");
        System.out.printf("%-10d %-10d %-15.4f %-15.4f %-15.4f\n", 1, 1000, runtime1, runtime6, runtime11);
        System.out.printf("%-10d %-10d %-15.4f %-15.4f %-15.4f\n", 1, 10000, runtime2, runtime7, runtime12);
        System.out.printf("%-10d %-10d %-15.4f %-15.4f %-15.4f\n", 1, 100000, runtime3, runtime8, runtime13);
        System.out.printf("%-10d %-10d %-15.4f %-15.4f %-15.4f\n", 1, 250000, runtime4, runtime9, runtime14);
        System.out.printf("%-10d %-10d %-15.4f %-15.4f %-15.4f\n", 1, 500000, runtime5, runtime10, runtime15);
        
         
        Scanner keyboard = new Scanner(System.in);
        HashTable test = new HashTable(1000);
        System.out.println("Which LinkedList would you like to see?");
        int listNum = keyboard.nextInt();
        System.out.println("How many random numbers?");
        int randomNums = keyboard.nextInt();
        System.out.println("Method 1:");
        for(int i = 0; i < randomNums; i++) {
            int data = myRand.nextInt(10001);
            test.setFront(data);
        }
        output(test, listNum);
        System.out.println("Method 2:");
        test = new HashTable(1000);
        for(int i = 0; i < randomNums; i++) {
            int data = myRand.nextInt(10001);
            test.setEnd(data);
        }
        output(test, listNum);
        System.out.println("Method 3:");
        test = new HashTable(1000);
        for(int i = 0; i < randomNums; i++) {
            int data = myRand.nextInt(10001);
            test.sortAdd(data);
        }
        output(test, listNum);
    }

    public static void output(HashTable table,  int listNum) {
        System.out.print(listNum + ": ");
        if(table.list[listNum] != null) {
            table.list[listNum].showLinkedList();
        } else {
            System.out.println("");
        }
    }

    public static void print(HashTable table) {
        for(int i = 0; i < table.size; i++) {
            System.out.print(i + " ");
            if(table.list[i] != null) {
                table.list[i].showLinkedList();
            } else {
                System.out.println("");
            }
        }
    }

    public static double setFront(int ranNums) {
        table = new HashTable(1000);
        timer.start();
        for (int i = 0; i < ranNums; i++) {
            int data = myRand.nextInt(10001);
            table.setFront(data);
        }
        timer.end();
        return timer.seconds();
    }

    public static double setEnd(int ranNums) {
        table = new HashTable(1000);
        timer.start();
        for(int i = 0; i < ranNums; i++) {
            int data = myRand.nextInt(10001);
            table.setEnd(data);
        }
        timer.end();
        return timer.seconds();
    }

    public static double sortAdd(int ranNums) {
        table = new HashTable(1000);
        timer.start();
        for(int i = 0; i < ranNums; i++) {
            int data = myRand.nextInt(10001);
            table.sortAdd(data);
        }
        timer.end();
        return timer.seconds();
    }
}