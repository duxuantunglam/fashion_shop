/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Fashion;

import java.util.List;

public class FindByBrand extends FindFashion {

    @Override
    public void Find(String input, List<Fashion> listFind, List<Fashion> fashionList) {
       try{
           findByBrand(input.trim(), fashionList, listFind);
        }catch (Exception e) {
                e.printStackTrace();
        }
    }
    
      public static void findByBrand(String brand, List<Fashion> fashionList, List<Fashion> listFind) {
        for (Fashion fashion : fashionList) {
            if (fashion.getBrand().equalsIgnoreCase(brand)){
                listFind.add(fashion);
            }
        }
    }
}