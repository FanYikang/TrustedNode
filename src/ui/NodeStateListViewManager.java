/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import client.Node;
import util.Log;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author footman
 */
public class NodeStateListViewManager {
    private JTree jTree;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode rootNode;
    
    public NodeStateListViewManager(JTree jTree) {
        this.jTree = jTree;
        rootNode = new DefaultMutableTreeNode("�û��б�");
        treeModel = new DefaultTreeModel(rootNode);
        this.jTree.setModel(treeModel);
    }
    
    public void updateClientState(Node nodeUpdate) {
		for (int i=0;i<rootNode.getChildCount();i++){
			TreeNode treeNode = rootNode.getChildAt(i);
//            System.out.println(treeNode.toString());
			if (treeNode.toString().equals(nodeUpdate.getName())){
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)treeNode;
				if (nodeUpdate.isOnline() && nodeUpdate.isValid()){
				    //ɾ����״̬�����ߣ����š� ��һ��
                    node.remove(2);

                    node.add(new DefaultMutableTreeNode("״̬�����ߣ�����"));
                    Log.i(this.getClass().getName(), nodeUpdate.getName() + " �ѵ�¼,״̬����.");

				}else if (nodeUpdate.isOnline() && !nodeUpdate.isValid()){
					node.remove(2);
                    node.add(new DefaultMutableTreeNode("״̬�����ߣ�������"));
                    Log.v(this.getClass().getName(), nodeUpdate.getName() + "״̬�����ţ�IP��ַΪ:" + nodeUpdate.getIP());
				}else{
					node.remove(2);
                    node.add(new DefaultMutableTreeNode("״̬������"));
                    Log.i(this.getClass().getName(), nodeUpdate.getName() + "�����ߣ�IP��ַΪ:" + nodeUpdate.getIP());
				}
				this.jTree.updateUI();
				return;
			}
		}
	}
	
	public void addClientToList(Node nodeUpdate){
            DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(nodeUpdate.getName());
            treeNode.add(new DefaultMutableTreeNode("������" + nodeUpdate.getName()));
            treeNode.add(new DefaultMutableTreeNode("IP��" + nodeUpdate.getIP()));
            if (nodeUpdate.isOnline() && nodeUpdate.isValid()){
                treeNode.add(new DefaultMutableTreeNode("״̬�����ߣ�����"));
                Log.i(this.getClass().getName(), nodeUpdate.getName() + "����Node,״̬����.");
            }else if (nodeUpdate.isOnline() && !nodeUpdate.isValid()){
            	treeNode.add(new DefaultMutableTreeNode("״̬�����ߣ�������"));
                Log.v(this.getClass().getName(), nodeUpdate.getName() + "����Node��״̬������.");
            }else{
                treeNode.add(new DefaultMutableTreeNode("״̬������"));
                Log.i(this.getClass().getName(), nodeUpdate.getName() + "����Node,״̬ : ����.");
            }
            rootNode.add(treeNode);
            this.jTree.updateUI();
	}
}
