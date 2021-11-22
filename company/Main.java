package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        C1 carA = new C1();
        carA.Model_name = "Model 3";
        carA.Engine_size = "Small";
        carA.Color = "Red";
        carA.Four_wheel = "Yes";
        carA.ABS = "No";

        C1 carB = new C1();
        carB.Model_name = "Model 4";
        carB.Engine_size = "Small";
        carB.Color = "Red";
        carB.Four_wheel = "No";
        carB.ABS = "No";

        C2 carC = new C2();
        carC.Model_name = "Model S";
        carC.Engine_size = "Large";
        carC.Color = "Blue";
        carC.GPS = "No";
        carC.Leather_seat = "Yes";

        C2 carD = new C2();
        carD.Model_name = "Model M";
        carD.Engine_size = "Large";
        carD.Color = "Black";
        carD.GPS = "Yes";
        carD.Leather_seat = "Yes";

        displaysp(carA);
        displaysp(carD);

    }
    public static void displaysp(IK myIK){
        myIK.display();
    }
}
