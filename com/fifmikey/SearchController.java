package com.fifmikey;

public class SearchController {
    public static void main(String[] args) {
        String strOrig = "Hello readers";
        int intIndex = strOrig.indexOf("Hello123");
        if(intIndex == - 1){
            System.out.println("Hello not found111");
        }else{
            System.out.println("Found Hello at index "
                    + intIndex);
        }
    }
}
