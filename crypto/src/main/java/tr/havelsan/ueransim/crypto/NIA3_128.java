package tr.havelsan.ueransim.crypto;

import tr.havelsan.ueransim.utils.bits.Bit;
import tr.havelsan.ueransim.utils.bits.Bit5;
import tr.havelsan.ueransim.utils.bits.BitString;
import tr.havelsan.ueransim.utils.octets.Octet4;
import tr.havelsan.ueransim.utils.octets.OctetString;

public class NIA3_128 {

    public static Octet4 computeMac(Octet4 count, Bit5 bearer, Bit direction, BitString message, OctetString key) {
        return EIA3_128.computeMac(count, bearer, direction, message, key);
    }
}
