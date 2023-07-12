
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import XML.Xml;

public class OutputThread extends Thread{
	Socket socket;
	JTextArea txt;
	BufferedReader bf;
	String sender;
	String receiver;
	public OutputThread(Socket socket, JTextArea txt, String sender, String receiver) {
		super();
		this.socket = socket;
		this.txt = txt;
		this.sender = sender;
		this.receiver = receiver;
		try {
			bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
	    while (true) {
	        try {
	            if (socket != null) {
	                String message = "";
	                if ((message = bf.readLine()) != null && message.length() > 0) {
	                    txt.append("\n" + receiver + ": " + message);
	                    System.out.println("nguoi gui: " + receiver);
	                    System.out.println("nguoi nhan: " + sender);
	                    System.out.println("nd tin nhan: " + message);

	                    // Lưu lịch sử chat vào file XML
	                    saveToXML(sender, receiver, message);
	                }
	                sleep(5000);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	public void saveToXML(String sender, String receiver, String message) {
	    try {
	        // Tạo đối tượng DocumentBuilderFactory để tạo ra đối tượng DocumentBuilder
	        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

	        // Kiểm tra xem tài liệu XML đã tồn tại chưa, nếu chưa thì tạo mới
	        File file = new File("chat_history.xml");
	        Document doc;
	        Element rootElement;
	        if (file.exists()) {
	            // Nếu tài liệu XML đã tồn tại thì đọc nó vào và thêm thẻ message mới vào
	            doc = docBuilder.parse(file);
	            rootElement = doc.getDocumentElement();
	        } else {
	            // Nếu tài liệu XML chưa tồn tại thì tạo mới tài liệu và thêm thẻ gốc chat_history
	            doc = docBuilder.newDocument();
	            rootElement = doc.createElement("chat_history");
	            doc.appendChild(rootElement);
	        }

	        // Tạo thẻ message và các thuộc tính của nó
	        Element messageElement = doc.createElement("message");
messageElement.setAttribute("sender", sender);
	        messageElement.setAttribute("receiver", receiver);
	        messageElement.setTextContent(message);
	        rootElement.appendChild(messageElement);

	        // Tạo đối tượng TransformerFactory để tạo ra đối tượng Transformer
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

	        // Tạo đối tượng DOMSource và StreamResult để ghi tài liệu XML vào file
	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(file);

	        // Ghi tài liệu XML vào file
	        transformer.transform(source, result);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}