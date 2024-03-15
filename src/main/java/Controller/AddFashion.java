/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Fashion;
import java.util.List;
import static GUI.trangchu.fashionList;

public class AddFashion {
      public static void Add(String txtName, String txtId, String txtColor, String txtMaterial, String txtBrand, String txtLength, String txtWidth, String txtAmount, String txtDate, List<Fashion> FashionList) {
            String name = txtName;
            int id = Integer.parseInt(txtId);
            String color = txtColor;
            String material = txtMaterial;
            String brand = txtBrand;
            double length = Double.parseDouble(txtLength);
            double width = Double.parseDouble(txtWidth);
            int amount = Integer.parseInt(txtAmount);
            String date = txtDate;
            Fashion fashion = new Fashion(name, id, color, material, brand, length, width, amount, date);
            fashionList.add(fashion);
        }
}
