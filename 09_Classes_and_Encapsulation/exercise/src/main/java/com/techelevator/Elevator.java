package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen = false;

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;

    }

    public void openDoor() {
        if (doorOpen == false) {
            doorOpen = true;
        }
    }

    public void closeDoor() {
        if (doorOpen == true) {
            doorOpen = false;
        }
    }

    public void goUp(int desiredFloor) {
        if (doorOpen == false && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
            currentFloor = desiredFloor;
        }
    }

    public void goDown(int desiredFloor) {
        if (doorOpen == false && desiredFloor < currentFloor && desiredFloor >= 1) {
            currentFloor = desiredFloor;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
