/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author AJO
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       customer a = new customer ("Ala");
       visit aa = new visit ("Ala" , "1 Oktober 2019");
       a.isMember();
       a.setMember(true);
       a.setMemberType("Premium");
       a.toString();
       aa.setMemberType("Premium");
       aa.setServiceExpense(982758);
       aa.setProductExpense(98275.8);
       aa.setTotalExpense(982758 , 98275.8);
       aa.getTotalExpense();
       aa.toString();
               
       customer b = new customer ("Bala");
       visit bb = new visit ("Bala","2 Oktober 2019" );
       b.isMember();
       b.setMember(true);
       b.setMemberType("Gold");
       b.toString();
       bb.setMemberType("Gold");
       bb.setServiceExpense(982758);
       bb.setProductExpense(98275.8);
       bb.setTotalExpense(982758 , 98275.8);
       bb.getTotalExpense();
       bb.toString();
       
       customer c = new customer ("Cala");
       visit cc = new visit ("Cala" , "3 Oktober 2019" );
       c.isMember();
       c.setMember(true);
       c.setMemberType("Silver");
       c.toString();
       cc.setMemberType("Silver");
       cc.setServiceExpense(982758);
       cc.setProductExpense(98275.8);
       cc.setTotalExpense(982758 , 98275.8);
       cc.getTotalExpense();
       cc.toString();
       
       customer d = new customer ("Dala");
       visit dd = new visit ("Dala", "4 Otober 2019");
       d.isMember();
       d.setMember(false);
       d.setMemberType("Tidak ada");
       d.toString();
       dd.setMemberType("Tidak ada");
       dd.setServiceExpense(982758);
       dd.setProductExpense(98275.8);
       dd.setTotalExpense(982758 , 98275.8);
       dd.getTotalExpense();
       dd.toString();
    }
    
    
}
