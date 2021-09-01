import java.util.Date;

public class DateComparator<E> implements Comparator<FileInfo>{

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		 FileInfo f1 = (FileInfo)o1;
		 FileInfo f2 = (FileInfo)o2;
		 return f1.getModifiedDate().compareTo(f2.getModifiedDate());
	}
	

}
