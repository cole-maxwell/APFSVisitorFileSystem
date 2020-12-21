package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ApfsCountingVisitor implements ApfsVisitor
{
	private int dirNum = 0;
	private int fileNum = 0;
	private int linkNum = 0;

	public ApfsCountingVisitor(){};

	public void visit(ApfsLink link) {
		linkNum++;
	}
	public void visit(ApfsDirectory dir) {
		dirNum++;
	}
	public void visit(ApfsFile file) {
		fileNum++;
	}
	public int getDirNum() {
		return dirNum;
	}
	public int getFileNum() {
		return fileNum;
	}
	public int getLinkNum() {
		return linkNum;
	}
}


 