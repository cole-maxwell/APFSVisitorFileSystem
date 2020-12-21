package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ApfsDirectory extends ApfsElement
{
	private LinkedList<ApfsElement> apfsChildren = new LinkedList<ApfsElement>();
	private LinkedList<ApfsDirectory> apfsSubDirectories = new LinkedList<ApfsDirectory>();
	private LinkedList<ApfsFile> apfsFiles = new LinkedList<ApfsFile>();
	private LinkedList<ApfsLink> apfsLinks = new LinkedList<ApfsLink>();

	public ApfsDirectory(ApfsDirectory parent, String name, int size, LocalDateTime creationTime, ApfsElement target) {
		super(parent, name, size, creationTime, target);
	}
	public void accept(ApfsVisitor v){
		v.visit(this);
		for (ApfsElement e: apfsChildren) {
			e.accept(v);
		}
	}
	public boolean inDirectory(FSElement dir) {
		return (dir == this.parent);
	}
	public boolean isDirectory() {
		return true;
	}
	public boolean isFile() {
		return false;
	}
	public boolean isLink() {
		return false;
	}

	public void appendChild(ApfsElement child) {

		if (child.isDirectory()) {
			this.apfsSubDirectories.add((ApfsDirectory)child);
			this.apfsChildren.add(child);
			child.setParent(this);			
		} else if (child.isFile()) {
			this.apfsFiles.add((ApfsFile)child);
			this.apfsChildren.add(child);
			child.setParent(this);			
		} else {
			this.apfsLinks.add((ApfsLink)child);
			this.apfsChildren.add(child);
			child.setParent(this);
		}
	}

	public LinkedList<ApfsElement> getChildren() {
		return apfsChildren;
	}
	public LinkedList<ApfsDirectory> getSubDirectories() {
		return apfsSubDirectories;
	}
	public LinkedList<ApfsFile> getFiles() {
		return apfsFiles;
	}
	public LinkedList<ApfsLink> getLinks() {
		return apfsLinks;
	}
	public int countChildren() {
		return this.apfsChildren.size();	
	}
	public int getTotalSize() {
		
		int totalSize = 0;
	
		// for (ApfsFile ApfsFile: this.getFiles()) {
		// 	totalSize = totalSize + apfsFile.getSize();
		// }
		// for (ApfsDirectory dir: this.getSubDirectories())   {
		// 	dir.getTotalSize();
		// }
		return totalSize;	
	}
}

