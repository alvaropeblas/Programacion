import java.math.BigDecimal;

public class SameAndEquals {
    private BigDecimal b1;
    private BigDecimal b2;
    private BigDecimal b3;

    private int i1;
    private int i2;


    public SameAndEquals() {
        b1 = new BigDecimal(10.5);
        b2 = new BigDecimal(10.5);
        b3 = b1;
        i1 = 10;
        i2 = 10;
    }


    public BigDecimal getB1() {
        return b1;
    }


    public void setB1(BigDecimal b1) {
        this.b1 = b1;
    }


    public BigDecimal getB2() {
        return b2;
    }


    public void setB2(BigDecimal b2) {
        this.b2 = b2;
    }


    public BigDecimal getB3() {
        return b3;
    }


    public void setB3(BigDecimal b3) {
        this.b3 = b3;
    }


    public int getI1() {
        return i1;
    }


    public void setI1(int i1) {
        this.i1 = i1;
    }


    public int getI2() {
        return i2;
    }


    public void setI2(int i2) {
        this.i2 = i2;
    }

    
}
