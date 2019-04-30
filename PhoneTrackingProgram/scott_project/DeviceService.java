import java.io.ObjectOutputStream;
import java.io.FileOutputStream;


public class DeviceService {

  public static void main(String[] args) {
    User user = new User("Scott", "scotthancock@gmail.com", "UserName");
    Location loc = new Location(-122.07871769999998f, 37.3933521f);
    Device device = new Device("ScottsDeviceID", "ScottsDeviceName", user, loc);

    writeDeviceToDisk(device);
  }

  public void registerDevice(Device device){
    // Do some validations if necessary
    writeDeviceToDisk(device);
  }

  private static void writeDeviceToDisk(Device device) {

		try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(device.getDeviceId()));
			oos.writeObject(device);
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

  private static Device retrieveDeviceFromDisk(String deviceId) {

    try{

    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return null;
  }

  private static void reportDeviceLost(String deviceId) {
    try {
    Device device = retrieveDeviceFromDisk(deviceId);
    if(device != null){
      // Do validation
      device.setIsLost(true);
    }

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
