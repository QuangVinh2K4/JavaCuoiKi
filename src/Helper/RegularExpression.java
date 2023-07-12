/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class RegularExpression {
     public static void CheckUserName(JTextField field , JPanel panel){
         String regex ="[A-Za-z0-9_]+";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(field.getText());
         if(matcher.find()){
            
         }else{
             MessageDialogHelper.showErrorDialog(panel, "Tên Đăng Nhập Bao Gồm Số Và Chữ Không Các Kí Tự Khác", "Lỗi");
         }
    }
     public static void CheckNumberPhone(JTextField field, StringBuilder sb, String errorMessage){
        if(field.getText().matches("^\\\\d{10}$")){
            sb.append(errorMessage).append("\n");           
            field.requestFocus();
        }
    }
}
