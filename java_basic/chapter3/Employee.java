
class Employee {

			int empNo;
			String empName;

			Employee(int no, String name) {
				empNo = no;
				empName = name;
			}

			void dispMethod() {
				System.out.println("社員 No. " + empNo);
				System.out.println(empName);
				System.out.println();
			}

}
