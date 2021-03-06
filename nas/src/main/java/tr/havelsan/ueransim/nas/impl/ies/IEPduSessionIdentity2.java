package tr.havelsan.ueransim.nas.impl.ies;

import tr.havelsan.ueransim.nas.core.ies.InformationElement3;
import tr.havelsan.ueransim.utils.OctetInputStream;
import tr.havelsan.ueransim.utils.OctetOutputStream;
import tr.havelsan.ueransim.utils.octets.Octet;

public class IEPduSessionIdentity2 extends InformationElement3 {
    public Octet value;

    public IEPduSessionIdentity2() {
    }

    public IEPduSessionIdentity2(Octet value) {
        this.value = value;
    }

    @Override
    protected IEPduSessionIdentity2 decodeIE3(OctetInputStream stream) {
        var res = new IEPduSessionIdentity2();
        res.value = stream.readOctet();
        return res;
    }

    @Override
    public void encodeIE3(OctetOutputStream stream) {
        stream.writeOctet(value);
    }
}
