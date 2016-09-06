class Parcel {
  public float mLength;
  public float mWidth;
  public float mHeight;
  public float mWeight;
  public float mVolume;
  public float mTotalCost;
  public float mWrappingCost;

  public Parcel(float length, float width, float height, float weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
  }

  public Float costToShip() {
    mVolume = mWidth * mHeight * mLength;
    mTotalCost = 5 + (mVolume/12) + (mWeight/4);
    return mTotalCost;
  }

  public Float costToWrap() {
    mWrappingCost = 2 * ((mHeight * mWidth) + (mHeight * mLength) + (mWidth * mLength)) / 50;
    return mWrappingCost;
  }
}
