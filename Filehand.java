import java.util.*;
import java.io.*;

class student {
	Scanner scan = new Scanner(System.in);
	public String name;
	public int Roll;
	public String branch;
}

class RollnoException extends Exception {
	public RollnoException(String s) {
		super(s);
	}
}

public class Filehand {
	public static void main(String args[]) {
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter the number of students");
		try {
			int n = sa.nextInt();
			student[] st = new student[n];
			System.out.println("enter details of students");
			Scanner sa1 = new Scanner(System.in);
			for (int i = 0; i < n; i++) {
				st[i] = new student();
				st[i].name = sa1.next();
				st[i].branch = sa1.next();
				st[i].Roll = sa1.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (st[i].Roll == st[j].Roll) {
						throw new RollnoException("Two Roll numbers can't be equal. Duplicay must be removed");
					}
				}
			}

			File myObj = new File("java.txt");
			FileWriter myWriter = new FileWriter("java.txt", true);
			for (int i = 0; i < n; i++) {
				myWriter.write(i + 1 + ":student details " + "\n");
				myWriter.write("Name:" + st[i].name + "\n");
				myWriter.write("Branch:" + st[i].branch + "\n");
				myWriter.write("Roll:" + st[i].Roll + "\n");

			}
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();

		}

		catch (NullPointerException e) {
			System.out.println("no contents in the file");
		} catch (RollnoException ex) {
			System.out.println(ex.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("enter the details correctly");
		}
	}
}
