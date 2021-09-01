import java.util.Date;

public class FileInfo{
	private String filename;
	private String type;
	private long size;
	private Date modifiedDate;
	 
	public FileInfo(String filename, String type, long size, Date modifiedDate) {
		super();
		this.filename = filename;
		this.type = type;
		this.size = size;
		this.modifiedDate = modifiedDate;
	}
	
	public FileInfo() {
		super();
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "FileInfo [filename=" + filename + ", type=" + type + ", size=" + size + ", modifiedDate=" + modifiedDate
				+ "]";
	}




}
