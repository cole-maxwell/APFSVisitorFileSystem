package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ApfsLink extends ApfsElement
{
	public ApfsLink(ApfsDirectory parent, String name, int size, LocalDateTime creationTime, ApfsElement target) {
		super(parent, name, size, creationTime, target);
	}
	public boolean inDirectory(FSElement dir) {
		return (dir == this.parent);
	}
	public boolean isDirectory() {
		return false;
	}
	public boolean isFile() {
		return false;
	}
	public boolean isLink() {
		return true;
	}
}


 