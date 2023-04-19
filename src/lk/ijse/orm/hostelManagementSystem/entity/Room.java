package lk.ijse.orm.hostelManagementSystem.entity;

public class Room {
    private String roomID;
    private String type;
    private String availability;
    private double keyMoney;

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public double getKeyMoney() {
        return keyMoney;
    }

    public void setKeyMoney(double keyMoney) {
        this.keyMoney = keyMoney;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID='" + roomID + '\'' +
                ", type='" + type + '\'' +
                ", availability='" + availability + '\'' +
                ", keyMoney=" + keyMoney +
                '}';
    }
}
