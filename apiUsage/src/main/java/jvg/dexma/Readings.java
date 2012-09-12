package jvg.dexma;

public class Readings{
    private String seqnum;
    private String ts;
    private String tsutc;
    private String units;
    private Number value;

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
}
