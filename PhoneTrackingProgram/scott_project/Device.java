import java.io.Serializable;

public class Device implements Serializable{

  private String deviceId;
  private String deviceName;
  private User owner;
  private Location currentLocation; // Might want to do this, might now. Just a thought
  private boolean isLost;

  public Device(){

  }

  public Device(String deviceId, String deviceName, User owner, Location location){
    this.deviceId = deviceId;
    this.deviceName = deviceName;
    this.owner = owner;
    this.currentLocation = location;
    this.isLost = false;
  }

  public String getDeviceId(){
    return this.deviceId;
  }

  public void setDeviceId(String deviceId){
    this.deviceId = deviceId;
  }

  public boolean getIsLost(){
    return this.isLost;
  }

  public void setIsLost(boolean isLost){
    this.isLost = isLost;
  }
}
