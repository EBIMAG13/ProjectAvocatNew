package com.example.projectavocatnew;


public class Login {
    private String FirstName;
    private String LastName;
    private String Gmail;
    private String Password;
    public Login (String Fname, String Lname, String gmail, String password)
    {
        this.FirstName=Fname;
        this.LastName=Lname;
        this.Gmail=gmail;
        this.Password=password;

    };
    public Login()
    {};
    void setFirstName(String fname)
    {
        this.FirstName=fname;
    }
    void setLastName(String lastName)
    { this.LastName=lastName;
    }
    void setGmail(String gmail)
    {
        this.Gmail=gmail;
    }
    void setPassword(String password)
    {
        this.Password=password;
    }
    String getFirstName()
    {
        return this.FirstName;
    }
    String getLastName ()
    {
        return  this.LastName;
    }
    String getGmail()
    {
        return  this.Gmail;
    }
    String getPassword()
    {
        return this.Password;
    }







    //void setFirstName(String Fname)
}
