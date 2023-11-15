package SoftwareCon4;

public class Total {
    private Discounter paytime;

    public void setPaytime(Discounter paytime) {
        this.paytime = paytime;
    }

    public double applyDiscount() {
        return paytime.applyDiscount(100.00); // ค่าสินค้า 100.00 บาท
    }
}