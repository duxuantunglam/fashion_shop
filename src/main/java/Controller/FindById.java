/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Fashion;

import java.util.List;

public class FindById extends FindFashion {

    @Override
    public void Find(String input, List<Fashion> listFind, List<Fashion> fashionList) {
       try{
           findById(input.trim(), fashionList, listFind);
        }catch (Exception e) {
                e.printStackTrace();
        }
    }
    
      public static void findById(String id, List<Fashion> fashionList, List<Fashion> listFind) {
        for (Fashion fashion : fashionList) {
            if (String.valueOf(fashion.getId()).equalsIgnoreCase(id)){
                listFind.add(fashion);
            }
        }
    }
}