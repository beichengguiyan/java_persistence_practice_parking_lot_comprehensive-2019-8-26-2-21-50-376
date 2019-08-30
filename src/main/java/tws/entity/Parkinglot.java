package tws.entity;

public class Parkinglot {
    private int parkingLotID;
    private int availablePositionCount ;
    private int count ;
    private int id;
	public Parkinglot() {
	}
	public Parkinglot(int parkingLotID, int availablePositionCount, int count, int id) {
		this.parkingLotID = parkingLotID;
		this.availablePositionCount = availablePositionCount;
		this.count = count;
		this.id = id;
	}
	public int getParkingLotID() {
		return parkingLotID;
	}
	public void setParkingLotID(int parkingLotID) {
		this.parkingLotID = parkingLotID;
	}
	public int getAvailablePositionCount() {
		return availablePositionCount;
	}
	public void setAvailablePositionCount(int availablePositionCount) {
		this.availablePositionCount = availablePositionCount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
