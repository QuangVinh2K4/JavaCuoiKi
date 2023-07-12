
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ChatPanel extends JPanel {
	Socket socket = null;
	BufferedReader bf = null;
	DataOutputStream os = null;
	OutputThread t = null;
	String sender;
	String receiver;
	JTextArea txtMessages; 
	JPanel pn = new JPanel();
	public ChatPanel(Socket s, String sender, String receiver) {
		this.socket = s;
		this.sender = sender;
		this.receiver = receiver;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Message", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JTextArea txtMessage = new JTextArea();
		txtMessage.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		scrollPane.setViewportView(txtMessage);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		add(scrollPane_1, BorderLayout.CENTER);
		
		txtMessages = new JTextArea();
		txtMessages.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtMessages.setBackground(new Color(196, 244, 211));
		scrollPane_1.setViewportView(txtMessages);
		
		JButton btnSend = new JButton("SEND");
		btnSend.setBackground(new Color(128, 255, 128));
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSend.setForeground(new Color(0, 128, 255));
		btnSend.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\icons8-send-32.png"));
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtMessage.getText().trim().length()==0) return;
				try {
					os.writeBytes(txtMessage.getText());
					os.write(13);
					os.write(10);
					os.flush();
					txtMessages.append("\n"+sender+": "+txtMessage.getText());
					txtMessage.setText("");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		panel.add(btnSend);
		try {
			bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			os = new DataOutputStream(socket.getOutputStream());
			t = new OutputThread(s, txtMessages, sender, receiver);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//pn.setVisible(true);		
	}
	public JTextArea getTxtMessages() {
		return this.txtMessages;		
	}
}