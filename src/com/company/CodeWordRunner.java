package com.company;

public class CodeWordRunner
{
    public static void main(String[] args) {
	// write your code here
        StringChecker sc1= new CodeWordChecker(5,6, "$");
        StringChecker sc2= new CodeWordChecker(6,7,"pass");

        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));
    }
}
