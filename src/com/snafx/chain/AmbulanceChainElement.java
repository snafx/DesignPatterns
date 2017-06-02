package com.snafx.chain;

public class AmbulanceChainElement implements ChainElement {
    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 999;
    }

    @Override
    public void doAction() {
        System.out.println("Calling Ambulance");
    }
}
