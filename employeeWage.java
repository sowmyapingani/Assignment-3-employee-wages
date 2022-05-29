package com.employeewages;
import java.util.Random;
public class employeeWage
{
    public static void main(String args[]){
        Random random =new Random();
        int attendence=random.nextInt(2);
        switch (attendence){
            case 0:
                System.out.println("Employee is Absent");
                break;
            case 1:
                System.out.println("Employee is present");
                break;
        }

    }
}
