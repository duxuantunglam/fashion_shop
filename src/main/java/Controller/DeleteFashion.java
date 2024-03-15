/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Fashion;

import javax.swing.*;
import java.util.List;

public class DeleteFashion {
    public static void Delete(List<Fashion> fashionList, int selectedIndex) {
         JFrame frame = new JFrame("About");
          if (selectedIndex >= 0) {
           fashionList.remove(selectedIndex);
            
        }     
    }
}
