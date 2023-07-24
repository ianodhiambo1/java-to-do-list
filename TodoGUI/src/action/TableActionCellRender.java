/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package action;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author mmo.hxh405
 */
public class TableActionCellRender extends DefaultTableCellRenderer {
 
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object obj, boolean bln, boolean bln1, int i, int i1){
        Component component =  super.getTableCellRendererComponent(jTable, obj, bln, bln1, i, i1);
    }
}
