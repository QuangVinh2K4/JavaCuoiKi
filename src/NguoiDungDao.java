import Helper.DBConnection;
import Helper.NguoiDung;
import Helper.PasswordEncoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matKhau) throws Exception {
        String sql = "SELECT ten_Dang_Nhap, mat_Khau FROM Nguoi_Dung WHERE ten_Dang_Nhap = ?";

        try (Connection con = DBConnection.getconection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, tenDangNhap);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String storedPassword = rs.getString("mat_Khau");
                    if (storedPassword.equals(PasswordEncoder.encodePassword(matKhau))) {
                        NguoiDung nguoiDung = new NguoiDung();
                        nguoiDung.setTenDangNhap(tenDangNhap);
                        nguoiDung.setMatKhau(storedPassword);
                        return nguoiDung;
                    }
                }
                return null;
            }
        }
    }
    public NguoiDung CheckRegister(String tenDangNhap)
            throws Exception {
        String sql = "select ten_Dang_Nhap from Nguoi_Dung" +
                " WHERE Ten_Dang_Nhap=? ";
        try (
                Connection con = DBConnection.getconection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {

            pstmt.setString(1, tenDangNhap);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    return nd;
                }
            }
            return null;
        }
    }

    public boolean Insert( NguoiDung nd)
            throws Exception{
        String sql = "INSERT INTO [dbo].[Nguoi_Dung]([Ten_Dang_Nhap],[Mat_Khau],[Vai_Tro])"
                + " values(?,?,?)";
        try(
                Connection con = DBConnection.getconection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ){

            pstmt.setString(1,nd.getTenDangNhap());
            pstmt.setString(2,nd.getMatKhau());
            pstmt.setString(3,nd.getVaiTro());

            return pstmt.executeUpdate()>0;
        }

    }
    public boolean Delete( String maNhanVien)
            throws Exception{
        String sql = "DELETE FROM [dbo].[Nguoi_Dung]" +
                " WHERE Nguoi_Dung.Ma_Nhan_Vien = ?";
        try(
                Connection con = DBConnection.getconection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ){

            pstmt.setString(1,maNhanVien );

            return pstmt.executeUpdate()>0;
        }

    }
    }

