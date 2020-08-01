package com.sda.zad8;

public class ParcelValidatorHubert implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        boolean isSumOfLength = parcel.getxLength() + parcel.getyLength() + parcel.getzLength() < 300;
        boolean isLengthToHigh = parcel.getxLength() > 30 || parcel.getyLength() > 30 || parcel.getzLength() > 30;
        boolean validNotExpress = parcel.getWeight() < 30 && !parcel.isExpress();
        boolean validExpress = parcel.getWeight() < 15 && parcel.isExpress();
        return isSumOfLength && !isLengthToHigh && (validNotExpress || validExpress);
    }
}
