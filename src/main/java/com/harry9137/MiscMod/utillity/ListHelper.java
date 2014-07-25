package com.harry9137.MiscMod.utillity;

public class ListHelper {
    private static String tempVal;
    private static int tempInt = 0;
    private static boolean exepNotThrown = true;
    public static int findLength(String[] list){
        tempInt = 0;
        exepNotThrown = true;
        while(exepNotThrown){
            try {
                tempVal = list[tempInt];
            }
            catch(Exception ArrayIndexOutOfBoundsException){
                exepNotThrown = false;
            }
            finally{
                if(exepNotThrown){
                    tempInt++;
                }
                else{
                    tempInt--;
                }
            }
        }

        return tempInt;
    }

    public static String[] addToList(String[] list, String addition) {
        tempInt = 0;
        String[] newArray;
        newArray = new String[findLength(list) + 2];
        while(tempInt <= findLength(list)){
            newArray[tempInt] = list[tempInt];
            tempInt++;
        }
        newArray[findLength(list) + 1] = addition;
        return newArray;
    }
}

