
public class FilenameComparator<E> implements Comparator<FileInfo>{

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		String o1name=o1.getFilename();
		String o2name=o2.getFilename();
		
		return o1name.compareTo(o2name);
	}
}
