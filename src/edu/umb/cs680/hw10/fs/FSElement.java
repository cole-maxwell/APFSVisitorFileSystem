package edu.umb.cs680.hw10.fs;
import edu.umb.cs680.hw10.apfs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

abstract public class FSElement
{
	protected FSElement parent;
	protected String name;
	protected int size;
	protected LocalDateTime creationTime;
	protected FSElement target;

	public FSElement(FSElement parent, String name, int size, LocalDateTime creationTime, FSElement target) {
		this.parent = parent;
		this.name = name;
		this.size = size;
		this.creationTime = creationTime;
		this.target = target;
	}
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

