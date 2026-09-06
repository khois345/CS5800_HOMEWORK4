package composition;

public class Folder {
	private String name;
	private File[] files;
	private Folder[] subFolders;

	// Constructor
	public Folder(String name, File[] files, Folder[] subFolders) {
		setName(name);
		setFiles(files);
		setSubFolders(subFolders);
	}


	// Accessors
	public String getName() {
		return name;
	}

	public File[] getFiles() {
		return files;
	}

	public Folder[] getSubFolders() {
		return subFolders;
	}


	// Mutators
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.err.println("Folder name cannot be blank");
			return;
		}
        
		this.name = name;
	}

	public void setFiles(File[] files) {
		if (files == null) {
			System.err.println("Files cannot be null");
			return;
		}

		this.files = files;
	}

	public void setSubFolders(Folder[] subFolders) {
		if (subFolders == null) {
			System.err.println("Sub-folders cannot be null");
			return;
		}

		this.subFolders = subFolders;
	}


	// Other functions
    // recursive print for file and subfolders printing if provided with a folder name
	public void print() {
		print("", "");
	}

	private void print(String prefix, String indentation) {
		System.out.println(prefix + name + " (folder)");

		for (Folder folder : subFolders) {
			folder.print(indentation + "|-- ", indentation + "|   ");
		}

		for (File file : files) {
			System.out.println(indentation + "|-- " + file.getName() + " (file)");
		}
	}

	public void deleteSubFolder(String folderName) {
		for (int i = 0; i < subFolders.length; i++) {
			if (subFolders[i].getName().equals(folderName)) {
				Folder[] remainingFolders = new Folder[subFolders.length - 1];
				for (int j = 0; j < i; j++) {
					remainingFolders[j] = subFolders[j];
				}
				for (int j = i; j < subFolders.length - 1; j++) {
					remainingFolders[j] = subFolders[j + 1];
				}
				subFolders = remainingFolders;
                
				return;
			}
		}
	}
}
