class Instagram
{  
    // defining Private data fields
    private  int id ;
    private String name ;
    private String email ;
    private String password ;

    // defining a constructor 
    public Instagram( int id , String name , String email , String password )
    {  
      this.id = id ;
      this.name = name ;
      this.email = email ;
      this.password = password ;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public string getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.eamil = eamil;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
}

class Mainclass
{  
    public static void main(string[] args)
    {
        Instagram i = new Instagram(1 , "Kiran" , "kiran@gmail.com" , "kiran123");

        System.out.println(" id : " +i.getId());
        System.out.println(" name : " +i.getName());
        System.out.println(" Email : " +i.getEmail());
        System.out.println(" Password : " +i.getPassword());
        
    }
}
  
