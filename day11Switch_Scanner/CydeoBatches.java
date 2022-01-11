package day11Switch_Scanner;
/*
Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed


 */
public class CydeoBatches {
    public static void main(String[] args) {
        String batch = "US morning", batch1 = "US morning", batch2 = "US evening", batch3 = "EU";

        switch (batch) {
            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F");
                break;
            case "US evening":
                System.out.println("Class times are 7-10 EST.M, T, W, Th,S, S");
                break;
            case "EU":
                System.out.println("Class times are 10-5 EST M, T, W, Th,F");
                break;
            default:
                System.out.println("Invalid batch");
        }
        if (batch == batch1 || batch == batch2 || batch == batch3) {
            switch (batch) {
                case "US morning":
                    System.out.println("Class times are 10-5 EST. M, T, Th, F");
                    break;
                case "US evening":
                    System.out.println("Class times are 7-10 EST.M, T, W, Th,S, S");
                    break;
                case "EU":
                    System.out.println("Class times are 10-5 EST M, T, W, Th,F");
                    break;
            }

        } else {
            System.out.println("Invalid batch");
        }
        if (batch == batch1 || batch == batch2 || batch == batch3) {
            if (batch == batch1) {
                System.out.println("Class times are 10-5 EST. M, T, Th, F");
            } else if (batch == batch2) {
                System.out.println("Class times are 7-10 EST.M, T, W, Th,S, S");
            } else {
                System.out.println("Class times are 10-5 EST M, T, W, Th,F");
            }

        } else {
            System.out.println("Invalid batch");
        }
    }
}

