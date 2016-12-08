/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializabilityTest;
import java.io.Serializable;
/**
 *
 * @author pawan
 */
public class MyObj implements Serializable
{
    String A,B;
    public String getA()
    {return A;}
    public String getB()
    {return B;}
    public void setA(String A)
    {this.A = A;}

    /**
     *
     * @param B
     */
    public void setB(String B)
    {this.B = B;}
}
