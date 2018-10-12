package chapter1;

public enum ExampleFromOCPBook {
	WINTER {

		@Override
		void hours() {
			// TODO Auto-generated method stub
			
		}

	},
	SPRING {
		public void hours() {
			System.out.println("8am - 5pm");
		}
	},	
	SUMMER {
		public void hours() {
			System.out.println("8am - 7pm");
		}
	},
	FALL {
		public void hours() {
			System.out.println("9am - 3pm");
		}
	};
	
	abstract void hours() ;
	
	private ExampleFromOCPBook() {
		
	}
}
 