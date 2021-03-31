package studentaverageinaclass;

import java.util.Scanner;
import average.Average;

public class StartProgram {
	public static void main(String[] args) {
		Average obj=new Average();
		int total_student=0,total_student_ipa=0,total_student_ips=0,ipa_class=0,ips_class=0,ipa_average_top=0,ips_average_top=0,average_student_top=0,average_student_bot=0,i=1,ipa_average_bot=0,ips_average_bot=0;
		float ipa_average=0,ips_average=0,average_student=0;
		System.out.println("So this program is gonna find the average of all class, \"IPA\" class, and \"IPS\" class in a school\nInput how much class in a school (Input>0)");
		Scanner scanterm = new Scanner(System.in);
		int total_class = scanterm.nextInt();
		//System.out.println(total_class);
		if(total_class<1)System.out.println("There is no class in school");
		do{
			if(total_class<1) break;
			System.out.println("Input how much student in class "+i+" (Input>0)");
			Scanner scanterm2 = new Scanner(System.in);
			int student = scanterm2.nextInt();
			if(student<1) {
				System.out.println("There is no student this class");
				student=0;
			}
			//System.out.println(student);
			System.out.println("Input the major of this class (IPA/IPS)");
			Scanner scanterm3 = new Scanner(System.in);
			String majors = scanterm3.nextLine();
			//System.out.print(majors);
			switch(majors) {
				case"IPA":
					total_student_ipa=total_student_ipa+student;
					ipa_class++;
					System.out.print("Class "+i+" is "+majors+" "+ipa_class+", and have "+student+" student");
					break;
				case"IPS":
					total_student_ips=total_student_ips+student;
					ips_class++;
					System.out.print("Class "+i+" is "+majors+" "+ips_class+", and have "+student+" student");
					break;
				default:
					System.out.println("There is no "+majors+ " class");
			}
			if(student>1) System.out.print("s");
			System.out.println(".\n");
			total_student+=student;
			total_class--;
			i++;
		} while(total_class>0);
		System.out.println("Total Student in school is "+total_student);
		average_student=obj.avg_float((float)total_student,((float)ipa_class+(float)ips_class));
		average_student_top=1+(total_student/(ipa_class+ips_class));
		average_student_bot=total_student/(ipa_class+ips_class);
		System.out.print("Average student in class is "+average_student);
		if(average_student!=average_student_bot) System.out.println(", or we can say there is about "+average_student_bot+"-"+average_student_top+" students in every class\n");
		else System.out.println(", so there is about "+average_student+" students in every class\n");
		System.out.println("There is "+ipa_class+" \"IPA\" class. Total \"IPA\" student is "+total_student_ipa);
		ipa_average=obj.avg_float((float)total_student_ipa,(float)ipa_class);
		ipa_average_bot=(int)ipa_average;
		ipa_average_top=1+(total_student_ipa/ipa_class);
		System.out.print("Average student in \"IPA\" class is "+ipa_average);
		if(ipa_average!=ipa_average_bot) System.out.println(", or we can say there is about "+ipa_average_bot+"-"+ipa_average_top+" students in \"IPA\" class\n");
		else System.out.println(", so there is about "+ipa_average+" students in \"IPA\" class\n");
		System.out.println("There is "+ips_class+" \"IPS\" class. Total \"IPS\" student is "+total_student_ips);
		ips_average=obj.avg_float((float)total_student_ips,(float)ips_class);
		ips_average_bot=(int)ips_average;
		ips_average_top=1+(total_student_ips/ips_class);
		System.out.print("Average student in \"IPS\" class is "+ips_average);
		if(ips_average!=ips_average_bot) System.out.println(", or we can say there is about "+ips_average_bot+"-"+ips_average_top+" students in \"IPS\" class\n");
		else System.out.println(", so there is about "+ips_average+" students in \"IPS\" class\n");
		System.out.println();
	}
}
