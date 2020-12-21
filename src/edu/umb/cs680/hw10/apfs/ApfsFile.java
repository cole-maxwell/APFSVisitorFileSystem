package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;


public class ApfsFile extends ApfsElement
{
	public ApfsFile(ApfsDirectory parent, String name, int size, LocalDateTime creationTime, ApfsElement target) {
		super(parent, name, size, creationTime, target);
	}
	public void accept(ApfsVisitor v){
		v.visit(this);
	}
	
	public boolean isDirectory() {
		return false;
	}
	public boolean isFile() {
		return true;
	}
	public boolean isLink() {
		return false;
	}
	public boolean inDirectory(FSElement dir) {
		return (dir == this.parent);
	}
	
}

