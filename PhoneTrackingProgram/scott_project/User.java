import java.io.Serializable;

public class User implements Serializable{
  private String userName;
  private String userEmail;
  private String password;

  public User(){}

  public User(String userName, String userEmail, String password){
    this.userName = userName;
    this.userEmail = userEmail;
    this.password = password;
  }

  public String getUserName(){
    return this.userName;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }
}
