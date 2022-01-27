

public class User {
    

    private String name ;
    private int age ;
    private String UserName;
    private String Password ;

 
User(String name ,int age , String UserName ,String Password )
    {
      this.name =name;
      this.age=age;
      this.UserName=UserName;
      this.Password=Password;
    }
    
  public void SetUserName(String Uname)
    {
      this.UserName=Uname;
    }
    public String getUserName()
    {
        return UserName;
    }
    public void SetPassword(String P)
    {
      this.Password=P;
    }
    public String getPassword()
    {
        return Password;
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\nAge: " + age;
    }
    

    
}


