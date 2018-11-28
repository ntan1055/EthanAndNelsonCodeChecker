package com.company;

public class CodeWordChecker implements StringChecker
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
    @Override
    public boolean isValid(String str)
    {
        if(str.length()>=min&&str.length()<=max )
        {
            return str.indexOf(symbol) == -1;
        }
            return false;
        }
    }
