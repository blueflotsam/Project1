package obj;


public class reimbursment {
		private int id;
		private char grade;
		private String type;
		private float amount;
		private String status;
		private int age;
		private String info;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public char getGrade() {
			return grade;
		}
		public void setGrade(char grade) {
			this.grade = grade;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
		public reimbursment(int id, char grade, String type, float amount, String status, int age, String info) {
			super();
			this.id = id;
			this.grade = grade;
			this.type = type;
			this.amount = amount;
			this.status = status;
			this.age = age;
			this.info = info;
		}

}
