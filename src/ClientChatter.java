
import Helper.ShareData;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ClientChatter extends JFrame {

	private JPanel contentPane;
	//private JTextField txtStaff;
	//private JTextField txtSeverIP;
	private JTextField txtPort;
	
	Socket mngSocket = null;
	String mngIP = "";
	int mngPort = 12340;
	String staffName = "";
	BufferedReader bf = null;
	DataOutputStream os = null;
	OutputThread t = null;

	public ClientChatter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 485);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(249, 204, 243));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 7, 0, 0));
		
		JLabel lblNewLabel = new JLabel("CHAT");
		lblNewLabel.setBackground(new Color(252, 218, 248));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-chat-50.png"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hi!  "+ShareData.nguoiDangNhap.getTenDangNhap());
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblNewLabel_2);
		
//		JLabel lblNewLabel = new JLabel("Staff: ");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//		panel.add(lblNewLabel);
		
		//txtStaff = new JTextField();
		//panel.add(txtStaff);
		//txtStaff.setColumns(10);
		
//		JLabel lblNewLabel_1 = new JLabel("Mng IP: ");
//		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
//		panel.add(lblNewLabel_1);
		
//		txtSeverIP = new JTextField();
//		panel.add(txtSeverIP);
//		txtSeverIP.setColumns(10);
		
//		JLabel lblNewLabel_2 = new JLabel("Port: ");
//		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
//		panel.add(lblNewLabel_2);
//		
//		txtPort = new JTextField();
//		panel.add(txtPort);
//		txtPort.setColumns(10);
//		txtPort.setText("12340");
		
		JFrame thisFrame = this;
		
		mngIP = "";
                staffName=ShareData.nguoiDangNhap.getTenDangNhap();
		//mngPort = Integer.parseInt(txtPort.getText());
//		staffName = "Thắng";
                
		try {
			mngSocket = new Socket(mngIP, mngPort);
                        if(mngSocket!= null) {
				ChatPanel p = new ChatPanel(mngSocket, staffName, "Manager");
				thisFrame.getContentPane().add(p);
				p.getTxtMessages().append("Manager is running");
				p.updateUI();
				bf = new BufferedReader(new InputStreamReader(mngSocket.getInputStream()));
				os = new DataOutputStream(mngSocket.getOutputStream());
				os.writeBytes("Staff: "+staffName);
				os.write(13);
				os.write(10);
				os.flush();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ClientChatter cl = new ClientChatter();
		cl.setVisible(true);
	}
}