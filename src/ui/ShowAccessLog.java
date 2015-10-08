package ui;

import accessPackage.RSAPackage0;
import accessPackage.RSAPackage1;
import accessPackage.RSAPackage2;
import accessPackage.RSAPackage3;
import util.Tools;

import javax.swing.*;
import java.security.interfaces.RSAPublicKey;

/**
 * Created by firefix on 2015/10/4.
 */
public class ShowAccessLog {

    public static void showReceiveRSA0Package(JTextArea jTextArea_log, RSAPackage0 p0){
        jTextArea_log.append("�յ��������� Package 0\n");
        jTextArea_log.append("������Ϊ��" + p0.getName() + ", IP ��ַΪ + " + p0.getIP() + "\n");
        jTextArea_log.append("��������Ϊ�� " + p0.getRequest() + "\n");
    }

    public static void showReceiveRSA1Package(JTextArea jTextArea_log, RSAPackage1 p1) {
        jTextArea_log.append("�յ��������� Package 1 \n");
        jTextArea_log.append("������Ϊ" + p1.getName() + ", IP��ַΪ" + p1.getIP() +"\n");
        RSAPublicKey pk = p1.getRSAPublicKey();
        jTextArea_log.append(p1.getName() + "�Ĺ�ԿΪ��" + pk.toString() + "\n");

    }

    public static void showReceiveRSA2Package(JTextArea jTextArea_log, RSAPackage2 p2) {
        jTextArea_log.append("�յ��������� Package 2\n");
        jTextArea_log.append("������Ϊ " + p2.getName() + "\n");
        RSAPublicKey pk = p2.getRSAPublicKey();
        jTextArea_log.append(p2.getName() + "�Ĺ�ԿΪ��" + pk.toString() + "\n");
        jTextArea_log.append("Э�̲����ĻỰ��ԿΪ��" + Tools.parseByte2HexStr(p2.getAESKey()) + "\n");

    }

    public static void showReceiveRSA3Package(JTextArea jTextArea_log, RSAPackage3 p3) {
        jTextArea_log.append("�յ��������� Pacakge 3 \n");
        jTextArea_log.append("������Ϊ " + p3.getName() + "\n");
        jTextArea_log.append("Э�̲����ĻỰ��ԿΪ��" + Tools.parseByte2HexStr(p3.getAESKey()) + "\n");
    }

    public static void showSendRSA0Package(JTextArea jTextArea_log, RSAPackage0 p0){
        jTextArea_log.append("���ͽ������� Package 0\n");
        jTextArea_log.append("��������Ϊ�� " + p0.getRequest() + "\n");
    }

    public static void showSendRSA1Package(JTextArea jTextArea_log, RSAPackage1 p1) {
        jTextArea_log.append("�յ��������� Package 1 \n");
        RSAPublicKey pk = p1.getRSAPublicKey();
        jTextArea_log.append("Э�̵Ĺ�ԿΪ��" + pk.toString() + "\n");

    }

    public static void showSendRSA2Package(JTextArea jTextArea_log, RSAPackage2 p2) {
        jTextArea_log.append("�յ��������� Package 2\n");
        RSAPublicKey pk = p2.getRSAPublicKey();
        jTextArea_log.append("Э�̵Ĺ�ԿΪ��" + pk.toString() + "\n");
        jTextArea_log.append("Э�̲����ĻỰ��ԿΪ��" + Tools.parseByte2HexStr(p2.getAESKey()) + "\n");

    }

    public static void showSendRSA3Package(JTextArea jTextArea_log, RSAPackage3 p3) {
        jTextArea_log.append("�յ��������� Pacakge 3 \n");
        jTextArea_log.append("Э�̲����ĻỰ��ԿΪ��" + Tools.parseByte2HexStr(p3.getAESKey()) + "\n");
    }



}
