/*
Exercise 21 - Numbers to Names

Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.
Example Output

Please enter the number of the month: 3
The name of the month is March.

Constraints

    Use a switch or case statement for this program.
    Use a single output statement for this program.

Challenges

    Use a map or dictionary to remove the switch statement from the program.
    Support multiple languages. Prompt for the language at the beginning of the program.
*/

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);


        System.out.print("Please enter the number of the month: ");
        int month = Integer.parseInt(cursor.nextLine());

        String ret = "The name of the month is ";

        switch(month){
            case 1:
                ret += "January";
                break;
            case 2:
                ret += "February";
                break;
            case 3:
                ret += "March";
                break;
            case 4:
                ret += "April";
                break;
            case 5:
                ret += "May";
                break;
            case 6:
                ret += "June";
                break;
            case 7:
                ret += "July";
                break;
            case 8:
                ret += "August";
                break;
            case 9:
                ret += "September";
                break;
            case 10:
                ret += "October";
                break;
            case 11:
                ret += "November";
                break;
            case 12:
                ret += "December";
                break;
        }

        System.out.println(ret);
    }
}
