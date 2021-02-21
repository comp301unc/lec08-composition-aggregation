package com.comp301.lec08;

public class Room {
  private final String buildingName;
  private final int roomNumber;

  public Room(String buildingName, int roomNumber) {
    this.buildingName = buildingName;
    this.roomNumber = roomNumber;
  }

  @Override
  public String toString() {
    return buildingName + " " + roomNumber;
  }
}
