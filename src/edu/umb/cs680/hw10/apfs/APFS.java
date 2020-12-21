package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class APFS extends FileSystem
{
	private ApfsDirectory root;

	public APFS(String name, int capacity) {
		super(name, capacity);
	}
	public FSElement createDeafultRoot() {
		ApfsDirectory root = new ApfsDirectory(null, "default root directory", 0, LocalDateTime.now(), null);
		this.root = root;
		return root;
	}
	public ApfsDirectory getRootDir() {
		return this.root;
	}
	public int getTotalSize() {
		return 0;
	}
	public void appendRootDir(ApfsDirectory root) {
		this.root = root;
	}
}

