package edu.umb.cs680.hw10.fs;
import edu.umb.cs680.hw10.apfs.*;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApfsFileSystemTest {

	@Test
	public void verifyCountingVisitorDirNum() {
        
		APFS apfs = new APFS();
        apfs.initFileSystem("new apfs", 1024);

        ApfsDirectory root = new ApfsDirectory(null, "root", 0, LocalDateTime.now(), null); 
        ApfsDirectory home = new ApfsDirectory(root, "home", 0, LocalDateTime.now(), null);
        ApfsDirectory applications = new ApfsDirectory(root, "applications", 0, LocalDateTime.now(), null);
        ApfsDirectory code = new ApfsDirectory(home, "code", 0, LocalDateTime.now(), null);
        
        ApfsFile a = new ApfsFile(null, "a.txt", 8, LocalDateTime.now(), null);
        ApfsFile b = new ApfsFile(null, "b.txt", 16, LocalDateTime.now(), null);
        ApfsFile c = new ApfsFile(null, "c.txt", 32, LocalDateTime.now(), null);
        ApfsFile d = new ApfsFile(null, "d.txt", 64, LocalDateTime.now(), null);
        ApfsFile e = new ApfsFile(null, "e.txt", 128, LocalDateTime.now(), null);
        ApfsFile f = new ApfsFile(null, "f.txt", 256, LocalDateTime.now(), null);

        ApfsLink x = new ApfsLink(home, "linkToApplications", 0, LocalDateTime.now(), applications);
        ApfsLink y = new ApfsLink(code, "linkToFileB", 0, LocalDateTime.now(), b); 

        apfs.appendRootDir(root);
        root.appendChild(applications);
        root.appendChild(home);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(x);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(y);

        ApfsCountingVisitor countingVisitor = new ApfsCountingVisitor();
        root.accept(countingVisitor);
		
		Object expected = 4;
		Object actual = countingVisitor.getDirNum();
		assertEquals(expected, actual);
	}
}