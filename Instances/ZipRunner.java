class ZipRunner{
public static void main(String[] args){

	    Zip instance1=new Zip();
		Zip instance2=new Zip();
		Zip instance3=new Zip();
		Zip instance4=new Zip();
		Zip instance5=new Zip();
		Zip instance6=new Zip();
		Zip instance7=new Zip();
		Zip instance8=new Zip();
		Zip instance9=new Zip();
		Zip instance10=new Zip();
		
		System.out.println("\nInstance1 values");
        System.out.println("password:" + instance1.password);
        System.out.println("isSplitArchive: " + instance1.isSplitArchive);
        System.out.println("numberOfParts: " + instance1.numberOfParts);
        System.out.println("compressedSize: " + instance1.compressedSize);
        System.out.println("compressionMethod: " + instance1.compressionMethod);

        System.out.println("\nInstance2 values");
        System.out.println("password:"+ instance2.password);
        System.out.println("isSplitArchive: " + instance2.isSplitArchive);
        System.out.println("numberOfParts: " + instance2.numberOfParts);
        System.out.println("compressedSize: " + instance2.compressedSize);
        System.out.println("compressionMethod: " + instance2.compressionMethod);

        System.out.println("\nInstance3 values");
        System.out.println("password: " + instance3.password);
        System.out.println("isSplitArchive: " + instance3.isSplitArchive);
        System.out.println("numberOfParts: " + instance3.numberOfParts);
        System.out.println("compressedSize: " + instance3.compressedSize);
        System.out.println("compressionMethod: " + instance3.compressionMethod);

        System.out.println("\nInstance4 values");
        System.out.println("password: " + instance4.password);
        System.out.println("isSplitArchive: " + instance4.isSplitArchive);
        System.out.println("numberOfParts: " + instance4.numberOfParts);
        System.out.println("compressedSize: " + instance4.compressedSize);
        System.out.println("compressionMethod: " + instance4.compressionMethod);

        System.out.println("\nInstance5 values");
        System.out.println("password: " + instance5.password);
        System.out.println("isSplitArchive: " + instance5.isSplitArchive);
        System.out.println("numberOfParts: " + instance5.numberOfParts);
        System.out.println("compressedSize: " + instance5.compressedSize);
        System.out.println("compressionMethod: " + instance5.compressionMethod);
		
		System.out.println("\nInstance6 values");
        System.out.println("password: " + instance1.password);
        System.out.println("isSplitArchive: " + instance1.isSplitArchive);
        System.out.println("numberOfParts: " + instance1.numberOfParts);
        System.out.println("compressedSize: " + instance1.compressedSize);
        System.out.println("compressionMethod: " + instance1.compressionMethod);

        System.out.println("\nInstance7 values");
        System.out.println("password: " + instance2.password);
        System.out.println("isSplitArchive: " + instance2.isSplitArchive);
        System.out.println("numberOfParts: " + instance2.numberOfParts);
        System.out.println("compressedSize: " + instance2.compressedSize);
        System.out.println("compressionMethod: " + instance2.compressionMethod);

        System.out.println("\nInstance8 values");
        System.out.println("password: " + instance3.password);
        System.out.println("isSplitArchive: " + instance3.isSplitArchive);
        System.out.println("numberOfParts: " + instance3.numberOfParts);
        System.out.println("compressedSize: " + instance3.compressedSize);
        System.out.println("compressionMethod: " + instance3.compressionMethod);

        System.out.println("\nInstance9 values");
        System.out.println("password: " + instance4.password);
        System.out.println("isSplitArchive: " + instance4.isSplitArchive);
        System.out.println("numberOfParts: " + instance4.numberOfParts);
        System.out.println("compressedSize: " + instance4.compressedSize);
        System.out.println("compressionMethod: " + instance4.compressionMethod);

        System.out.println("\nInstance10 values");
        System.out.println("password: " + instance5.password);
        System.out.println("isSplitArchive: " + instance5.isSplitArchive);
        System.out.println("numberOfParts: " + instance5.numberOfParts);
        System.out.println("compressedSize: " + instance5.compressedSize);
        System.out.println("compressionMethod: " + instance5.compressionMethod);

		
		instance1.fileName = "file1.zip";
		instance1.size = 120.5;
		instance1.compressionRatio = 2.5f;
		instance1.numberOfFiles = 10;
		instance1.isEncrypted = true;
		instance1.isCorrupted = false;
		instance1.grade = 'A';
		instance1.creationYear = 2023;
		instance1.extractionTime = 5;
		instance1.type = "Archive";

		System.out.println("\nInstance1 values");
		System.out.println("fileName: " + instance1.fileName);
		System.out.println("size: " + instance1.size);
		System.out.println("compressionRatio: " + instance1.compressionRatio);
		System.out.println("numberOfFiles: " + instance1.numberOfFiles);
		System.out.println("isEncrypted: " + instance1.isEncrypted);
		System.out.println("isCorrupted: " + instance1.isCorrupted);
		System.out.println("grade: " + instance1.grade);
		System.out.println("creationYear: " + instance1.creationYear);
		System.out.println("extractionTime: " + instance1.extractionTime);
		System.out.println("type: " + instance1.type);


		instance2.fileName = "backup.zip";
		instance2.size = 250.0;
		instance2.compressionRatio = 3.0f;
		instance2.numberOfFiles = 25;
		instance2.isEncrypted = false;
		instance2.isCorrupted = false;
		instance2.grade = 'A';
		instance2.creationYear = 2022;
		instance2.extractionTime = 8;
		instance2.type = "Backup";

		System.out.println("\nInstance2 values");
		System.out.println("fileName: " + instance2.fileName);
		System.out.println("size: " + instance2.size);
		System.out.println("compressionRatio: " + instance2.compressionRatio);
		System.out.println("numberOfFiles: " + instance2.numberOfFiles);
		System.out.println("isEncrypted: " + instance2.isEncrypted);
		System.out.println("isCorrupted: " + instance2.isCorrupted);
		System.out.println("grade: " + instance2.grade);
		System.out.println("creationYear: " + instance2.creationYear);
		System.out.println("extractionTime: " + instance2.extractionTime);
		System.out.println("type: " + instance2.type);


		instance3.fileName = "images.zip";
		instance3.size = 90.3;
		instance3.compressionRatio = 2.0f;
		instance3.numberOfFiles = 50;
		instance3.isEncrypted = true;
		instance3.isCorrupted = false;
		instance3.grade = 'B';
		instance3.creationYear = 2024;
		instance3.extractionTime = 6;
		instance3.type = "Media";

		System.out.println("\nInstance3 values");
		System.out.println("fileName: " + instance3.fileName);
		System.out.println("size: " + instance3.size);
		System.out.println("compressionRatio: " + instance3.compressionRatio);
		System.out.println("numberOfFiles: " + instance3.numberOfFiles);
		System.out.println("isEncrypted: " + instance3.isEncrypted);
		System.out.println("isCorrupted: " + instance3.isCorrupted);
		System.out.println("grade: " + instance3.grade);
		System.out.println("creationYear: " + instance3.creationYear);
		System.out.println("extractionTime: " + instance3.extractionTime);
		System.out.println("type: " + instance3.type);


		instance4.fileName = "docs.zip";
		instance4.size = 45.0;
		instance4.compressionRatio = 1.8f;
		instance4.numberOfFiles = 15;
		instance4.isEncrypted = false;
		instance4.isCorrupted = true;
		instance4.grade = 'C';
		instance4.creationYear = 2021;
		instance4.extractionTime = 4;
		instance4.type = "Document";

		System.out.println("\nInstance4 values");
		System.out.println("fileName: " + instance4.fileName);
		System.out.println("size: " + instance4.size);
		System.out.println("compressionRatio: " + instance4.compressionRatio);
		System.out.println("numberOfFiles: " + instance4.numberOfFiles);
		System.out.println("isEncrypted: " + instance4.isEncrypted);
		System.out.println("isCorrupted: " + instance4.isCorrupted);
		System.out.println("grade: " + instance4.grade);
		System.out.println("creationYear: " + instance4.creationYear);
		System.out.println("extractionTime: " + instance4.extractionTime);
		System.out.println("type: " + instance4.type);


		instance5.fileName = "videos.zip";
		instance5.size = 1024.5;
		instance5.compressionRatio = 4.5f;
		instance5.numberOfFiles = 5;
		instance5.isEncrypted = true;
		instance5.isCorrupted = false;
		instance5.grade = 'A';
		instance5.creationYear = 2025;
		instance5.extractionTime = 15;
		instance5.type = "Media";

		System.out.println("\nInstance5 values");
		System.out.println("fileName: " + instance5.fileName);
		System.out.println("size: " + instance5.size);
		System.out.println("compressionRatio: " + instance5.compressionRatio);
		System.out.println("numberOfFiles: " + instance5.numberOfFiles);
		System.out.println("isEncrypted: " + instance5.isEncrypted);
		System.out.println("isCorrupted: " + instance5.isCorrupted);
		System.out.println("grade: " + instance5.grade);
		System.out.println("creationYear: " + instance5.creationYear);
		System.out.println("extractionTime: " + instance5.extractionTime);
		System.out.println("type: " + instance5.type);


		instance6.fileName = "music.zip";
		instance6.size = 300.0;
		instance6.compressionRatio = 3.2f;
		instance6.numberOfFiles = 40;
		instance6.isEncrypted = false;
		instance6.isCorrupted = false;
		instance6.grade = 'B';
		instance6.creationYear = 2020;
		instance6.extractionTime = 10;
		instance6.type = "Media";

		System.out.println("\nInstance6 values");
		System.out.println("fileName: " + instance6.fileName);
		System.out.println("size: " + instance6.size);
		System.out.println("compressionRatio: " + instance6.compressionRatio);
		System.out.println("numberOfFiles: " + instance6.numberOfFiles);
		System.out.println("isEncrypted: " + instance6.isEncrypted);
		System.out.println("isCorrupted: " + instance6.isCorrupted);
		System.out.println("grade: " + instance6.grade);
		System.out.println("creationYear: " + instance6.creationYear);
		System.out.println("extractionTime: " + instance6.extractionTime);
		System.out.println("type: " + instance6.type);


		instance7.fileName = "projects.zip";
		instance7.size = 500.0;
		instance7.compressionRatio = 3.8f;
		instance7.numberOfFiles = 60;
		instance7.isEncrypted = true;
		instance7.isCorrupted = false;
		instance7.grade = 'A';
		instance7.creationYear = 2023;
		instance7.extractionTime = 12;
		instance7.type = "Backup";

		System.out.println("\nInstance7 values");
		System.out.println("fileName: " + instance7.fileName);
		System.out.println("size: " + instance7.size);
		System.out.println("compressionRatio: " + instance7.compressionRatio);
		System.out.println("numberOfFiles: " + instance7.numberOfFiles);
		System.out.println("isEncrypted: " + instance7.isEncrypted);
		System.out.println("isCorrupted: " + instance7.isCorrupted);
		System.out.println("grade: " + instance7.grade);
		System.out.println("creationYear: " + instance7.creationYear);
		System.out.println("extractionTime: " + instance7.extractionTime);
		System.out.println("type: " + instance7.type);


		instance8.fileName = "data.zip";
		instance8.size = 200.0;
		instance8.compressionRatio = 2.7f;
		instance8.numberOfFiles = 30;
		instance8.isEncrypted = false;
		instance8.isCorrupted = false;
		instance8.grade = 'B';
		instance8.creationYear = 2022;
		instance8.extractionTime = 9;
		instance8.type = "Archive";

		System.out.println("\nInstance8 values");
		System.out.println("fileName: " + instance8.fileName);
		System.out.println("size: " + instance8.size);
		System.out.println("compressionRatio: " + instance8.compressionRatio);
		System.out.println("numberOfFiles: " + instance8.numberOfFiles);
		System.out.println("isEncrypted: " + instance8.isEncrypted);
		System.out.println("isCorrupted: " + instance8.isCorrupted);
		System.out.println("grade: " + instance8.grade);
		System.out.println("creationYear: " + instance8.creationYear);
		System.out.println("extractionTime: " + instance8.extractionTime);
		System.out.println("type: " + instance8.type);


		instance9.fileName = "system.zip";
		instance9.size = 750.0;
		instance9.compressionRatio = 4.0f;
		instance9.numberOfFiles = 70;
		instance9.isEncrypted = true;
		instance9.isCorrupted = false;
		instance9.grade = 'A';
		instance9.creationYear = 2024;
		instance9.extractionTime = 14;
		instance9.type = "System";

		System.out.println("\nInstance9 values");
		System.out.println("fileName: " + instance9.fileName);
		System.out.println("size: " + instance9.size);
		System.out.println("compressionRatio: " + instance9.compressionRatio);
		System.out.println("numberOfFiles: " + instance9.numberOfFiles);
		System.out.println("isEncrypted: " + instance9.isEncrypted);
		System.out.println("isCorrupted: " + instance9.isCorrupted);
		System.out.println("grade: " + instance9.grade);
		System.out.println("creationYear: " + instance9.creationYear);
		System.out.println("extractionTime: " + instance9.extractionTime);
		System.out.println("type: " + instance9.type);


		instance10.fileName = "old.zip";
		instance10.size = 20.0;
		instance10.compressionRatio = 1.5f;
		instance10.numberOfFiles = 5;
		instance10.isEncrypted = false;
		instance10.isCorrupted = true;
		instance10.grade = 'C';
		instance10.creationYear = 2019;
		instance10.extractionTime = 3;
		instance10.type = "Archive";

		System.out.println("\nInstance10 values");
		System.out.println("fileName: " + instance10.fileName);
		System.out.println("size: " + instance10.size);
		System.out.println("compressionRatio: " + instance10.compressionRatio);
		System.out.println("numberOfFiles: " + instance10.numberOfFiles);
		System.out.println("isEncrypted: " + instance10.isEncrypted);
		System.out.println("isCorrupted: " + instance10.isCorrupted);
		System.out.println("grade: " + instance10.grade);
		System.out.println("creationYear: " + instance10.creationYear);
		System.out.println("extractionTime: " + instance10.extractionTime);
		System.out.println("type: " + instance10.type);
		
		
		

}
}