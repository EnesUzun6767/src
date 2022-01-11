package day11Switch_Scanner;
/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */
public class Elevator {
    public static void main(String[] args) {
        int floor1=1,floor2=2,floor3=3,floorNum=1;

        if(floorNum==floor1){
        System.out.println("Floor 1 selected.Companies:Lobby,Verizon,Starbucks");
    }else if(floorNum==floor2){
        System.out.println("Floor 2 selected.Companies:Cybertek,NASA,Intelsat");
    }else{
        System.out.println("Floor 3 selected.Companies:Lyft,Bofa,Stake House");
    }


    switch(floorNum) {
        case 1:
            System.out.println("Floor 1 selected.Companies:Lobby,Verizon,Starbucks");
            break;
        case 2:
            System.out.println("Floor 2 selected.Companies:Cybertek,NASA,Intelsat");
            break;
        default:
            System.out.println("Floor 3 selected.Companies:Lyft,Bofa,Stake House");
    }

    if(floorNum<=3) {
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected.Companies:Lobby,Verizon,Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected.Companies:Cybertek,NASA,Intelsat");
                break;
            default:
                System.out.println("Floor 3 selected.Companies:Lyft,Bofa,Stake House");
        }
    }else{
            System.out.println("Invalid floor");
        }
    }
    }

