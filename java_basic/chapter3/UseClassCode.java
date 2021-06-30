
class UseClassCode {

	public static void main(String[] args) {
		Student[] students = {new Student(), new Student(), new Student()};

		students[0].input("鈴木こうだい",'男',45);
		students[1].input("山田花子",'女',90);
		students[2].input("田中次郎",'男',70);

			for(Student seito : students) {
				seito.disp();
			}

	}

}
