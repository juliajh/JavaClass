import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainTest {
	private static FileInfo[] fList;
	
	public static void printFileInfos(FileInfo[] fileList){
		for(var f:fileList) {
			System.out.println(f);
		}
	}
	public FileInfo getFileInfo(String filename) {  //입력한 filename에 해당하는 FileInfo객체 return
		FileInfo f=new FileInfo();
		for(int i=0;i<fList.length;i++)
		{
			if(fList[i].getFilename()==filename)
			{
				f=fList[i];
			}
		}
		return f;
	}
	public static List<FileInfo> getFileInfos(String dirPath){  
		List<FileInfo> fileinfos=new ArrayList<FileInfo>();
		File f = new File(dirPath);
		File[] files=f.listFiles();
		for(int i=0;i<files.length;i++)
		{
			if(files[i].isFile())  //파일일 경우 --> 하위 내용이 더 없을 경우
			{
				String fn=files[i].getPath();
				String type=files[i].getName().substring(files[i].getName().lastIndexOf(".")+1);
				long size=files[i].length();
				Date date=new Date(files[i].lastModified());
				FileInfo fi=new FileInfo(fn,type,size,date);
				fileinfos.add(fi);
			}
			else   //파일이 아닌 디렉토리일 경우 -> 하위 내용이 더 있는 경우
			{
				List<FileInfo> fi=getFileInfos(files[i].getPath());  //재귀함수 이용
				for(FileInfo ff:fi)
				{
					fileinfos.add(ff);
				}
			}
		}
		return fileinfos;
				
	}

	public static void main(String[] args) {
		List<FileInfo> X =getFileInfos("C:\\Users\\julia\\Desktop\\K\\컴퓨터 공학 기초");
		fList = new FileInfo[X.size()];
		for(int i = 0; i < fList.length; i++)
		{
			fList[i] = X.get(i);
		}
		
		Sorter<FileInfo> dateS=new Sorter<FileInfo>(new DateComparator<FileInfo>());
		Sorter<FileInfo> filenameS=new Sorter<FileInfo>(new FilenameComparator<FileInfo>());
		Sorter<FileInfo> sizeS=new Sorter<FileInfo>(new SizeComparator<FileInfo>());
		Sorter<FileInfo> typeS=new Sorter<FileInfo>(new TypeComparator<FileInfo>());
		
		System.out.println("original");
		printFileInfos(fList);
		
		System.out.println("\nsort by date");
		dateS.bubbleSort(fList);
		printFileInfos(fList);
		
		System.out.println("\nsort by filename");
		filenameS.bubbleSort(fList);
		printFileInfos(fList);
		
		System.out.println("\nsort by size");
		sizeS.bubbleSort(fList);
		printFileInfos(fList);
		
		System.out.println("\nsort by type");
		typeS.bubbleSort(fList);
		printFileInfos(fList);
		
		
		//mycode
		System.out.println("\nprint txt files");		
		for(int i = 0; i < fList.length; i++)
		{
			if(fList[i].getType().equals("txt"))
			{
			      try(
			    		  FileReader rw = new FileReader(fList[i].getFilename());
			              BufferedReader br = new BufferedReader( rw );)
			      {
			    	//읽을 라인이 없을 경우 br은 null을 리턴한다.
			            String readLine = null ;
			            while( ( readLine =  br.readLine()) != null )
			            {
			                System.out.println(readLine);
			            }
			            
			        }catch ( IOException e ) {
			            System.out.println(e);
			        }
			}
		}
		
		
	}  

}
