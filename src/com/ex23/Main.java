/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        String answer;
        System.out.print("Is the car silent when you turn the key? ");
        answer = newScanner.next();
        if(answer.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            answer = newScanner.next();
            if(answer.equals("y")){
                System.out.print("Clean terminals and try starting again");
                return;
            }
            else{
                System.out.print("Replace cables and try again");
                return;
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            answer = newScanner.next();
            if(answer.equals("y")){
                System.out.print("Replace the battery");
                return;
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                answer = newScanner.next();
                if(answer.equals("y")){
                    System.out.print("Check spark plug connections.");
                    return;
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    answer = newScanner.next();
                    if(answer.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        answer = newScanner.next();
                        if(answer.equals("y")){
                            System.out.print("Get it in for service.");
                            return;
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else{
                        System.out.print("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}
