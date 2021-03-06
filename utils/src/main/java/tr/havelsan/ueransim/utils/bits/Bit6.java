package tr.havelsan.ueransim.utils.bits;

public final class Bit6 extends BitN {

    public Bit6(int value) {
        super(value, 6);
    }

    public Bit6(Bit bit5, Bit bit4, Bit bit3, Bit bit2, Bit bit1, Bit bit0) {
        super(bit5, bit4, bit3, bit2, bit1, bit0);
    }

    public Bit6(int bit5, int bit4, int bit3, int bit2, int bit1, int bit0) {
        super(bit5, bit4, bit3, bit2, bit1, bit0);
    }
}