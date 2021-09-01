
public class TypeComparator<E> implements Comparator<FileInfo>{

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		 FileInfo f1 = (FileInfo)o1;
		 FileInfo f2 = (FileInfo)o2;
		 return f1.getType().compareToIgnoreCase(f2.getType());		
	}

}
