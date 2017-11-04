package Questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3Collections {

	/**
	 * Collection task
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FilePath = "./src/test/resources/TestData/Dictionary.txt";
		File inputFile = new File(FilePath);

		try {
			doesFileExist(inputFile);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist");
		}

	}

	public static void doesFileExist(File inputFile) throws FileNotFoundException {
		Scanner in = new Scanner(inputFile);

		if (inputFile.exists()) {
			System.out.println("File exists");

			Map<String, String> map = new HashMap<String, String>();

			while (in.hasNextLine()) {
				String[] columns = in.nextLine().split(" ", 2);
				map.put(columns[0], columns[1].substring(1));
			}

			System.out.println(map);

			for (String key : map.keySet()) {

				String definitions[] = map.get(key).split(",");
				System.out.println("Word: " + key);
				System.out.println("Meaning: " + definitions[0]);

				try {
					System.out.println("Meaning " + definitions[1]);

				} catch (Exception e) {
					// TODO: handle exception

				}

			}

		}
	}

}
