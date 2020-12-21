package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ApfsFileCrawlingVisitor implements ApfsVisitor
{
	private LinkedList<ApfsFile> files = new LinkedList<ApfsFile>();

	public ApfsFileCrawlingVisitor(){};

	public void visit(ApfsLink link) {
		return;
	}
	public void visit(ApfsDirectory dir) {
		return;
	}
	public void visit(ApfsFile file) {
		files.add(file);
	}
	public LinkedList<ApfsFile> getFiles() {
		return files;
	}
}


 