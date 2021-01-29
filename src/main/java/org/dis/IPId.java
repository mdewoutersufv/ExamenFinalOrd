package org.dis;

import java.io.Serializable;
import java.util.Objects;

public class IPId implements Serializable {

    private long ip_from;
    private long ip_to;

    public IPId() {
    }

    public IPId(long ip_from, long ip_to) {
        this.ip_from = ip_from;
        this.ip_to = ip_to;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IPId IPId = (IPId) o;
        return ip_from == (IPId.ip_from) &&
                ip_to == (IPId.ip_to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip_from, ip_to);
    }
}