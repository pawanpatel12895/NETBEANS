/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsytem;

/**
 *
 * @author pawan
 */
public class Book 
{   Long id;
    String title,author,discription;
    int numberofCopies;
    
    void setid(Long id)
    {   this.id = id;  }
    void settitle(String title)
    {   this.title = title; }
    void setauthor(String author)
    {   this.author = author;   }
    void setdiscription(String discription)
    {   this.discription = discription; }
    void setnumberofCopies(int numberofCopies)
    {   this.numberofCopies = numberofCopies;}
    
    Long getid(){return id;}
    String gettitle(){return title;}
    String getauthor(){return author;}
    String getdiscription(){return discription;}
    int getnumberofCopies(){return numberofCopies;}
}
