import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
	public Main(){
		this.setLayout(null);
		JLabel jLabel = new JLabel();
		jLabel.setText("QQ");//Ҫʵ�ֵ�����
		jLabel.setFont(new java.awt.Font("Dialog",1,15));
		
		jLabel.setBounds(10,5,30,30);//���ÿؼ���λ��
		this.add(jLabel);//����ŵ�������
		
		JLabel jlabel = new JLabel();
		jlabel.setText("�˺�");//Ҫʵ�ֵ�����
		jlabel.setBounds(25, 40, 150, 20);//���ÿؼ���λ��
		this.add(jlabel);//����ŵ�������

		JTextArea jTextArea = new JTextArea();//����ؼ�
		jTextArea.setBounds(65, 40, 150, 20);//���ÿؼ���λ��
		this.add(jTextArea);//����ŵ�������
		
		JLabel label = new JLabel();
		label.setText("����");//Ҫʵ�ֵ�����
		label.setBounds(25, 70, 150, 20);//���ÿؼ���λ��
		this.add(label);//����ŵ�������

		JPasswordField text = new JPasswordField (); 
		text.setBounds(65, 70, 150, 20);
		text.setEchoChar('*');
		this.add(text);

		JButton jButton = new JButton();//����ؼ�
		jButton.setText("��¼");//����ʵ��
		jButton.setBounds(65, 100, 150, 20);//���ÿؼ���λ��
		this.add(jButton);//����ŵ�������
		
		this.setBounds(300,200,300,200);//���崰�ڴ�С
		this.setVisible(true);//���崰���Ƿ�ɼ�
	}
	public static void main(String[] args) {
		new Main();
	}
}