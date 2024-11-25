package lesson7.lecture.enums;

public enum CommandList implements Command {
	// Force all constants to implement the execute() method.
	RUN {
		public void execute() {
			System.out.println("Running...");
		}
	},
	JUMP {
		public void execute() {
			System.out.println("Jumping...");
		}
	};

}
