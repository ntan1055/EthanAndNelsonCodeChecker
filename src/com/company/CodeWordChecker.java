package com.company;

public class CodeWordChecker
{
    private int min;
    private int max;
    private String symbol;
    public CodeWordChecker(int min, int max, String symbol)
    {
        this.min = min;
        this.max = max;
        this.symbol = symbol;
    }
    public boolean isValid(String str)
    {
        if(min <= str.length() & str.length() <= max & !(symbol.indexOf() >= 0 ))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
