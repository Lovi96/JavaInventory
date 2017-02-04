class BookProduct extends Product {
    private int pageSize;

    BookProduct(String name, Integer size, int pageSize) {
        super(name, size);
        this.pageSize = pageSize;
    }
}
