package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

abstract class ApfsElement extends FSElement
{
	public ApfsElement(FSElement parent, String name, int size, LocalDateTime creationTime, FSElement target) {
		super(parent, name, size, creationTime, target);
	}
	public void accept(ApfsVisitor v){};
	
	public FSElement getParent() {
		return parent;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public LocalDateTime getCreationTime() {
		return creationTime;
	}
	public FSElement getTarget() {
		return target;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setParent(FSElement parent) {
		this.parent = parent;
	}
	abstract public boolean isDirectory();
	abstract public boolean inDirectory(FSElement dir);
	abstract public boolean isFile();
	abstract public boolean isLink();

}

