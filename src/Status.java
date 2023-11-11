public enum Status {

    SUCCESS(200), FAILED(400), BLOCK, REJECT(500);

    private int i;
    Status() {
        this.i = i;
    }
    Status(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

