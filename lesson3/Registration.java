package com.company.registration


import java.util.objects;


import java.util.Scanner;


public class Registration implements Regisration {

    String name;
    String passord;
    static String[] arrlogin = new String[100];
    static String[] arrpassword = new String[100];
    int count = 0;

    boolean isHave = false;

    Scanner scanner = new Scanner(System.in);




}
@Override
    public  void  add() {

    System.out.println("Login write:");
    String name = Scanner.nextLine();
    System.out.println("Password : ");
    String  password = scanner.nextLine();


    arrlogin[ count] = name;
    arrpassword[count] =  password;
    count++;

}


@Override
public void search() {




}
