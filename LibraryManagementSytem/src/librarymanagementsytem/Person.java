/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 *
 * @author pawan
 */
public class Person    
{   Long id;
    String name,address;
    
    void setid(Long id){this.id = id;}
    void setname(String name){this.name = name; }
    void setaddress(String address){this.address = address;}
    
    Long getid(){return id;}
    String getname(){return name;}
    String getaddress(){return address;}
    
}
