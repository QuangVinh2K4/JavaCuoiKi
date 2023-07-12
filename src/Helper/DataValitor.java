/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class DataValitor {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage){
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");           
            field.requestFocus();
        }
    }
    public static void validateEmptyTextArea(JTextArea area, StringBuilder sb, String errorMessage){
        if(area.getText().equals("")){
            sb.append(errorMessage).append("\n");           
            area.requestFocus();
        }
    }
    public static void validateEmpty(JPasswordField field, StringBuilder sb, String errorMessage){
        String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.requestFocus();
        }
    }
    
}
