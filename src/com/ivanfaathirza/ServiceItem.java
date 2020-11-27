package com.ivanfaathirza;

public interface ServiceItem {
    public void displayService();
    public float getPrice(int serviceItem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);

}
