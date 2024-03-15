/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Fashion;

import java.util.List;

public class FindByMonth extends FindFashion {

    @Override
    public void Find(String input, List<Fashion> listFind, List<Fashion> fashionList) {
       try{
           findByMonth(input.trim(), fashionList, listFind);
        }catch (Exception e) {
                e.printStackTrace();
        }
    }
    
      public static void findByMonth(String month, List<Fashion> fashionList, List<Fashion> listFind) {
        for (Fashion fashion : fashionList) {
            String []s = fashion.getDate().split("/");
            if (s[0].equalsIgnoreCase(month)){
                listFind.add(fashion);
            }
        }
    }
      
}