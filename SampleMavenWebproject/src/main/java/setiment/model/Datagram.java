package setiment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Datagram")
public class Datagram implements Serializable{
	
	   @Id @GeneratedValue
	   @Column(name = "id")
	   private int id;

	   @Column(name = "DatagramID")
	   private String datagramID;

	   @Column(name = "DatagramText")
	   private String datagramText;

	   @Column(name = "Timestamp")
	   private long timestamp;  
	   
//	   @Lob
//	   @Column(name = "DatagramBlob")
//	   private byte[] datagramBlob;
	   
	   
	   
	   

	   public Datagram(String datagramID, String datagramText, long ts, byte[] blob) {
		   //this.datagramBlob=blob;
		   this.datagramID=datagramID;
		   this.datagramText = datagramText;
		   this.timestamp = ts;
	   }



//	public byte[] getDatagramBlob() {
//		return datagramBlob;
//	}
//
//
//
//	public void setDatagramBlob(byte[] datagramBlob) {
//		this.datagramBlob = datagramBlob;
//	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDatagramID() {
		return datagramID;
	}



	public void setDatagramID(String datagramID) {
		this.datagramID = datagramID;
	}



	public String getDatagramText() {
		return datagramText;
	}



	public void setDatagramText(String datagramText) {
		this.datagramText = datagramText;
	}



	public long getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}



	
	   
	   
	   
}
