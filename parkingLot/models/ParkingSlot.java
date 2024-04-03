package parkingLot.models;

public class ParkingSlot extends  BaseModel{
    private VehicleType vehicleType;
    private ParkingStatus parkingStatus;
    private  int number;

    private ParkingFloor floor;

    public VehicleType getVechileType() {
        return vehicleType;
    }

    public void setVechileType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }
}
