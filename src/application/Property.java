package application;

public class Property {

	private String property_id;
	private String address;
	private String room;
	private long price;
	private String property_type;
	private String sale_or_rent;
	private String property_size;

	
	public Property() {
		this.property_id= "";
		this.address= "";
		this.room= "";
		this.price= 0;
		this.property_type= "";
		this.sale_or_rent= "";
		this.property_size = "";
	}
	
	public Property(String property_id,String address,String room,long price,String property_type,String sale_or_rent,String property_size) {
		this.property_id= property_id;
		this.address=address;
		this.room= room;
		this.price= price;
		this.property_type= property_type;
		this.sale_or_rent= sale_or_rent;
		this.property_size = property_size;
	}

	public String getProperty_id() {
		return property_id;
	}

	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getProperty_type() {
		return property_type;
	}

	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}

	public String getSale_or_rent() {
		return sale_or_rent;
	}

	public void setSale_or_rent(String sale_or_rent) {
		this.sale_or_rent = sale_or_rent;
	}

	public String getProperty_size() {
		return property_size;
	}

	public void setProperty_size(String property_size) {
		this.property_size = property_size;
	}
	
	
	
}
