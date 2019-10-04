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
public class customer {
    private String name;
    private boolean member = false;
    private String memberType;
    
    public customer(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isMember(){
     return member;
    }
     
            
    public void setMember(boolean member){
        this.member = member;
        }
    
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }
    
    public String getMemberType(){
        return memberType;
    }

    @Override
    public String toString() {
        System.out.println("Name = " + name + ", Member = " + member + ", Member Type = " + memberType );
        return "customer{" + "name=" + name + ", member=" + member + ", memberType=" + memberType + '}';
    }
    
}

    
    
