
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ManagerChatter extends JFrame implements Runnable{

	private JPanel contentPane;
	//private JTextField txtSeverPort;
	int txtSeverPort = 12340;
	ServerSocket srvSocket = null;
	BufferedReader bf;
	Thread t;
	private JTabbedPane tabbedPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public ManagerChatter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(249, 204, 243));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		
		lblNewLabel = new JLabel("MANAGER CHATTER");
		lblNewLabel.setBackground(new Color(252, 218, 248));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(249, 206, 244));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-chat-50.png"));
		panel.add(lblNewLabel_1);
		
//		JLabel lblNewLabel = new JLabel("Manager Port");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//		panel.add(lblNewLabel);
//		
//		txtSeverPort = new JTextField();
//		txtSeverPort.setText("12340");
//		panel.add(txtSeverPort);
//		txtSeverPort.setColumns(10);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		this.setSize(600, 300);
		//int severPort = Integer.parseInt(txtSeverPort.getText());
		try {
			srvSocket = new ServerSocket(txtSeverPort);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		t = new Thread(this);
		t.start();
		
	}
	public void run() {
		while(true) {
			try {
				Socket aStaffSocket = srvSocket.accept();
				if(aStaffSocket != null) {
					bf = new BufferedReader(new InputStreamReader(aStaffSocket.getInputStream()));
					String S = bf.readLine();
					int pos = S.indexOf(":");
					String staffName = S.substring(pos+1);
					ChatPanel p = new ChatPanel(aStaffSocket, "Manager", staffName);
					tabbedPane.add(staffName, p);
					p.updateUI();
				}
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
            
        ManagerChatter mn = new ManagerChatter();
		mn.setVisible(true);
	}
}