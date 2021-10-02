
public class InsertOrder  implements State{

	
	TacoMachine machine;
	

	public InsertOrder(TacoMachine machine) {
		this.machine = machine;
		
	}
	
	@Override
	public void InsertOrder() {
		
		System.out.println(" InsertOrder State - Your Taco order is Inserted");
		machine.setState(machine.getInsert_order());
		
	}

	@Override
	public void Order_Progress() {
	
		System.out.println(" InsertOrder State - Your Taco is not Order");
		
	}

	@Override
	public void Order_Deleivered() {
		
		System.out.println(" InsertOrder State - Your  Taco is not ordered");
		
	}
}