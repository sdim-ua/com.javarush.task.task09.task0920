//package com.javarush.task.task09.task0920;

import java.io.IOException;
/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
           
            System.out.println(i);
            try{
                Thread.sleep(100);
                
            }
            catch(Exception exception){
                
            }
            //напишите тут ваш код
            
        }
    }
}
