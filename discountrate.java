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
public class discountrate{
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;


    public static double getServiceDiscountRate(String memberType){
        if ("Premium".equals(memberType)){
            return serviceDiscountPremium;
        }else if("Gold".equals(memberType)){
            return serviceDiscountGold;
        }else if ("Silver".equals(memberType)){
            return serviceDiscountSilver;
        }else{
            return 0;
        }  
    }
    
    public void setServiceDiscountRate(String memberType){
        discountrate.getProductDiscountRate(memberType);
    }
   
    public static double getProductDiscountRate(String memberType){
         if ("Premium".equals(memberType)){
            return productDiscountPremium;
        }else if("Gold".equals(memberType)){
            return productDiscountGold;
        }else if ("Silver".equals(memberType)){
            return productDiscountSilver;
        }else{
            return 0;
        }  
    }
}
   
