package composition;

public class initComposition {

	public static void main(String[] args) {
		Folder phalcon = new Folder(".phalcon", new File[0], new Folder[0]);
		Folder[] appSubFolders = {
				new Folder("config", new File[0], new Folder[0]),
				new Folder("controllers", new File[0], new Folder[0]),
				new Folder("library", new File[0], new Folder[0]),
				new Folder("migrations", new File[0], new Folder[0]),
				new Folder("models", new File[0], new Folder[0]),
				new Folder("views", new File[0], new Folder[0])
		};

		Folder app = new Folder("app", new File[0], appSubFolders);
		Folder cache = new Folder("cache", new File[0], new Folder[0]);
		Folder publicFolder = new Folder("public", new File[] {
				new File(".htaccess"),
				new File(".htrouter.php"),
				new File("index.htm")
		}, new Folder[0]);

		Folder[] sourceFileSubFolders = {
            phalcon, 
            app, 
            cache, 
            publicFolder 
        };

		Folder sourceFiles = new Folder("Source Files", new File[0], sourceFileSubFolders);
        
		Folder includePath = new Folder("Include Path", new File[0], new Folder[0]);
		Folder remoteFiles = new Folder("Remote Files", new File[0], new Folder[0]);

		Folder phpDemo1 = new Folder("php_demo1", 
			new File[0], 
			new Folder[] { sourceFiles, includePath, remoteFiles }
        );

		System.out.println("Full structure:");
		phpDemo1.print();

		// Delete app folder
		sourceFiles.deleteSubFolder("app");
		System.out.println("\nAfter deleting app folder:");
		phpDemo1.print();

		// Delete public folder
		sourceFiles.deleteSubFolder("public");
		System.out.println("\nAfter deleting public folder:");
		phpDemo1.print();
	}
}
