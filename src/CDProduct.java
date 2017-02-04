class CDProduct extends Product {
    private int numOfTracks;

    CDProduct(String name, Integer price, int numOfTracks) {
        super(name, price);
        this.numOfTracks = numOfTracks;
    }
}
