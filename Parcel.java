class Parcel {
  public int mLength;
  public int mWidth;
  public int mHeight;
  public int mWeight;

  public Parcel(int length, int width, int height, int weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
  }

  public Integer costToShip() {
    int volume = mWidth * mHeight * mLength;
    int totalCost = 5 + (volume/8) + (mWeight/2);
    return totalCost;
  }
}
