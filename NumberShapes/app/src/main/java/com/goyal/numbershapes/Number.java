package com.goyal.numbershapes;

/**
 * Created by Goyal on 7/4/2017.
 */

public class Number {

    int number;

    public boolean isTriangular(){
        int x = 1;
        int triangularNumber = 1;
        while(triangularNumber < number){
            x++;
            triangularNumber += x;
        }

        if(triangularNumber == number){
            return  true;
        }

        return  false;
    }

    public boolean isSquare(){
        for(int i=0; i < number/2; i++){
            if(i*i == number){
                return  true;
            }
        }

        return  false;
    }
}
