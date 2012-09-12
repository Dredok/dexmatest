package jvg.dexma;

public class Readings{
    private String seqnum;
    private String ts;
    private String tsutc;
    private String units;
    private Number value;

  public Readings(String seqnum, String ts, String tsutc, String units,
        Number value) {
      super();
      this.seqnum = seqnum;
      this.ts = ts;
      this.tsutc = tsutc;
      this.units = units;
      this.value = value;
    }
  public String getSeqnum(){
    return this.seqnum;
  }
  public void setSeqnum(String seqnum){
    this.seqnum = seqnum;
  }
  public String getTs(){
    return this.ts;
  }
  public void setTs(String ts){
    this.ts = ts;
  }
  public String getTsutc(){
    return this.tsutc;
  }
  public void setTsutc(String tsutc){
    this.tsutc = tsutc;
  }
  public String getUnits(){
    return this.units;
  }
  public void setUnits(String units){
    this.units = units;
  }
  public Number getValue(){
    return this.value;
  }
  public void setValue(Number value){
    this.value = value;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Readings other = (Readings) obj;
    if (seqnum == null) {
      if (other.seqnum != null)
        return false;
    } else if (!seqnum.equals(other.seqnum))
      return false;
    if (ts == null) {
      if (other.ts != null)
        return false;
    } else if (!ts.equals(other.ts))
      return false;
    if (tsutc == null) {
      if (other.tsutc != null)
        return false;
    } else if (!tsutc.equals(other.tsutc))
      return false;
    if (units == null) {
      if (other.units != null)
        return false;
    } else if (!units.equals(other.units))
      return false;
    if (value == null) {
      if (other.value != null)
        return false;
    } else if (!value.equals(other.value))
      return false;
    return true;
  }
}
