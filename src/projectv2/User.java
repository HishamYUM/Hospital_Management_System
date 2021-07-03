/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hms;
package projectv2;
/**
 *
 * @author Nihal
 */
//abstract
public class User {
    private String user;
    private String pass;

    public User(String u, String p)
    {
        user = u;
        pass = p;
    }

    public String getUsername()
    {
        return user;
    }

    public String getPassword()
    {
        return pass;
     }

    public void setUsername(String username)
    {
        this.user = username;
    }

    public void setPassword(String password)
    {
        this.pass = password;
    }

    
    

    
   
    
}
