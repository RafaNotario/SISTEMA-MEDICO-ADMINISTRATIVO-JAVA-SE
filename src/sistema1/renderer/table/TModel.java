package sistema1.renderer.table;

import javax.swing.table.DefaultTableModel;
/**
 * @web http://jc-mouse.net/
 * @author Mouse
 */
public class TModel extends DefaultTableModel{
    
/*    Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
    boolean[] canEdit = new boolean [] {
                false, false, false, false
            };
   */ 
    public TModel(String[][] mat,String[] cab){//String[][] mat
        //unos valores por default :)
         super( mat,cab);         
       
    }
    
  /*  @Override
    public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
          return canEdit [columnIndex];
    }*/
}
