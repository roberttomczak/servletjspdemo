package com.example.servletjspdemo.web;




public class users {
    String username;
    String email;
    String choice;
    String hobby;
    String  car;
    int age;
    

    public void setchoice( String value )
    {
    	choice = value;
    }
    
    public void sethobby( String value )
    {
    	hobby = value;
    }
    
    public void setcar( String value )
    {
    	car = value;
    }
    
    public void setUsername( String value )
    {
        username = value;
    }

    public void setEmail( String value )
    {
        email = value;
    }

    public void setAge( int value )
    {
        age = value;
    }
    public String getchoice() { return choice; }
    
    public String gethobby() { return hobby; }
    
    public String getcar() { return car; }
    
    public String getUsername() { return username; }

    public String getEmail() { return email; }

    public int getAge() { return age; }
}