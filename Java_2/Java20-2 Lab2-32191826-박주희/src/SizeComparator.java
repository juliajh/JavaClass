
public class SizeComparator<E> implements Comparator<FileInfo>{

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		 FileInfo f1 = (FileInfo)o1;
		 FileInfo f2 = (FileInfo)o2;
		 return (int) (f1.getSize() - f2.getSize());
	}

}
